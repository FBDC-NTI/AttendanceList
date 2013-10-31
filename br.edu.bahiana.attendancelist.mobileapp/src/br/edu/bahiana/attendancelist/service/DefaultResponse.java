
package br.edu.bahiana.attendancelist.service;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class DefaultResponse implements KvmSerializable{
	public static final Class DEFAULTRESPONSE_CLASS = new DefaultResponse().getClass();
    private java.lang.String errorMessage = null;
    private Long errorNumber = null;

    public DefaultResponse() {
    }

    public DefaultResponse(
           java.lang.String errorMessage,
           long errorNumber) {
           this.errorMessage = errorMessage;
           this.errorNumber = errorNumber;
    }


    /**
     * Gets the errorMessage value for this DefaultResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this DefaultResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the errorNumber value for this DefaultResponse.
     * 
     * @return errorNumber
     */
    public long getErrorNumber() {
        return errorNumber;
    }


    /**
     * Sets the errorNumber value for this DefaultResponse.
     * 
     * @param errorNumber
     */
    public void setErrorNumber(long errorNumber) {
        this.errorNumber = errorNumber;
    }

	@Override
	public Object getProperty(int index) {
		switch (index) {
		case 0:
			return this.errorMessage;
		case 1:
			return this.errorNumber;
		default:
			return null;
		}
	}

	@Override
	public int getPropertyCount() {
		return 2;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {		
		switch (index) {
		case 0:
			info.type = PropertyInfo.STRING_CLASS;
			info.name = "errorMessage";
			break;
		case 1:
			info.type = PropertyInfo.LONG_CLASS;
			info.name = "errorNumber";
		default:
			break;
		}
	}

	@Override
	public void setProperty(int index, Object value) {
		switch (index) {
		case 0:
			this.errorMessage = value.toString();
			break;
		case 1:
			this.errorNumber = Long.parseLong(value.toString());
			break;
		default:
			break;
		}		
	}

}
