package ar.gabrieldevoto.tp0;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.gabrieldevoto.tp0.Abstract.Queue;
import ar.gabrieldevoto.tp0.Concrete.LinkedQueue;

public class IntegrationTest {

	@Test
	public void colarYDesencolarTest() {

		Queue unaCola = new LinkedQueue();
		
		for(int i = 0; i < 10; i++){
			unaCola.add(i);
		}
		
		for(int i = 0; i < 10; i++){
			assertSame(i,unaCola.top());
			unaCola.remove();
		}
		
		assertTrue(unaCola.isEmpty());
		
		try{
			unaCola.remove();
			fail("Deberia haber lanzado un AssertionError");
		}catch(AssertionError e){
		}
		
	}

}
