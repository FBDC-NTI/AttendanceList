package br.edu.bahiana.attendancelist.core.businessclasses;

import br.edu.bahiana.core.businessclasses.BusinessObject;

public class ScholarshipPeriod extends BusinessObject implements br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod {
	private String historicDescription;

	public String getHistoricDescription() {
		return historicDescription;
	}

	public void setHistoricDescription(String historicDescription) {
		this.historicDescription = historicDescription;
	}
}
