package br.edu.bahiana.attendancelist.core.businessclasses;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import br.edu.bahiana.core.businessclasses.BusinessObject;

public class Class extends BusinessObject {
	private int classNumber;
	private List<Attendance> attendace;
	private Date plannedDate;
	
	private Date getPlannedDate(){
		return this.plannedDate;
	}
	
	private void setPlannedDate(Date plannedDate){
		this.plannedDate = plannedDate;
	}
	
	public boolean isPlannedForToday() {
		//Date today = new Date();
		if (plannedDate == null)
			return false;
		Calendar calendar = GregorianCalendar.getInstance();
		Calendar calendar2 = GregorianCalendar.getInstance();
		calendar.set(2013, 7, 9,0,0,0);
		calendar2.setTime(plannedDate);
		Date today = calendar.getTime(); //debug purpose
		Date plannedDate = getPlannedDate();
		//System.out.println(plannedDate+" <===> "+ today+" compare =="+ today.compareTo(plannedDate) );
		if (calendar.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR) &&
				calendar.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH) &&
				calendar.get(Calendar.DATE) == calendar2.get(Calendar.DATE)
				)
			return true;
		return false;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
}
