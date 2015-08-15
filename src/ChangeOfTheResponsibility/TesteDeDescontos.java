package ChangeOfTheResponsibility;

public class TesteDeDescontos {
	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Laps", 250.0));
		
		double descontoFinal= descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}

}
