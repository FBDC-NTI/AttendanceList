package br.edu.bahiana.attendacelist.test.unittests;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.hibernate.AssertionFailure;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.edu.bahiana.attendancelist.core.controller.Controller;
import br.edu.bahiana.utils.conditions.PreConditionException;

public class ControllerTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();


	@Test
	public void getClassesForTeacher_MustBeWork() {
		Controller controller = new Controller();
		Iterator<br.edu.bahiana.attendancelist.core.businessclasses.Class> classes;
		try {
			classes = controller.getPlannedClassesForToday(1000026210);
			assertEquals(true, classes.hasNext());
		} catch (Exception e) {			
			assertTrue("Assert Error", false);
			e.printStackTrace();
		}

	}

	@Test(expected = PreConditionException.class)
	public void getClassesForTeacher_PersonNotFound() throws PreConditionException{
		Controller controller = new Controller();		
		controller.getPlannedClassesForToday(0);

	}
	@Test(expected = PreConditionException.class)
	public void getClassesForTeacher_TeacherNotFound() throws PreConditionException{
		Controller controller = new Controller();
		controller.getPlannedClassesForToday(1000000000);
	}	
	
	
	@Test
	public void getPeriodForPlannedClasses_MustBeWork() {
		Controller controller = new Controller();
		List<br.edu.bahiana.attendancelist.common.coreinterfaces.ScholarshipPeriod> periods;
		try {
			periods = controller.getPeriodForPlannedClasses(1000026210);
			assertEquals(false, periods.isEmpty());
		} catch (Exception e) {			
			assertTrue("Assert Error", false);
			e.printStackTrace();
		}

	}

	@Test(expected = PreConditionException.class)
	public void getPeriodForPlannedClasses_PersonNotFound() throws PreConditionException{
		Controller controller = new Controller();		
		controller.getPlannedClassesForToday(0);

	}
	@Test(expected = PreConditionException.class)
	public void getPeriodForPlannedClasses_TeacherNotFound() throws PreConditionException{
		Controller controller = new Controller();
		controller.getPlannedClassesForToday(1000000000);
	}
}
