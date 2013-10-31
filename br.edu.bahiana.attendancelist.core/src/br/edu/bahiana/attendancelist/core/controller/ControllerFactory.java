package br.edu.bahiana.attendancelist.core.controller;

import br.edu.bahiana.attendancelist.common.coreinterfaces.Controller;

public class ControllerFactory implements br.edu.bahiana.attendancelist.common.coreinterfaces.ControllerFactory {

	@Override
	public Controller create() {
		return new br.edu.bahiana.attendancelist.core.controller.Controller();
	}
	
}
