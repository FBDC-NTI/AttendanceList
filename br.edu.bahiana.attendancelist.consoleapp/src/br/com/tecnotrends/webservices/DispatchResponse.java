/**
 * DispatchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.tecnotrends.webservices;

public class DispatchResponse  implements java.io.Serializable {
    private java.lang.String dispatchResult;

    public DispatchResponse() {
    }

    public DispatchResponse(
           java.lang.String dispatchResult) {
           this.dispatchResult = dispatchResult;
    }


    /**
     * Gets the dispatchResult value for this DispatchResponse.
     * 
     * @return dispatchResult
     */
    public java.lang.String getDispatchResult() {
        return dispatchResult;
    }


    /**
     * Sets the dispatchResult value for this DispatchResponse.
     * 
     * @param dispatchResult
     */
    public void setDispatchResult(java.lang.String dispatchResult) {
        this.dispatchResult = dispatchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DispatchResponse)) return false;
        DispatchResponse other = (DispatchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dispatchResult==null && other.getDispatchResult()==null) || 
             (this.dispatchResult!=null &&
              this.dispatchResult.equals(other.getDispatchResult())));
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
        if (getDispatchResult() != null) {
            _hashCode += getDispatchResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DispatchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", ">DispatchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispatchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tecnotrends.com.br/webservices", "DispatchResult"));
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
