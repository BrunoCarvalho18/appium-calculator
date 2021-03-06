package br.com.calculator.funcionalidade;

import br.com.calculator.screens.HomeScreen;

public class HomeFuncionalidade {
	
	private HomeScreen homeScreen;
	
	public HomeFuncionalidade() {
		homeScreen = new HomeScreen();
	}
	
	public void escreveFisrtNumber(String firstNumber) {
		homeScreen.getCampoFirstNumber().sendKeys(firstNumber);
	}
	
	public void escreveSecondNumber(String secondNumber) {
		homeScreen.getCampoSecondNumber().sendKeys(secondNumber);
	}
	
	public void esconderTeclado() {
		homeScreen.esconderTeclado();
	}
	
	public void clickButtonSoma() {
		homeScreen.getBotaoSoma().click();
	}
	
	public String resultadoTexto() {
		return homeScreen.getResultadoTexto().getText();
	}
	
}
