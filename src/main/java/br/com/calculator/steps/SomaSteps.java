package br.com.calculator.steps;

import br.com.calculator.funcionalidade.HomeFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class SomaSteps {
	
	HomeFuncionalidade home = new HomeFuncionalidade();
	
	@Dado("que estou acessando a aplicacao")
	public void que_estou_acessando_a_aplicacao() {
		home.escreveFisrtNumber("1");
		home.escreveSecondNumber("2");
		home.esconderTeclado();
	   
	}
	@Quando("realizo a soma")
	public void realizo_a_soma() {
	   home.clickButtonSoma();
	}
	@Então("a soma e realizada com sucesso")
	public void a_soma_e_realizada_com_sucesso() {
		Assert.assertEquals(home.resultadoTexto(),"3");
	}

}
