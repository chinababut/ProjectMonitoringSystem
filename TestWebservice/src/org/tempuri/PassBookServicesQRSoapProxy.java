package org.tempuri;

public class PassBookServicesQRSoapProxy implements org.tempuri.PassBookServicesQRSoap {
  private String _endpoint = null;
  private org.tempuri.PassBookServicesQRSoap passBookServicesQRSoap = null;
  
  public PassBookServicesQRSoapProxy() {
    _initPassBookServicesQRSoapProxy();
  }
  
  public PassBookServicesQRSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPassBookServicesQRSoapProxy();
  }
  
  private void _initPassBookServicesQRSoapProxy() {
    try {
      passBookServicesQRSoap = (new org.tempuri.PassBookServicesQRLocator()).getPassBookServicesQRSoap();
      if (passBookServicesQRSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)passBookServicesQRSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)passBookServicesQRSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (passBookServicesQRSoap != null)
      ((javax.xml.rpc.Stub)passBookServicesQRSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.PassBookServicesQRSoap getPassBookServicesQRSoap() {
    if (passBookServicesQRSoap == null)
      _initPassBookServicesQRSoapProxy();
    return passBookServicesQRSoap;
  }
  
  public org.tempuri.Result getPattadarDetails_ByKhataNo(int dCode, int mCode, int vCode, java.lang.String khataNoORAadhaarno, java.lang.String uid, java.lang.String pwd) throws java.rmi.RemoteException{
    if (passBookServicesQRSoap == null)
      _initPassBookServicesQRSoapProxy();
    return passBookServicesQRSoap.getPattadarDetails_ByKhataNo(dCode, mCode, vCode, khataNoORAadhaarno, uid, pwd);
  }
  
  
}