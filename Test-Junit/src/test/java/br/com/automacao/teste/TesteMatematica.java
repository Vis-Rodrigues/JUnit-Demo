package br.com.automacao.teste;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteMatematica {

	@Test
	public void test() {
		Assert.assertTrue("Valor da soma incorreta: ", 4 + 5 > 6);
	}

	@Test
	public void testSubtracao() {
		Assert.assertTrue("Valor da subtração incorreta: ", 4 - 5 < 1);
	}
	
//	@Test
//	public void testFalha() {
//		fail("Vai falhar este teste");
//	}
	
}
