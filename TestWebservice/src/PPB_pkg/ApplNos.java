/**
 * ApplNos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PPB_pkg;

public class ApplNos  implements java.io.Serializable {
    private java.lang.String appNo;

    private java.lang.String appSlno;

    private java.lang.String status;

    public ApplNos() {
    }

    public ApplNos(
           java.lang.String appNo,
           java.lang.String appSlno,
           java.lang.String status) {
           this.appNo = appNo;
           this.appSlno = appSlno;
           this.status = status;
    }


    /**
     * Gets the appNo value for this ApplNos.
     * 
     * @return appNo
     */
    public java.lang.String getAppNo() {
        return appNo;
    }


    /**
     * Sets the appNo value for this ApplNos.
     * 
     * @param appNo
     */
    public void setAppNo(java.lang.String appNo) {
        this.appNo = appNo;
    }


    /**
     * Gets the appSlno value for this ApplNos.
     * 
     * @return appSlno
     */
    public java.lang.String getAppSlno() {
        return appSlno;
    }


    /**
     * Sets the appSlno value for this ApplNos.
     * 
     * @param appSlno
     */
    public void setAppSlno(java.lang.String appSlno) {
        this.appSlno = appSlno;
    }


    /**
     * Gets the status value for this ApplNos.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ApplNos.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplNos)) return false;
        ApplNos other = (ApplNos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appNo==null && other.getAppNo()==null) || 
             (this.appNo!=null &&
              this.appNo.equals(other.getAppNo()))) &&
            ((this.appSlno==null && other.getAppSlno()==null) || 
             (this.appSlno!=null &&
              this.appSlno.equals(other.getAppSlno()))) &&
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
        if (getAppNo() != null) {
            _hashCode += getAppNo().hashCode();
        }
        if (getAppSlno() != null) {
            _hashCode += getAppSlno().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplNos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("PPB", "ApplNos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appNo");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "AppNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appSlno");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "AppSlno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "Status"));
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
