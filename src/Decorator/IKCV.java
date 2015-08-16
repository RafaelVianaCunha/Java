package Decorator;

//TemplateMethod
public class IKCV extends TemplateDeImpostoCondicional{

	@Override
	public double minimaTaxacao(Orcamento orcamento) {		
		return orcamento.getValor() *0.06;
	}

	@Override
	public double maximaTaxaca(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() *0.1;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor()>100) return true;			
		}
		return false;
	}

}
