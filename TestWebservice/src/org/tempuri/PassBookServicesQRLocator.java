/**
 * PassBookServicesQRLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PassBookServicesQRLocator extends org.apache.axis.client.Service implements org.tempuri.PassBookServicesQR {

    public PassBookServicesQRLocator() {
    }


    public PassBookServicesQRLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PassBookServicesQRLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PassBookServicesQRSoap
    private java.lang.String PassBookServicesQRSoap_address = "http://uatwebland.ap.gov.in/passbookservicesqr.asmx";

    public java.lang.String getPassBookServicesQRSoapAddress() {
        return PassBookServicesQRSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PassBookServicesQRSoapWSDDServiceName = "PassBookServicesQRSoap";

    public java.lang.String getPassBookServicesQRSoapWSDDServiceName() {
        return PassBookServicesQRSoapWSDDServiceName;
    }

    public void setPassBookServicesQRSoapWSDDServiceName(java.lang.String name) {
        PassBookServicesQRSoapWSDDServiceName = name;
    }

    public org.tempuri.PassBookServicesQRSoap getPassBookServicesQRSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PassBookServicesQRSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPassBookServicesQRSoap(endpoint);
    }

    public org.tempuri.PassBookServicesQRSoap getPassBookServicesQRSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.PassBookServicesQRSoapStub _stub = new org.tempuri.PassBookServicesQRSoapStub(portAddress, this);
            _stub.setPortName(getPassBookServicesQRSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPassBookServicesQRSoapEndpointAddress(java.lang.String address) {
        PassBookServicesQRSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.PassBookServicesQRSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.PassBookServicesQRSoapStub _stub = new org.tempuri.PassBookServicesQRSoapStub(new java.net.URL(PassBookServicesQRSoap_address), this);
                _stub.setPortName(getPassBookServicesQRSoapWSDDServiceName());
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
        if ("PassBookServicesQRSoap".equals(inputPortName)) {
            return getPassBookServicesQRSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "PassBookServicesQR");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "PassBookServicesQRSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PassBookServicesQRSoap".equals(portName)) {
            setPassBookServicesQRSoapEndpointAddress(address);
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
