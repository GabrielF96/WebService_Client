/**
 * ExameWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webService;

public interface ExameWSService extends javax.xml.rpc.Service {
    public java.lang.String getExameWSAddress();

    public webService.ExameWS getExameWS() throws javax.xml.rpc.ServiceException;

    public webService.ExameWS getExameWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
