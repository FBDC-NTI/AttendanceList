/**
 * AttendanceListServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.edu.bahiana.attendancelist.service;

public class AttendanceListServiceServiceLocator extends org.apache.axis.client.Service implements br.edu.bahiana.attendancelist.service.AttendanceListServiceService {

    public AttendanceListServiceServiceLocator() {
    }


    public AttendanceListServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AttendanceListServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AttendanceListService
    private java.lang.String AttendanceListService_address = "http://localhost:8080/br.edu.bahiana.attendancelist.service/services/AttendanceListService";

    public java.lang.String getAttendanceListServiceAddress() {
        return AttendanceListService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AttendanceListServiceWSDDServiceName = "AttendanceListService";

    public java.lang.String getAttendanceListServiceWSDDServiceName() {
        return AttendanceListServiceWSDDServiceName;
    }

    public void setAttendanceListServiceWSDDServiceName(java.lang.String name) {
        AttendanceListServiceWSDDServiceName = name;
    }

    public br.edu.bahiana.attendancelist.service.AttendanceListService getAttendanceListService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AttendanceListService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAttendanceListService(endpoint);
    }

    public br.edu.bahiana.attendancelist.service.AttendanceListService getAttendanceListService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.edu.bahiana.attendancelist.service.AttendanceListServiceSoapBindingStub _stub = new br.edu.bahiana.attendancelist.service.AttendanceListServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAttendanceListServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAttendanceListServiceEndpointAddress(java.lang.String address) {
        AttendanceListService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.edu.bahiana.attendancelist.service.AttendanceListService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.edu.bahiana.attendancelist.service.AttendanceListServiceSoapBindingStub _stub = new br.edu.bahiana.attendancelist.service.AttendanceListServiceSoapBindingStub(new java.net.URL(AttendanceListService_address), this);
                _stub.setPortName(getAttendanceListServiceWSDDServiceName());
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
        if ("AttendanceListService".equals(inputPortName)) {
            return getAttendanceListService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.attendancelist.bahiana.edu.br", "AttendanceListServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.attendancelist.bahiana.edu.br", "AttendanceListService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AttendanceListService".equals(portName)) {
            setAttendanceListServiceEndpointAddress(address);
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
