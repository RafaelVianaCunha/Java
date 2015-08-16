package Decorator;

public class TesteDeImpostoComplexosDecorator {

	public static void main(String[] args) {

		// antes do decorator
		// Imposto iss= new ISS();
		// Imposto issComIcms = new issComIcms;
		// Imposto issComIcmsComIcpp = new issComIcmsComIcpp;

		// Decorator é para juntar os comportamentos que estão separados em
		// classes diferentes.
		// ex:
		Imposto impostos = new ISS(new ICMS(new ICPP()));

		Orcamento orcamento = new Orcamento(500);
		double valor = impostos.calcula(orcamento);

		System.out.println(valor);
	}

}
