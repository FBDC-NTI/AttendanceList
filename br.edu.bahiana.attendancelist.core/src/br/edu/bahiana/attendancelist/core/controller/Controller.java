package br.edu.bahiana.attendancelist.core.controller;



import java.lang.reflect.Method;
import java.net.URL;


import java.util.Iterator;
import java.util.List;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;

import br.edu.bahiana.attendancelist.core.businessclasses.Class;
import br.edu.bahiana.attendancelist.core.businessclasses.ClassGroup;
import br.edu.bahiana.attendancelist.core.businessclasses.ScholarshipPeriod;
import br.edu.bahiana.attendancelist.core.businessclasses.Teacher;
import br.edu.bahiana.core.controller.AbstractController;
import br.edu.bahiana.utils.conditions.Check;
import br.edu.bahiana.utils.conditions.PreConditionException;

public class Controller extends AbstractController implements br.edu.bahiana.attendancelist.common.coreinterfaces.Controller {	

	public Boolean authenticate(String user, String password){
		try{
		SOAPConnectionFactory soapConnectionFactory =
		        SOAPConnectionFactory.newInstance();
		      SOAPConnection connection =
		        soapConnectionFactory.createConnection();
		      SOAPFactory soapFactory = 
		        SOAPFactory.newInstance();

		      MessageFactory factory =
		        MessageFactory.newInstance();
		      SOAPMessage message = factory.createMessage();

		      SOAPHeader header = message.getSOAPHeader();
		      SOAPBody body = message.getSOAPBody();
		      header.detachNode();

		      Name bodyName = soapFactory.createName(
		        "AutenticarUsuario", "m",
		        "http://saubara/PortalDispatcher/Services.asmx");
		      SOAPBodyElement bodyElement =
		        body.addBodyElement(bodyName);

		      Name name = soapFactory.createName("symbol");
		      SOAPElement symbol = 
		        bodyElement.addChildElement(name);
		      symbol.addTextNode("SUNW");

		      URL endpoint = new URL
		        ("http://wombat.ztrade.com/quotes");
		      SOAPMessage response = 
		        connection.call(message, endpoint);

		      connection.close();

		      SOAPBody soapBody = response.getSOAPBody();

		      Iterator iterator = 
		        soapBody.getChildElements(bodyName);
		      bodyElement = (SOAPBodyElement)iterator.next();
		      String lastPrice = bodyElement.getValue();

		      System.out.print("The last price for SUNW is ");
		      System.out.println(lastPrice);

		    } catch (Exception ex) {
		      ex.printStackTrace();
		    }

		return false;
	}
	public Iterator<Class> getPlannedClassesForToday(long teacherID) throws PreConditionException{		
		Teacher teacher = Teacher.getByID(teacherID, this);
		Check.require(teacher != null);	
		System.out.println("Getting planned classes for Teacher "+teacher.getName());		
		return teacher.getPlannedClassesForToday();
	}
	
	public List<br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod> getPeriodForPlannedClasses(long teacherID) throws PreConditionException{
		Teacher teacher = Teacher.getByID(teacherID, this);
		Check.require(teacher != null);				
		return teacher.getPeriodForPlannedClasses();
	}
	
	public Iterator<ClassGroup> getClassesForPeriod(long teacherID, long periodID) throws PreConditionException{
		Teacher teacher = Teacher.getByID(teacherID, this);
		Check.require(teacher != null);
		return teacher.getClassesForPeriod(periodID);
	}
}
