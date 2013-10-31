/**
 * Services.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.tecnotrends.webservices;

public interface Services extends javax.xml.rpc.Service {
    public java.lang.String getServicesSoap12Address();

    public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap12() throws javax.xml.rpc.ServiceException;

    public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getServicesSoapAddress();

    public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap() throws javax.xml.rpc.ServiceException;

    public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
