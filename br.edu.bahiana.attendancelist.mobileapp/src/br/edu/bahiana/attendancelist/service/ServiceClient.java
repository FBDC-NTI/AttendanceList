package br.edu.bahiana.attendancelist.service;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.accounts.AccountsException;

public class ServiceClient {	

	private static final String URL = "http://10.71.10.124:8080/br.edu.bahiana.attendancelist.service/services/AttendanceListService";
	private static final String NAMESPACE = "http://service.attendancelist.bahiana.edu.br";
	private static final String SOAP_ACTION = "AttendanceListService";
	public long logIn(String username, String password) throws AccountsException{
		try {			

			String METHOD_NAME = "logIn";
			SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
			request.addProperty("username", username);
			request.addProperty("password", password);

			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
					SoapEnvelope.VER11);
			envelope.setOutputSoapObject(request);
			HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
			androidHttpTransport.call(SOAP_ACTION, envelope);
			SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
			long r = Long.parseLong(resultsRequestSOAP.getProperty("logInReturn").toString());  
			return r;
		}catch(Exception e){
			throw new AccountsException(e.getMessage()); 
		}
	}
	
	public GetScholarshipPeriodsResponse getScholarshipPeriods(long teacherID) throws AccountsException{
		try {			

			String METHOD_NAME = "getScholarshipPeriods";
			SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
			request.addProperty("teacherID", teacherID);			

			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
					SoapEnvelope.VER11);
			//envelope.addMapping(NAMESPACE, "getScholarshipPeriodsReturn", GetScholarshipPeriodsResponse.GETSCHOLARSHIPPERIODSRESPONSE_CLASS);
			envelope.addMapping(NAMESPACE, GetScholarshipPeriodsResponse.GETSCHOLARSHIPPERIODSRESPONSE_CLASS.getSimpleName(), GetScholarshipPeriodsResponse.GETSCHOLARSHIPPERIODSRESPONSE_CLASS);
			envelope.addMapping(NAMESPACE, "DefaultResponse", DefaultResponse.DEFAULTRESPONSE_CLASS);
			envelope.addMapping(NAMESPACE, "DefaultContract", DefaultContract.DEFAULTCONTRACT_CLASS);
			envelope.addMapping(NAMESPACE, "ScholarshipPeriodContract", ScholarshipPeriodContract.SCHOLARSHIPPERIODCONTRACT_CLASS);
			envelope.setOutputSoapObject(request);
			HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
			androidHttpTransport.call(SOAP_ACTION, envelope);
			//SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
			//PropertyInfo response = (PropertyInfo) resultsRequestSOAP.getProperty("getScholarshipPeriodsReturn");  
			return (GetScholarshipPeriodsResponse)envelope.getResponse();
		}catch(Exception e){
			throw new AccountsException(e.getMessage()); 
		}
	}
}
