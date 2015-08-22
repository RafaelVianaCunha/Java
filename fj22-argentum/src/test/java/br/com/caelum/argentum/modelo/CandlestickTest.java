package br.com.caelum.argentum.modelo;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class CandlestickTest {

	@Test(expected = IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {

		new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}
	
	@Test
	public void quandoAberturaIgualFechamentoEhAlta() {

		Candlestick candlestick = new Candlestick(10, 10, 10, 10, 10000, Calendar.getInstance());
		Assert.assertTrue(candlestick.isAlta());
		Assert.assertTrue(!candlestick.isBaixa());
		
	}

}
