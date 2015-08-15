package TemplateMethod;

//TemplateMethod
public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.04;
	}

	@Override
	public double maximaTaxaca(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500;
	}

}
