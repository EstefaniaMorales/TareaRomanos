package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logica.Conversion;

public class ConversionTest {

	@Test
	public void test() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertirI("I");
		assertTrue(1==resultado);
	
	}

}
