import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DepositoCombustibleTest {
	
	private DepositoCombustible miDeposito;
	private DepositoCombustible otroDeposito=new DepositoCombustible(100.0,75.5);
	
	@Before
	public void antesQue() {
		miDeposito= new DepositoCombustible(100.0,0.0);
	}	
	
	@Test
	public void testGetDepositoNivel() {		
		assertNotNull(miDeposito.getDepositoNivel());
	}

	@Test
	public void testGetDepositoMax() {
		assertNotNull(miDeposito.getDepositoMax());
	}

	@Test
	public void testEstaVacio() {
		assertTrue(miDeposito.estaVacio());
		assertFalse(miDeposito.estaLleno());

	}

	@Test
	public void testEstaLleno() {
		assertFalse(otroDeposito.estaLleno());
		assertFalse(otroDeposito.estaVacio());
	}

	@Test
	public void testFill() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsumir() {
		fail("Not yet implemented");
	}

}
