package br.edu.bahiana.attendancelist.consoleapp;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.tecnotrends.webservices.Services;
import br.com.tecnotrends.webservices.ServicesLocator;
import br.com.tecnotrends.webservices.ServicesSoap;

public class Main {

	public static void main(String[] args){		
		Services locator = new ServicesLocator();
		try {
			ServicesSoap services = locator.getServicesSoap();
			boolean response = services.autenticarUsuario("trends", "pedro");
			System.out.println(response);
			response = services.autenticarUsuario("trends1", "pedro");
			System.out.println(response);
		} catch (RemoteException e) {			
			e.printStackTrace();
		} catch (ServiceException e) {			
			e.printStackTrace();
		}
	}

}
