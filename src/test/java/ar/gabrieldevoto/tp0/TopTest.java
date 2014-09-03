package ar.gabrieldevoto.tp0;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.gabrieldevoto.tp0.Abstract.Queue;
import ar.gabrieldevoto.tp0.Concrete.LinkedQueue;

public class TopTest {

	@Test (expected = AssertionError.class)
	public void colaVaciaArrojaAssertionError() {
		Queue unaCola = new LinkedQueue();
		
		unaCola.top();
	}
	
	@Test
	public void colaConUnItem() {
		Queue unaCola = new LinkedQueue();
		Object contenido = new Object();
		
		unaCola.add(contenido);
		
		assertSame(contenido,unaCola.top());
	}
	
	@Test
	public void colaCon101Items() {
		Queue unaCola = new LinkedQueue();
		Object primero = new Object();
		
		unaCola.add(primero);
		
		for(int i = 0; i < 100; i++){
			unaCola.add(i);
		}
		
		assertSame(primero,unaCola.top());
	}
	
	@Test
	public void topNoVaciaLaCola() {
		Queue unaCola = new LinkedQueue();
		
		for(int i = 0; i < 100; i++){
			unaCola.add(i);
		}
		
		for(int i = 0; i < 100; i++){
			unaCola.top();
		}
		
		assertFalse(unaCola.isEmpty());
	}
	
	@Test
	public void topNoCambiaElPrimerElemento() {
		Queue unaCola = new LinkedQueue();
		
		Object primero = new Object();
		unaCola.add(primero);
		
		for(int i = 0; i < 100; i++){
			unaCola.add(i);
		}
		
		assertSame(primero,unaCola.top());
		assertSame(primero,unaCola.top());
		assertSame(primero,unaCola.top());
	}

}
