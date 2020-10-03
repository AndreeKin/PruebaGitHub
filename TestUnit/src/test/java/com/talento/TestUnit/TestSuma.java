package com.talento.TestUnit;

import junit.framework.TestCase;

public class TestSuma extends TestCase{
	public void testSumar() {
		Suma suma = new Suma();
		double resultado = suma.sumar(1.0, 1.0);
		// Verificando que la resta de los números es igual a UNO. 
		assertEquals(2.0, resultado);
	}
}
