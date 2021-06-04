package ro.ase.csie.cts.g1087.curs.testare2.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1087.curs.testare2.exceptii.ExceptieImpartireLaZero;
import ro.ase.csie.cts.g1087.curs.testare2.modele.OperatiiMatematice;

public class TestOperatiiMatematice {

	//se executa inaintea tuturor metodelor o singura data
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Salut");
	}

	//se executa la finalul exec. metodelor o singura data
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("La revedere");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Pregatire test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Stergere resurse folosite");
	}

	@Test
	public void test() {
		System.out.println("Test de test");
		//fail("Not yet implemented");
	}
	
	@Test 
	public void testAdunaValoriPozitive() {
		System.out.println("Test aduna");
		int a=5;
		int b=5;
		int rezultatAsteptat=10; //11
		int rezultatCalculat=OperatiiMatematice.aduna(a, b);
		
		assertEquals("Suma cu numere pozitive",rezultatAsteptat,rezultatCalculat);
	}
	
	@Test
	public void testImpartireValoriPozitive() {
		int a=1;
		int b=2;
		double rezultatAsteptat=0.5;
		double rezultatCalculat=0;
		
		//pe catch = fail pt ca testul nu testeaza exceptia
		try {
			rezultatCalculat = OperatiiMatematice.impartire(a, b);
		} catch (ExceptieImpartireLaZero e) {
			fail("Am primit exceptie desi nu trebuia");
		}
		
		assertEquals("Impartire cu numere pozitive", rezultatAsteptat, rezultatCalculat, 0.0000000000001); 
	}
}
