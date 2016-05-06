package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logica.Conversion;

public class ConversionTest {

	@Test
	public void convertirI() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("I");
		assertTrue(1==resultado);
	
	}
	/*
	@Test
	public void convertirII() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("II");
		assertTrue(2==resultado);
	
	}*/
	
	@Test
	public void convertirV() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("V");
		assertTrue(5==resultado);
	}
	
	
	@Test
	public void convertirIV() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("IV");
		assertTrue(4==resultado);
	
	}
	@Test
	public void convertirX() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("X");
		assertTrue(10==resultado);
	
	}
	@Test
	public void convertirXX() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("XX");
		assertTrue(20==resultado);
	
	}

}
