package br.com.calculator.core;

import static br.com.calculator.core.Driver.getDriver;

public class BaseScreen {
	
	public void esconderTeclado() {
		getDriver().hideKeyboard();
	}

}
