/**
 * ScholarshipPeriodContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.edu.bahiana.attendancelist.service;

public class ScholarshipPeriodContract  extends br.edu.bahiana.attendancelist.service.DefaultContract  implements java.io.Serializable {
    private java.lang.String historyDescription;

    public ScholarshipPeriodContract() {
    }

    public ScholarshipPeriodContract(
           long ID,
           java.lang.String historyDescription) {
        super(
            ID);
        this.historyDescription = historyDescription;
    }


    /**
     * Gets the historyDescription value for this ScholarshipPeriodContract.
     * 
     * @return historyDescription
     */
    public java.lang.String getHistoryDescription() {
        return historyDescription;
    }


    /**
     * Sets the historyDescription value for this ScholarshipPeriodContract.
     * 
     * @param historyDescription
     */
    public void setHistoryDescription(java.lang.String historyDescription) {
        this.historyDescription = historyDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScholarshipPeriodContract)) return false;
        ScholarshipPeriodContract other = (ScholarshipPeriodContract) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.historyDescription==null && other.getHistoryDescription()==null) || 
             (this.historyDescription!=null &&
              this.historyDescription.equals(other.getHistoryDescription())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getHistoryDescription() != null) {
            _hashCode += getHistoryDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScholarshipPeriodContract.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.attendancelist.bahiana.edu.br", "ScholarshipPeriodContract"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.attendancelist.bahiana.edu.br", "historyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
