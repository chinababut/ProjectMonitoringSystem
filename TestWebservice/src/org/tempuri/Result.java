/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Result  implements java.io.Serializable {
    private PPB_pkg.PPB ppbstruct;

    private java.lang.String mobileno;

    private java.lang.String aadharno;

    private java.lang.String gender;

    private java.lang.String qrcodeurl;

    private java.lang.String status;

    public Result() {
    }

    public Result(
           PPB_pkg.PPB ppbstruct,
           java.lang.String mobileno,
           java.lang.String aadharno,
           java.lang.String gender,
           java.lang.String qrcodeurl,
           java.lang.String status) {
           this.ppbstruct = ppbstruct;
           this.mobileno = mobileno;
           this.aadharno = aadharno;
           this.gender = gender;
           this.qrcodeurl = qrcodeurl;
           this.status = status;
    }


    /**
     * Gets the ppbstruct value for this Result.
     * 
     * @return ppbstruct
     */
    public PPB_pkg.PPB getPpbstruct() {
        return ppbstruct;
    }


    /**
     * Sets the ppbstruct value for this Result.
     * 
     * @param ppbstruct
     */
    public void setPpbstruct(PPB_pkg.PPB ppbstruct) {
        this.ppbstruct = ppbstruct;
    }


    /**
     * Gets the mobileno value for this Result.
     * 
     * @return mobileno
     */
    public java.lang.String getMobileno() {
        return mobileno;
    }


    /**
     * Sets the mobileno value for this Result.
     * 
     * @param mobileno
     */
    public void setMobileno(java.lang.String mobileno) {
        this.mobileno = mobileno;
    }


    /**
     * Gets the aadharno value for this Result.
     * 
     * @return aadharno
     */
    public java.lang.String getAadharno() {
        return aadharno;
    }


    /**
     * Sets the aadharno value for this Result.
     * 
     * @param aadharno
     */
    public void setAadharno(java.lang.String aadharno) {
        this.aadharno = aadharno;
    }


    /**
     * Gets the gender value for this Result.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Result.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the qrcodeurl value for this Result.
     * 
     * @return qrcodeurl
     */
    public java.lang.String getQrcodeurl() {
        return qrcodeurl;
    }


    /**
     * Sets the qrcodeurl value for this Result.
     * 
     * @param qrcodeurl
     */
    public void setQrcodeurl(java.lang.String qrcodeurl) {
        this.qrcodeurl = qrcodeurl;
    }


    /**
     * Gets the status value for this Result.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Result.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ppbstruct==null && other.getPpbstruct()==null) || 
             (this.ppbstruct!=null &&
              this.ppbstruct.equals(other.getPpbstruct()))) &&
            ((this.mobileno==null && other.getMobileno()==null) || 
             (this.mobileno!=null &&
              this.mobileno.equals(other.getMobileno()))) &&
            ((this.aadharno==null && other.getAadharno()==null) || 
             (this.aadharno!=null &&
              this.aadharno.equals(other.getAadharno()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.qrcodeurl==null && other.getQrcodeurl()==null) || 
             (this.qrcodeurl!=null &&
              this.qrcodeurl.equals(other.getQrcodeurl()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPpbstruct() != null) {
            _hashCode += getPpbstruct().hashCode();
        }
        if (getMobileno() != null) {
            _hashCode += getMobileno().hashCode();
        }
        if (getAadharno() != null) {
            _hashCode += getAadharno().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getQrcodeurl() != null) {
            _hashCode += getQrcodeurl().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppbstruct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ppbstruct"));
        elemField.setXmlType(new javax.xml.namespace.QName("PPB", "PPB"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mobileno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aadharno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "aadharno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qrcodeurl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "qrcodeurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
