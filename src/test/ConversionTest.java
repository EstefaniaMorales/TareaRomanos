package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logica.Conversion;

public class ConversionTest {

	@Test
	public void convertirI() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertirI("I");
		assertTrue(1==resultado);
	
	}
	@Test
	public void convertirII() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertirI("II");
		assertTrue(2==resultado);
	
	}
	
	@Test
	public void convertirV() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertirI("V");
		assertTrue(5==resultado);
	
	}

}
