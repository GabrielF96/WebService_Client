/**
 * ExameWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webService;

public class ExameWSServiceLocator extends org.apache.axis.client.Service implements webService.ExameWSService {

    public ExameWSServiceLocator() {
    }


    public ExameWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExameWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExameWS
    private java.lang.String ExameWS_address = "http://localhost:8080/ExamesProject/services/ExameWS";

    public java.lang.String getExameWSAddress() {
        return ExameWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExameWSWSDDServiceName = "ExameWS";

    public java.lang.String getExameWSWSDDServiceName() {
        return ExameWSWSDDServiceName;
    }

    public void setExameWSWSDDServiceName(java.lang.String name) {
        ExameWSWSDDServiceName = name;
    }

    public webService.ExameWS getExameWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExameWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExameWS(endpoint);
    }

    public webService.ExameWS getExameWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webService.ExameWSSoapBindingStub _stub = new webService.ExameWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getExameWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExameWSEndpointAddress(java.lang.String address) {
        ExameWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webService.ExameWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webService.ExameWSSoapBindingStub _stub = new webService.ExameWSSoapBindingStub(new java.net.URL(ExameWS_address), this);
                _stub.setPortName(getExameWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ExameWS".equals(inputPortName)) {
            return getExameWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webService", "ExameWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webService", "ExameWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExameWS".equals(portName)) {
            setExameWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
