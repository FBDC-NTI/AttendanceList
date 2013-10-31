package br.edu.bahiana.attendancelist.service;

import java.io.Serializable;


public class GetScholarshipPeriodsResponse extends DefaultResponse implements Serializable{
	private ScholarshipPeriodContract[] items;

	public ScholarshipPeriodContract[] getItems() {
		return items;
	}

	public void setItems(ScholarshipPeriodContract[] items) {
		this.items = items;
	}
}
