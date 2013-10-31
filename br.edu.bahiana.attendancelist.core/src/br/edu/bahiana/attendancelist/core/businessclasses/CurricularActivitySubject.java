package br.edu.bahiana.attendancelist.core.businessclasses;

import java.util.Collection;

import br.edu.bahiana.core.businessclasses.BusinessObject;

public class CurricularActivitySubject extends BusinessObject{
	private Subject subject;
	private CurricularActivity curricularActivity;
	
	private CurricularActivity getCurricularActivity(){
		return this.curricularActivity;
	}
	
	private void setCurricularActivity(CurricularActivity curricularActivity){
		this.curricularActivity = curricularActivity;
	}
	
	public Collection<Class> getPlannedClassesForToday() {		
		return getCurricularActivity().getPlannedClassesForToday();
	}

	public Collection<ScholarshipPeriod> getPeriodForPlannedClasses() {		
		return getCurricularActivity().getPeriodForPlannedClasses();
	}
}
