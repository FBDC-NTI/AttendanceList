/**
 * GetScholarshipPeriodsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.edu.bahiana.attendancelist.service;

public class GetScholarshipPeriodsResponse  extends br.edu.bahiana.attendancelist.service.DefaultResponse  implements java.io.Serializable {
    private br.edu.bahiana.attendancelist.service.ScholarshipPeriodContract[] items;

    public GetScholarshipPeriodsResponse() {
    }

    public GetScholarshipPeriodsResponse(
           java.lang.String errorMessage,
           long errorNumber,
           br.edu.bahiana.attendancelist.service.ScholarshipPeriodContract[] items) {
        super(
            errorMessage,
            errorNumber);
        this.items = items;
    }


    /**
     * Gets the items value for this GetScholarshipPeriodsResponse.
     * 
     * @return items
     */
    public br.edu.bahiana.attendancelist.service.ScholarshipPeriodContract[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this GetScholarshipPeriodsResponse.
     * 
     * @param items
     */
    public void setItems(br.edu.bahiana.attendancelist.service.ScholarshipPeriodContract[] items) {
        this.items = items;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScholarshipPeriodsResponse)) return false;
        GetScholarshipPeriodsResponse other = (GetScholarshipPeriodsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems())));
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
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
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
        new org.apache.axis.description.TypeDesc(GetScholarshipPeriodsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.attendancelist.bahiana.edu.br", "GetScholarshipPeriodsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.attendancelist.bahiana.edu.br", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.attendancelist.bahiana.edu.br", "ScholarshipPeriodContract"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.attendancelist.bahiana.edu.br", "item"));
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
