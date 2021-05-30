package ro.ase.csie.cts.g1087.curs.unitTesting1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1087.curs.unitTesting1.OperatiiMatematice;

public class TestOperatiiMatematice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCalculMedieValoriCorecte() {
		int[] numere = new int[] {10,20,30};
		
		float medieAsteptata = 20;
		
		float medieNumere = OperatiiMatematice.calculeazaMedie(numere);	
		
		assertEquals("Calcul medie pentru 10, 20, 30", medieAsteptata, medieNumere, 0);
	}
	
	@Test
	public void testCalculMedieFaraValori() {
		int[] numere = new int[] {};
		
		float medieAsteptata = 0;
		
		float medieNumere = OperatiiMatematice.calculeazaMedie(numere);	
		
		assertEquals("Calcul medie pentru vector cu 0 elemente", medieAsteptata, medieNumere, 0);
	}
		

//		if(medieNumere != 20) {
//			fail("Functia nu calculeaza corect");
//			}
//		if(medieNumere == 20) {
//			System.out.println("Merge");
//		}
//		else
//			System.out.println("Nu merge");	
//		}
	//testul a trecut, scoatem validarile si facem altfel de verificari

}