/**
 * NotificarDestinatarios.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.tecnotrends.webservices;

public class NotificarDestinatarios  implements java.io.Serializable {
    private java.lang.String asProduto;

    private java.lang.Object[] aoArgumentos;

    public NotificarDestinatarios() {
    }

    public NotificarDestinatarios(
           java.lang.String asProduto,
           java.lang.Object[] aoArgumentos) {
           this.asProduto = asProduto;
           this.aoArgumentos = aoArgumentos;
    }


    /**
     * Gets the asProduto value for this NotificarDestinatarios.
     * 
     * @return asProduto
     */
    public java.lang.String getAsProduto() {
        return asProduto;
    }


    /**
     * Sets the asProduto value for this NotificarDestinatarios.
     * 
     * @param asProduto
     */
    public void setAsProduto(java.lang.String asProduto) {
        this.asProduto = asProduto;
    }


    /**
     * Gets the aoArgumentos value for this NotificarDestinatarios.
     * 
     * @return aoArgumentos
     */
    public java.lang.Object[] getAoArgumentos() {
        return aoArgumentos;
    }


    /**
     * Sets the aoArgumentos value for this NotificarDestinatarios.
     * 
     * @param aoArgumentos
     */
    public void setAoArgumentos(java.lang.Object[] aoArgumentos) {
        this.aoArgumentos = aoArgumentos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificarDestinatarios)) return false;
        NotificarDestinatarios other = (NotificarDestinatarios) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asProduto==null && other.getAsProduto()==null) || 
             (this.asProduto!=null &&
              this.asProduto.equals(other.getAsProduto()))) &&
            ((this.aoArgumentos==null && other.getAoArgumentos()==null) || 
             (this.aoArgumentos!=null &&
              java.util.Arrays.equals(this.aoArgumentos, other.getAoArgumentos())));
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
        if (getAsProduto() != null) {
            _hashCode += getAsProduto().hashCode();
        }
        if (getAoArgumentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAoArgumentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAoArgumentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificarDestinatarios.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", ">NotificarDestinatarios"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "asProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aoArgumentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "aoArgumentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "anyType"));
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
