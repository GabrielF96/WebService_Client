package webService;

public class ExameWSProxy implements webService.ExameWS {
  private String _endpoint = null;
  private webService.ExameWS exameWS = null;
  
  public ExameWSProxy() {
    _initExameWSProxy();
  }
  
  public ExameWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initExameWSProxy();
  }
  
  private void _initExameWSProxy() {
    try {
      exameWS = (new webService.ExameWSServiceLocator()).getExameWS();
      if (exameWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)exameWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)exameWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (exameWS != null)
      ((javax.xml.rpc.Stub)exameWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webService.ExameWS getExameWS() {
    if (exameWS == null)
      _initExameWSProxy();
    return exameWS;
  }
  
  public models.Exame getExame(long id) throws java.rmi.RemoteException{
    if (exameWS == null)
      _initExameWSProxy();
    return exameWS.getExame(id);
  }
  
  
}