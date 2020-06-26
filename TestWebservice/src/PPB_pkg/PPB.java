/**
 * PPB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PPB_pkg;

public class PPB  implements java.io.Serializable {
    private PPB_pkg.ApplNos[] appNos;

    private java.lang.String photo;

    private java.lang.String address;

    private java.lang.String casteCategory;

    private java.lang.String mandalName;

    private java.lang.String divisionName;

    private java.lang.String dname;

    private java.lang.String ppbSerialNo;

    private ROR_Str_pkg.ROR_Str[] RORs;

    private java.lang.String procdg_no;

    private java.lang.String procdg_date;

    private java.lang.String reg_no;

    private java.lang.String reg_date;

    private java.lang.String mobileno;

    private java.lang.String aadharno;

    public PPB() {
    }

    public PPB(
           PPB_pkg.ApplNos[] appNos,
           java.lang.String photo,
           java.lang.String address,
           java.lang.String casteCategory,
           java.lang.String mandalName,
           java.lang.String divisionName,
           java.lang.String dname,
           java.lang.String ppbSerialNo,
           ROR_Str_pkg.ROR_Str[] RORs,
           java.lang.String procdg_no,
           java.lang.String procdg_date,
           java.lang.String reg_no,
           java.lang.String reg_date,
           java.lang.String mobileno,
           java.lang.String aadharno) {
           this.appNos = appNos;
           this.photo = photo;
           this.address = address;
           this.casteCategory = casteCategory;
           this.mandalName = mandalName;
           this.divisionName = divisionName;
           this.dname = dname;
           this.ppbSerialNo = ppbSerialNo;
           this.RORs = RORs;
           this.procdg_no = procdg_no;
           this.procdg_date = procdg_date;
           this.reg_no = reg_no;
           this.reg_date = reg_date;
           this.mobileno = mobileno;
           this.aadharno = aadharno;
    }


    /**
     * Gets the appNos value for this PPB.
     * 
     * @return appNos
     */
    public PPB_pkg.ApplNos[] getAppNos() {
        return appNos;
    }


    /**
     * Sets the appNos value for this PPB.
     * 
     * @param appNos
     */
    public void setAppNos(PPB_pkg.ApplNos[] appNos) {
        this.appNos = appNos;
    }


    /**
     * Gets the photo value for this PPB.
     * 
     * @return photo
     */
    public java.lang.String getPhoto() {
        return photo;
    }


    /**
     * Sets the photo value for this PPB.
     * 
     * @param photo
     */
    public void setPhoto(java.lang.String photo) {
        this.photo = photo;
    }


    /**
     * Gets the address value for this PPB.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PPB.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the casteCategory value for this PPB.
     * 
     * @return casteCategory
     */
    public java.lang.String getCasteCategory() {
        return casteCategory;
    }


    /**
     * Sets the casteCategory value for this PPB.
     * 
     * @param casteCategory
     */
    public void setCasteCategory(java.lang.String casteCategory) {
        this.casteCategory = casteCategory;
    }


    /**
     * Gets the mandalName value for this PPB.
     * 
     * @return mandalName
     */
    public java.lang.String getMandalName() {
        return mandalName;
    }


    /**
     * Sets the mandalName value for this PPB.
     * 
     * @param mandalName
     */
    public void setMandalName(java.lang.String mandalName) {
        this.mandalName = mandalName;
    }


    /**
     * Gets the divisionName value for this PPB.
     * 
     * @return divisionName
     */
    public java.lang.String getDivisionName() {
        return divisionName;
    }


    /**
     * Sets the divisionName value for this PPB.
     * 
     * @param divisionName
     */
    public void setDivisionName(java.lang.String divisionName) {
        this.divisionName = divisionName;
    }


    /**
     * Gets the dname value for this PPB.
     * 
     * @return dname
     */
    public java.lang.String getDname() {
        return dname;
    }


    /**
     * Sets the dname value for this PPB.
     * 
     * @param dname
     */
    public void setDname(java.lang.String dname) {
        this.dname = dname;
    }


    /**
     * Gets the ppbSerialNo value for this PPB.
     * 
     * @return ppbSerialNo
     */
    public java.lang.String getPpbSerialNo() {
        return ppbSerialNo;
    }


    /**
     * Sets the ppbSerialNo value for this PPB.
     * 
     * @param ppbSerialNo
     */
    public void setPpbSerialNo(java.lang.String ppbSerialNo) {
        this.ppbSerialNo = ppbSerialNo;
    }


    /**
     * Gets the RORs value for this PPB.
     * 
     * @return RORs
     */
    public ROR_Str_pkg.ROR_Str[] getRORs() {
        return RORs;
    }


    /**
     * Sets the RORs value for this PPB.
     * 
     * @param RORs
     */
    public void setRORs(ROR_Str_pkg.ROR_Str[] RORs) {
        this.RORs = RORs;
    }


    /**
     * Gets the procdg_no value for this PPB.
     * 
     * @return procdg_no
     */
    public java.lang.String getProcdg_no() {
        return procdg_no;
    }


    /**
     * Sets the procdg_no value for this PPB.
     * 
     * @param procdg_no
     */
    public void setProcdg_no(java.lang.String procdg_no) {
        this.procdg_no = procdg_no;
    }


    /**
     * Gets the procdg_date value for this PPB.
     * 
     * @return procdg_date
     */
    public java.lang.String getProcdg_date() {
        return procdg_date;
    }


    /**
     * Sets the procdg_date value for this PPB.
     * 
     * @param procdg_date
     */
    public void setProcdg_date(java.lang.String procdg_date) {
        this.procdg_date = procdg_date;
    }


    /**
     * Gets the reg_no value for this PPB.
     * 
     * @return reg_no
     */
    public java.lang.String getReg_no() {
        return reg_no;
    }


    /**
     * Sets the reg_no value for this PPB.
     * 
     * @param reg_no
     */
    public void setReg_no(java.lang.String reg_no) {
        this.reg_no = reg_no;
    }


    /**
     * Gets the reg_date value for this PPB.
     * 
     * @return reg_date
     */
    public java.lang.String getReg_date() {
        return reg_date;
    }


    /**
     * Sets the reg_date value for this PPB.
     * 
     * @param reg_date
     */
    public void setReg_date(java.lang.String reg_date) {
        this.reg_date = reg_date;
    }


    /**
     * Gets the mobileno value for this PPB.
     * 
     * @return mobileno
     */
    public java.lang.String getMobileno() {
        return mobileno;
    }


    /**
     * Sets the mobileno value for this PPB.
     * 
     * @param mobileno
     */
    public void setMobileno(java.lang.String mobileno) {
        this.mobileno = mobileno;
    }


    /**
     * Gets the aadharno value for this PPB.
     * 
     * @return aadharno
     */
    public java.lang.String getAadharno() {
        return aadharno;
    }


    /**
     * Sets the aadharno value for this PPB.
     * 
     * @param aadharno
     */
    public void setAadharno(java.lang.String aadharno) {
        this.aadharno = aadharno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PPB)) return false;
        PPB other = (PPB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appNos==null && other.getAppNos()==null) || 
             (this.appNos!=null &&
              java.util.Arrays.equals(this.appNos, other.getAppNos()))) &&
            ((this.photo==null && other.getPhoto()==null) || 
             (this.photo!=null &&
              this.photo.equals(other.getPhoto()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.casteCategory==null && other.getCasteCategory()==null) || 
             (this.casteCategory!=null &&
              this.casteCategory.equals(other.getCasteCategory()))) &&
            ((this.mandalName==null && other.getMandalName()==null) || 
             (this.mandalName!=null &&
              this.mandalName.equals(other.getMandalName()))) &&
            ((this.divisionName==null && other.getDivisionName()==null) || 
             (this.divisionName!=null &&
              this.divisionName.equals(other.getDivisionName()))) &&
            ((this.dname==null && other.getDname()==null) || 
             (this.dname!=null &&
              this.dname.equals(other.getDname()))) &&
            ((this.ppbSerialNo==null && other.getPpbSerialNo()==null) || 
             (this.ppbSerialNo!=null &&
              this.ppbSerialNo.equals(other.getPpbSerialNo()))) &&
            ((this.RORs==null && other.getRORs()==null) || 
             (this.RORs!=null &&
              java.util.Arrays.equals(this.RORs, other.getRORs()))) &&
            ((this.procdg_no==null && other.getProcdg_no()==null) || 
             (this.procdg_no!=null &&
              this.procdg_no.equals(other.getProcdg_no()))) &&
            ((this.procdg_date==null && other.getProcdg_date()==null) || 
             (this.procdg_date!=null &&
              this.procdg_date.equals(other.getProcdg_date()))) &&
            ((this.reg_no==null && other.getReg_no()==null) || 
             (this.reg_no!=null &&
              this.reg_no.equals(other.getReg_no()))) &&
            ((this.reg_date==null && other.getReg_date()==null) || 
             (this.reg_date!=null &&
              this.reg_date.equals(other.getReg_date()))) &&
            ((this.mobileno==null && other.getMobileno()==null) || 
             (this.mobileno!=null &&
              this.mobileno.equals(other.getMobileno()))) &&
            ((this.aadharno==null && other.getAadharno()==null) || 
             (this.aadharno!=null &&
              this.aadharno.equals(other.getAadharno())));
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
        if (getAppNos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppNos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppNos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhoto() != null) {
            _hashCode += getPhoto().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCasteCategory() != null) {
            _hashCode += getCasteCategory().hashCode();
        }
        if (getMandalName() != null) {
            _hashCode += getMandalName().hashCode();
        }
        if (getDivisionName() != null) {
            _hashCode += getDivisionName().hashCode();
        }
        if (getDname() != null) {
            _hashCode += getDname().hashCode();
        }
        if (getPpbSerialNo() != null) {
            _hashCode += getPpbSerialNo().hashCode();
        }
        if (getRORs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRORs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRORs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcdg_no() != null) {
            _hashCode += getProcdg_no().hashCode();
        }
        if (getProcdg_date() != null) {
            _hashCode += getProcdg_date().hashCode();
        }
        if (getReg_no() != null) {
            _hashCode += getReg_no().hashCode();
        }
        if (getReg_date() != null) {
            _hashCode += getReg_date().hashCode();
        }
        if (getMobileno() != null) {
            _hashCode += getMobileno().hashCode();
        }
        if (getAadharno() != null) {
            _hashCode += getAadharno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PPB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("PPB", "PPB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appNos");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "AppNos"));
        elemField.setXmlType(new javax.xml.namespace.QName("PPB", "ApplNos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("PPB", "ApplNos"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photo");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "Photo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casteCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "CasteCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandalName");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "MandalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "DivisionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dname");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "dname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppbSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "ppbSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RORs");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "RORs"));
        elemField.setXmlType(new javax.xml.namespace.QName("ROR_Str", "ROR_Str"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("PPB", "ROR_Str"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procdg_no");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "procdg_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procdg_date");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "procdg_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_no");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "reg_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg_date");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "reg_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileno");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "mobileno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aadharno");
        elemField.setXmlName(new javax.xml.namespace.QName("PPB", "aadharno"));
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
