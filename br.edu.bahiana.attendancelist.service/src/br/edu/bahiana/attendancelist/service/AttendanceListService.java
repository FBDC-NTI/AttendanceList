package br.edu.bahiana.attendancelist.service;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import br.edu.bahiana.attendancelist.common.coreinterfaces.Controller;
import br.edu.bahiana.attendancelist.common.coreinterfaces.ControllerFactory;
import br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod;
import br.edu.bahiana.utils.conditions.PreConditionException;


public class AttendanceListService {
	private static ControllerFactory factory;
	private static Lock lock = new ReentrantLock();
	private Controller controller; 
	
	public AttendanceListService() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
	Boolean locked = false;
	if (factory == null){
		try{
			locked = lock.tryLock();
			if (locked){
				if (factory == null){
					String factoryName = "br.edu.bahiana.attendancelist.core.controller.ControllerFactory";// really passed in from config
					Class<?> c = Class.forName(factoryName);
					factory = (ControllerFactory)c.newInstance();
				}
			}
		}finally{
			if (locked)
				lock.unlock();
		}

	}
		controller = factory.create();
	}
	public long logIn(String username, String password){
		//TODO: authenticate with portal
		return Long.parseLong("1000026210");
	}	
	
	public GetScholarshipPeriodsResponse getScholarshipPeriods(Long teacherID){
		GetScholarshipPeriodsResponse response = new GetScholarshipPeriodsResponse();
		try{	
			List<ScholarshipPeriod> items = this.controller.getPeriodForPlannedClasses(teacherID);
			ScholarshipPeriodContract[] returnList = new ScholarshipPeriodContract[items.size()];
			for (int i=0;i < items.size();i++){
				ScholarshipPeriodContract itemContract = new ScholarshipPeriodContract();
				ScholarshipPeriod item = items.get(i);
				itemContract.setID(item.getID());
				itemContract.setHistoryDescription(item.getHistoricDescription());
				returnList[i] = itemContract;
			}
			response.setItems(returnList);
			return response;
		}catch(Exception e){
			response.setErrorNumber(1);
			response.setErrorMessage(e.getMessage());
			return response;
		}
	}
}
