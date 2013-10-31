/**
 * ServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.tecnotrends.webservices;

public class ServicesLocator extends org.apache.axis.client.Service implements br.com.tecnotrends.webservices.Services {

    public ServicesLocator() {
    }


    public ServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicesSoap12
    private java.lang.String ServicesSoap12_address = "http://saubara.bahiana.intranet/PortalDispatcher/Services.asmx";

    public java.lang.String getServicesSoap12Address() {
        return ServicesSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicesSoap12WSDDServiceName = "ServicesSoap12";

    public java.lang.String getServicesSoap12WSDDServiceName() {
        return ServicesSoap12WSDDServiceName;
    }

    public void setServicesSoap12WSDDServiceName(java.lang.String name) {
        ServicesSoap12WSDDServiceName = name;
    }

    public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicesSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicesSoap12(endpoint);
    }

    public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.tecnotrends.webservices.ServicesSoap12Stub _stub = new br.com.tecnotrends.webservices.ServicesSoap12Stub(portAddress, this);
            _stub.setPortName(getServicesSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicesSoap12EndpointAddress(java.lang.String address) {
        ServicesSoap12_address = address;
    }


    // Use to get a proxy class for ServicesSoap
    private java.lang.String ServicesSoap_address = "http://saubara.bahiana.intranet/PortalDispatcher/Services.asmx";

    public java.lang.String getServicesSoapAddress() {
        return ServicesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicesSoapWSDDServiceName = "ServicesSoap";

    public java.lang.String getServicesSoapWSDDServiceName() {
        return ServicesSoapWSDDServiceName;
    }

    public void setServicesSoapWSDDServiceName(java.lang.String name) {
        ServicesSoapWSDDServiceName = name;
    }

    public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicesSoap(endpoint);
    }

    public br.com.tecnotrends.webservices.ServicesSoap getServicesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.tecnotrends.webservices.ServicesSoapStub _stub = new br.com.tecnotrends.webservices.ServicesSoapStub(portAddress, this);
            _stub.setPortName(getServicesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicesSoapEndpointAddress(java.lang.String address) {
        ServicesSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.tecnotrends.webservices.ServicesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.tecnotrends.webservices.ServicesSoap12Stub _stub = new br.com.tecnotrends.webservices.ServicesSoap12Stub(new java.net.URL(ServicesSoap12_address), this);
                _stub.setPortName(getServicesSoap12WSDDServiceName());
                return _stub;
            }
            if (br.com.tecnotrends.webservices.ServicesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.tecnotrends.webservices.ServicesSoapStub _stub = new br.com.tecnotrends.webservices.ServicesSoapStub(new java.net.URL(ServicesSoap_address), this);
                _stub.setPortName(getServicesSoapWSDDServiceName());
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
        if ("ServicesSoap12".equals(inputPortName)) {
            return getServicesSoap12();
        }
        else if ("ServicesSoap".equals(inputPortName)) {
            return getServicesSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "Services");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "ServicesSoap12"));
            ports.add(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "ServicesSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicesSoap12".equals(portName)) {
            setServicesSoap12EndpointAddress(address);
        }
        else 
if ("ServicesSoap".equals(portName)) {
            setServicesSoapEndpointAddress(address);
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
