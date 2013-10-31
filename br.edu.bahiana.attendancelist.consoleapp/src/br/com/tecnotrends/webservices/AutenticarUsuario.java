/**
 * AutenticarUsuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.tecnotrends.webservices;

public class AutenticarUsuario  implements java.io.Serializable {
    private java.lang.String asUser;

    private java.lang.String asPassWord;

    public AutenticarUsuario() {
    }

    public AutenticarUsuario(
           java.lang.String asUser,
           java.lang.String asPassWord) {
           this.asUser = asUser;
           this.asPassWord = asPassWord;
    }


    /**
     * Gets the asUser value for this AutenticarUsuario.
     * 
     * @return asUser
     */
    public java.lang.String getAsUser() {
        return asUser;
    }


    /**
     * Sets the asUser value for this AutenticarUsuario.
     * 
     * @param asUser
     */
    public void setAsUser(java.lang.String asUser) {
        this.asUser = asUser;
    }


    /**
     * Gets the asPassWord value for this AutenticarUsuario.
     * 
     * @return asPassWord
     */
    public java.lang.String getAsPassWord() {
        return asPassWord;
    }


    /**
     * Sets the asPassWord value for this AutenticarUsuario.
     * 
     * @param asPassWord
     */
    public void setAsPassWord(java.lang.String asPassWord) {
        this.asPassWord = asPassWord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutenticarUsuario)) return false;
        AutenticarUsuario other = (AutenticarUsuario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asUser==null && other.getAsUser()==null) || 
             (this.asUser!=null &&
              this.asUser.equals(other.getAsUser()))) &&
            ((this.asPassWord==null && other.getAsPassWord()==null) || 
             (this.asPassWord!=null &&
              this.asPassWord.equals(other.getAsPassWord())));
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
        if (getAsUser() != null) {
            _hashCode += getAsUser().hashCode();
        }
        if (getAsPassWord() != null) {
            _hashCode += getAsPassWord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutenticarUsuario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", ">AutenticarUsuario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "asUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asPassWord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "asPassWord"));
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
