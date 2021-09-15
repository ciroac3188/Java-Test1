package udea;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testCuadradoPositivo() {
		Calculadora calc = new Calculadora();
		assertEquals(25.0, calc.cuadrado(5.0), 0.000000001);
	}
	
	@Test
	void testCuadradoCero() {
		Calculadora calc = new Calculadora();
		assertEquals(0.0, calc.cuadrado(0.0), 0.000000001);
	}

	@Test
	void testCuadradoUno() {
		Calculadora calc = new Calculadora();
		assertEquals(1.0, calc.cuadrado(1.0), 0.000000001);
	}

	@Test
	void testCuadradoNegativo() {
		Calculadora calc = new Calculadora();
		assertEquals(16.0, calc.cuadrado(-4.0), 0.000000001);
	}

	@Test
	void testCuboPositivo() {
		Calculadora calc = new Calculadora();
	    assertEquals(125.0, calc.cubo(5.0), 0.000000001);
	}

	@Test
	void testCuboCero() {
		Calculadora calc = new Calculadora();
	    assertEquals(0.0, calc.cubo(0.0), 0.000000001);
	}

	@Test
	void testCuboUno() {
		Calculadora calc = new Calculadora();
	    assertEquals(1.0, calc.cubo(1.0), 0.000000001);
	}

	@Test
	void testCuboMenosUno() {
		Calculadora calc = new Calculadora();
	    assertEquals(-1.0, calc.cubo(-1.0), 0.000000001);
	}

	@Test
	void testCuboNegativo() {
		Calculadora calc = new Calculadora();
	    assertEquals(-64.0, calc.cubo(-4.0), 0.000000001);
	}

}
