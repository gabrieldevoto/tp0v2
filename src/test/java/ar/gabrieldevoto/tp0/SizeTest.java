package ar.gabrieldevoto.tp0;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.gabrieldevoto.tp0.Abstract.Queue;
import ar.gabrieldevoto.tp0.Concrete.LinkedQueue;

public class SizeTest {

	@Test
	public void colaVaciaTieneTamanioNulo() {
		
		Queue unaCola = new LinkedQueue();
		
		assertEquals(0,unaCola.size());
	}
	
	@Test
	public void colaConUnItemNoTieneTamanioUno() {
		
		Queue unaCola = new LinkedQueue();
		
		unaCola.add(1);
		
		assertEquals(1,unaCola.size());
	}
	
	@Test
	public void colaCon100ItemNoTieneTamanio100() {
		
		Queue unaCola = new LinkedQueue();
		
		for(int i = 0; i < 100; i++){
			unaCola.add(i);
		}
		
		assertEquals(100,unaCola.size());
	}

}
