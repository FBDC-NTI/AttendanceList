package br.edu.bahiana.attendancelist.service;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class DefaultContract implements KvmSerializable{
	public static final Class DEFAULTCONTRACT_CLASS = new DefaultContract().getClass();
    private long ID;

    public DefaultContract() {
    }

    public DefaultContract(
           long ID) {
           this.ID = ID;
    }
    
    public DefaultContract(PropertyInfo property){
    	this.setID(Integer.parseInt(property.toString()));
    }


    /**
     * Gets the ID value for this DefaultContract.
     * 
     * @return ID
     */
    public long getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DefaultContract.
     * 
     * @param ID
     */
    public void setID(long ID) {
        this.ID = ID;
    }

	@Override
	public Object getProperty(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPropertyCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getPropertyInfo(int arg0, Hashtable arg1, PropertyInfo arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}    

}
