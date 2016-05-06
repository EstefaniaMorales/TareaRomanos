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
	
	@Test
	public void convertirII() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("II");
		assertTrue(2==resultado);
	
	}
	
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
	@Test
	public void convertirXXI() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("XXI");
		assertTrue(21==resultado);
	
	}
	@Test
	public void convertirXXIII() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("XXIII");
		assertTrue(23==resultado);
	
	}
	@Test
	public void convertirXXVI() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("XXVI");
		assertTrue(26==resultado);
	
	}
	@Test
	public void convertirDIII() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("DIII");
		assertTrue(503==resultado);
	
	}
	@Test
	public void convertirDXLVIII() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("DXLVIII");
		assertTrue(548==resultado);
	
	}
	@Test//VALIDAR LETRAS QUE NO SE DEBEN REPETIR SEGUIDAMENTE
	public void convertirDD() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("DD");
		assertTrue(-1==resultado);
	
	}
	@Test
	public void convertirIVX() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("IVX");
		assertTrue(-1==resultado);
	
	}
	@Test
	public void convertirIL() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("IL");
		assertTrue(-1==resultado);
	
	}
	@Test//validar que el numero ingresado sea correcto
	public void convertirLM() {
		Conversion conversion= new Conversion();
		int resultado=conversion.convertir("LM");
		assertTrue(-1==resultado);
	
	}

}
