/**
 * GetScholarshipPeriodsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.edu.bahiana.attendancelist.service;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class GetScholarshipPeriodsResponse  extends br.edu.bahiana.attendancelist.service.DefaultResponse implements KvmSerializable {
	public static final Class GETSCHOLARSHIPPERIODSRESPONSE_CLASS = new GetScholarshipPeriodsResponse().getClass();
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

    @Override
	public Object getProperty(int index) {
		switch (index) {
		case 3:
			return this.items;		
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
		case 3:
			info.type = PropertyInfo.VECTOR_CLASS;
			info.name = "items";
			break;		
		default:
			super.getPropertyInfo(index, properties, info);
			break;
		}
	}

	@Override
	public void setProperty(int index, Object value) {
		switch (index) {
		case 3:
			this.items = (ScholarshipPeriodContract[]) value;
			break;		
		default:
			super.setProperty(index, value);
			break;
		}		
	}


}
