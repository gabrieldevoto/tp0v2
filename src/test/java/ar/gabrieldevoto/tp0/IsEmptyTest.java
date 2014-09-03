package ar.gabrieldevoto.tp0;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.gabrieldevoto.tp0.Abstract.Queue;
import ar.gabrieldevoto.tp0.Concrete.LinkedQueue;

public class IsEmptyTest {

	
	@Test
	public void colaNuevaEstaVacia() {
		
		Queue unaCola = new LinkedQueue();
		
		assertTrue(unaCola.isEmpty());
	}
	
	@Test
	public void colaConUnItemNoEstaVacia() {
		
		Queue unaCola = new LinkedQueue();
		unaCola.add(1);
		
		assertFalse(unaCola.isEmpty());
	}
	
	@Test
	public void colaCon100ItemsNoEstaVacia() {
		
		Queue unaCola = new LinkedQueue();
		
		for(int i = 0; i < 100; i++){
			unaCola.add(i);
		}
		
		assertFalse(unaCola.isEmpty());
	}

}
