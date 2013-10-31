/**
 * ScholarshipPeriodContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.edu.bahiana.attendancelist.service;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class ScholarshipPeriodContract  
extends br.edu.bahiana.attendancelist.service.DefaultContract 
implements KvmSerializable{
    public static final Class SCHOLARSHIPPERIODCONTRACT_CLASS = new ScholarshipPeriodContract().getClass();
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

    @Override
	public Object getProperty(int index) {
		switch (index) {
		case 1:
			return this.historyDescription;		
		default:
			return super.getProperty(index);
		}
	}

	@Override
	public int getPropertyCount() {
		return super.getPropertyCount() + 1;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {		
		switch (index) {
		case 1:
			info.type = PropertyInfo.STRING_CLASS;
			info.name = "historyDescription";
			break;		
		default:
			super.getPropertyInfo(index, properties, info);
			break;
		}
	}

	@Override
	public void setProperty(int index, Object value) {
		switch (index) {
		case 1:
			this.historyDescription = value.toString();
			break;		
		default:
			super.setProperty(index, value);
			break;
		}		
	}

}
