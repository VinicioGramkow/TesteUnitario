package Teste;
import Classes.Operacoes;
import JSON.JSON;
import junit.framework.TestCase;

public class JUnitTest extends TestCase{
	
	Operacoes op = new Operacoes();
	JSON json = new JSON();
	
	public void testMedia() {
		assertEquals(500.0, op.media(json.importa()));
	}
	
	public void testModa() {
		assertEquals(0.0, op.moda(json.importa()));
	}
	
	public void testMediana() {
		assertEquals(500.0, op.mediana(json.importa()));
	}
	
	public void testVariancia() {
		assertEquals(66666.67, op.variancia(json.importa()));
	}
	
	public void testDesvio() {
		assertEquals(258.2, op.desvioPadrao(json.importa()));
	}
	
	public void testMedia2() {
		assertEquals(250.0, op.media(json.importa()));
	}
	
	public void testModa2() {
		assertEquals(2.0, op.moda(json.importa()));
	}
	
	public void testMediana2() {
		assertEquals(45.0, op.mediana(json.importa()));
	}
	
	public void testVariancia2() {
		assertEquals(356.0, op.variancia(json.importa()));
	}
	
	public void testDesvioPadrao2(){
		assertEquals(597.52, op.desvioPadrao(json.importa()));
	}

}
