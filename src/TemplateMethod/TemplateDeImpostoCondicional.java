package TemplateMethod;


//TemplateMethod: Tem uma classe que representa o algor�timo do problema e buracos que v�o ser preenchido por classes filias 
public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxaca(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}

	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxaca(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
