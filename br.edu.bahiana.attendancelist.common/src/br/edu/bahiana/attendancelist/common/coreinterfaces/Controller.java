package br.edu.bahiana.attendancelist.common.coreinterfaces;

import java.util.List;

import br.edu.bahiana.utils.conditions.PreConditionException;

public interface Controller {
	List<ScholarshipPeriod> getPeriodForPlannedClasses(long teacherID) throws PreConditionException;
}
