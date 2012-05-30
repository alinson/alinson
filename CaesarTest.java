package br.edu.uniritter.examples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaesarTest {

	Caesar texto;
	
	@Before
	public void setUp() throws Exception {
		texto = new Caesar("the book is on the table z", 5);
	}

	@Test
	public void testCifra() {
		assertEquals("ymj gttp nx ts ymj yfgqj e", texto.cifra());
	}

}
