package br.edu.bahiana.attendancelist.core.businessclasses;

import br.edu.bahiana.core.businessclasses.BusinessObject;

public class Course extends BusinessObject {
	private String name; 
	private ScholarshipPeriod scholarshipStartPeriod;

	public ScholarshipPeriod getScholarshipStartPeriod() {
		return scholarshipStartPeriod;
	}

	public void setScholarshipStartPeriod(ScholarshipPeriod scholarshipStartPeriod) {
		this.scholarshipStartPeriod = scholarshipStartPeriod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
