package Decorator;


//TemplateMethod: Tem uma classe que representa o algorítimo do problema e buracos que vão ser preenchido por classes filias 
public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxaca(orcamento)  + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento)  + calculoDoOutroImposto(orcamento);
		}

	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxaca(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
