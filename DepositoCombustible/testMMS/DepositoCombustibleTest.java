import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DepositoCombustibleTest {
	
	private DepositoCombustible miDeposito;
	private DepositoCombustible otroDeposito=new DepositoCombustible(100.0,75.5);
	private	double amount;

	@Before
	public void antesQue() {
		miDeposito= new DepositoCombustible(100.0,20.0);
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
		assertFalse(miDeposito.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		assertFalse(miDeposito.estaLleno());
	}

	@Test
	public void testFill() {		
		System.out.println("Capacidad del deposito: "+miDeposito.getDepositoMax());
		System.out.println("Liquido del deposito: "+miDeposito.getDepositoNivel());
		amount=30.0;
		miDeposito.fill(amount);
		System.out.println("Despues del llenado");
		System.out.println("Capacidad del deposito: "+miDeposito.getDepositoMax());
		System.out.println("Liquido del deposito: "+miDeposito.getDepositoNivel());
		double depNivelInicial=miDeposito.getDepositoNivel()-amount;		
		double depNivelFinal=miDeposito.getDepositoNivel();
		assertEquals(depNivelFinal,amount+depNivelInicial,0);
		
	}

	@Test
	public void testConsumir() {
		System.out.println("Nivel de liquido del deposito al inicio: "+miDeposito.getDepositoNivel());
		amount=10.0;
		miDeposito.consumir(amount);
		System.out.println("Nivel de liquido del deposito al final: "+miDeposito.getDepositoNivel());
		double depNivelInicial=miDeposito.getDepositoNivel()+amount;		
		double depNivelFinal=miDeposito.getDepositoNivel();
		assertEquals(depNivelFinal,depNivelInicial-amount,0);
		
	}
	
	@Test
	public void testNoSonIguales() {
		assertNotSame(miDeposito,otroDeposito);		
	}

}
