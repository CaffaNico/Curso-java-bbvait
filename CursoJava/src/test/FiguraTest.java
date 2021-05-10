package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;

public class FiguraTest {

	Figura circulo;
	Figura cuadrado;
	Figura triangulo;
	Figura rectangulo;
	Figura poligonoRegular;
	
	ArrayList<Figura> figuras;
	
	@Before
	public void setUp() throws Exception {
		cuadrado        = new Cuadrado("cua1",10);
		circulo         = new Circulo("cir1",7);
		triangulo       = new Triangulo("tri",12,8);
		rectangulo      = new Rectangulo("rec",15,10);
		poligonoRegular = new PoligonoRegular("poli",12,15,10);
		figuras         = new ArrayList<Figura>();
		figuras.add(      new Cuadrado("cua1",10));
		figuras.add(      new Circulo("cir1",10));
		figuras.add(      new Cuadrado("cua2",10));
		figuras.add(      new Circulo("cir2",10));
		figuras.add(      new Cuadrado("cua1",10));
		figuras.add(      new Circulo("cir3",10));
	
	}

	@After
	public void tearDown() throws Exception {
		cuadrado        = null;
		circulo         = null; 
		triangulo       = null;
		rectangulo      = null;
		poligonoRegular = null;
		figuras         = null;
	}

	/*@Test
	public void testCalcularPerimetro_cuadrado() {
		//valor esperado,metodo a tester,presicion
		assertEquals(40,cuadrado.calcularPerimetro(),0.1);
		
	}

	@Test
	public void testCalcularSuperficie_cuadrado() {
		assertEquals(100,cuadrado.calcularSuperficie(),0.1);
	}

	@Test
	public void testGetValores_cuadrado() {
		assertEquals("L=10.0",cuadrado.getValores());
	}*/
	
	@Test
	public void testCalcularPerimetro_circulo() {
		//valor esperado,metodo a tester,presicion
		assertEquals(43,circulo.calcularPerimetro(),1);
		
	}

	@Test
	public void testCalcularSuperficie_circulo() {
		assertEquals(14,circulo.calcularSuperficie(),0.1);
	}

	@Test
	public void testGetValores_circulo() {
		assertEquals("R=7.0",circulo.getValores());
	}
	
	@Test
	public void testGetNombre() {
		//assertEquals("cua1",cuadrado.getNombre());
		assertEquals("cir1",circulo.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode() {
		//Cuadrado cPrueba = new Cuadrado("cua1", 10);
		//assertTrue(figuras.contains(cPrueba));
		Circulo ciPrueba = new Circulo("cir1",10);
		assertTrue(figuras.contains(ciPrueba));
	}

}
