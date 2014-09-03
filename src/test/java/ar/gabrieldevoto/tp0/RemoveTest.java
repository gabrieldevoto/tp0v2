package ar.gabrieldevoto.tp0;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.gabrieldevoto.tp0.Abstract.Queue;
import ar.gabrieldevoto.tp0.Concrete.LinkedQueue;

public class RemoveTest {

	@Test (expected = AssertionError.class)
	public void colaVaciaArrojaAssertionError() {
		Queue unaCola = new LinkedQueue();
		
		unaCola.remove();
	}
	
	@Test
	public void colaConUnItemQuedaVaciaAlRemoverlo() {
		Queue unaCola = new LinkedQueue();
		
		unaCola.add(1);
		unaCola.remove();
		
		assertTrue(unaCola.isEmpty());
	}
	
	@Test
	public void colaConDosItemsNoQuedaVaciaAlRemoverUno() {
		Queue unaCola = new LinkedQueue();
		
		unaCola.add(new Object());
		unaCola.add(new Object());
		unaCola.remove();
		
		assertFalse(unaCola.isEmpty());
	}
	
	@Test
	public void removeRemueveElPrimerItem() {
		Queue unaCola = new LinkedQueue();
		Object primero = new Object();
		Object segundo = new Object();
		Object tercero = new Object();
		
		unaCola.add(primero);
		unaCola.add(segundo);
		unaCola.add(tercero);

		unaCola.remove();
		assertSame(segundo,unaCola.top());
	}

}
