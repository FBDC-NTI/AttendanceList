package br.edu.bahiana.attendancelist.core.businessclasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import br.edu.bahiana.core.businessclasses.BusinessObject;

public class CurricularActivity extends BusinessObject{
	private List<ClassGroup> classGroups; 
	
	private List<ClassGroup> getClassGroups(){
		return this.classGroups;
	}
	
	private void setClassGroups(List<ClassGroup> classGroups){
		this.classGroups = classGroups;
	}

	public Collection<Class> getPlannedClassesForToday() {
		Collection<Class> returnValue = new ArrayList<Class>();
		for(Iterator<ClassGroup> iterator = getClassGroups().iterator(); iterator.hasNext();){
			ClassGroup classGroup = iterator.next();
			System.out.println("Getting planned classes for the class group "+classGroup.getID());
			returnValue.addAll(classGroup.getPlannedClassesForToday());
		}
		return returnValue;
	}

	public Collection<ScholarshipPeriod> getPeriodForPlannedClasses() {		
		Collection<ScholarshipPeriod> returnValue = new ArrayList<ScholarshipPeriod>();
		for(Iterator<ClassGroup> iterator = getClassGroups().iterator(); iterator.hasNext();){
			ClassGroup classGroup = iterator.next();
			ScholarshipPeriod period = classGroup.getPeriodForPlannedClasses();
			if (period != null)
				returnValue.add(period);
		}
		return returnValue;
	}

}
