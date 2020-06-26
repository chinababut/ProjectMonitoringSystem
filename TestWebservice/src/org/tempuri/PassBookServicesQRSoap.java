/**
 * PassBookServicesQRSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface PassBookServicesQRSoap extends java.rmi.Remote {

    /**
     * Get getPattadarDetails_ByKhataNo
     */
    public org.tempuri.Result getPattadarDetails_ByKhataNo(int dCode, int mCode, int vCode, java.lang.String khataNoORAadhaarno, java.lang.String uid, java.lang.String pwd) throws java.rmi.RemoteException;
}
