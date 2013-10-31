package br.edu.bahiana.attendancelist.service;

public class ScholarshipPeriodContract extends DefaultContract {
	private String historyDescription;

	public String getHistoryDescription() {
		return historyDescription;
	}

	public void setHistoryDescription(String historyDescription) {
		this.historyDescription = historyDescription;
	}
	
	@Override
	public String toString() {	
		return this.getID()+" - "+this.getHistoryDescription();
	}
	
}
