package br.edu.bahiana.attendancelist.core.businessclasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import br.edu.bahiana.core.businessclasses.BusinessObject;

public class ClassGroup extends BusinessObject{
	private List<Class> classes;
	private String description;
	private char closedReportCardKey;
	private char closedClassGroupKey;
	private ScholarshipPeriod scholarshipPeriod;
	private List<Teacher> teachers;
	//atividade curricular?
	//atividade pedagogica
	//tipo atividade pedagogica
	//caderneta fechada
	
	public Collection<Class> getClasses(){
		return this.classes;
	}
	
	public void setClasses(List<Class> classes){
		this.classes = classes;
	}
	
	public Collection<Class> getPlannedClassesForToday(){
		Collection<Class> returnValue = new ArrayList<Class>();
		for(Iterator<Class> iterator = getClasses().iterator(); iterator.hasNext();){
			Class c = iterator.next();			
			if (c.isPlannedForToday()){
				System.out.println(c.getClassNumber()+" is planned for today");
				returnValue.add(c);
			}
		}
		return returnValue;
	}

	public ScholarshipPeriod getScholarshipPeriod() {
		return scholarshipPeriod;
	}

	public void setScholarshipPeriod(ScholarshipPeriod scholarshipPeriod) {
		this.scholarshipPeriod = scholarshipPeriod;
	}

	public ScholarshipPeriod getPeriodForPlannedClasses() {
		for(Iterator<Class> iterator = getClasses().iterator(); iterator.hasNext();){
			Class c = iterator.next();			
			if (c.isPlannedForToday()){
				return getScholarshipPeriod();
			}
		}
		return null; 
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
}
