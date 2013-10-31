package br.edu.bahiana.attendancelist.core.businessclasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import br.edu.bahiana.core.businessclasses.BusinessObjectList;
import br.edu.bahiana.core.controller.AbstractController;

public class Teacher extends NaturalPerson {
	private List<CurricularActivitySubject> curricularActivitiesSubjects;
	private List<ClassGroup> classGroups;

	private List<CurricularActivitySubject> getCurricularActivitiesSubjects(){
		return this.curricularActivitiesSubjects;
	}
	
	private void setCurricularActivitiesSubjects(List<CurricularActivitySubject> curricularActivitySubjects){
		this.curricularActivitiesSubjects = curricularActivitySubjects;
	}

	public static Teacher getByID(long teacherID, AbstractController controller){
		BusinessObjectList<Teacher> list = new BusinessObjectList<Teacher>(controller);
		return (Teacher)list.getByID(teacherID, Teacher.class);
	}

	public Iterator<Class> getPlannedClassesForToday() {
		List<Class> classes = new ArrayList<Class>();
		for(Iterator<CurricularActivitySubject> list = getCurricularActivitiesSubjects().iterator();list.hasNext();){
			CurricularActivitySubject subject = list.next();
			System.out.println("Getting planned classes for the subject "+subject.getID());
			classes.addAll(subject.getPlannedClassesForToday());
		}
		return classes.iterator();
	}

	public List<br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod> getPeriodForPlannedClasses() {		
		List<br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod> classes = new ArrayList<br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod>();
		HashSet<br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod> hashAux = new HashSet<br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod>();
		for(Iterator<CurricularActivitySubject> list = getCurricularActivitiesSubjects().iterator();list.hasNext();){
			CurricularActivitySubject subject = list.next();			
			for (Iterator<ScholarshipPeriod> returnValue = (subject.getPeriodForPlannedClasses()).iterator(); returnValue.hasNext(); ){
				ScholarshipPeriod item = returnValue.next();
				if (!hashAux.contains(item)){
					hashAux.add(item);
				}
			}
		}
		classes = new ArrayList<br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod>(hashAux);
		return classes;
	}

	public List<ClassGroup> getClassGroups() {
		return classGroups;
	}

	public void setClassGroups(List<ClassGroup> classGroups) {
		this.classGroups = classGroups;
	}

	public Iterator<ClassGroup> getClassesForPeriod(long periodID) {
		List<ClassGroup> classes = this.getClassGroups();
		
		return null;
	}
}
