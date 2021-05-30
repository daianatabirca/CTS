package ro.ase.csie.cts.g1087.curs.unitTesting2.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1087.curs.unitTesting2.Student;
import ro.ase.csie.cts.g1087.curs.unitTesting2.exceptions.ExceptieStudentVarstaInvalida;

public class TestStudent {
	
	//test fixture
	public static final String NUME = "Daiana"; //pentru a nu mai putea fi modificate
	public static final int VARSTA = 21;
	public static final ArrayList<Integer> NOTE = new ArrayList<>();
	
	Student student;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception { //de fiecare data inainte fiecarui unit test
		NOTE.add(9);
		NOTE.add(10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception { //o singura data la finalul unit testelor
	}

	@Before
	public void setUp() throws Exception { //metoda utilitara - nu face parte din testare
		student = new Student(NUME, VARSTA, NOTE);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Right - Right - BICEP
	//Conformance - CORRECT
	
	@Test
	public void testConstructorRightInitializareAtribute() { //ar trebui sa facem teste pentru initializarea fiecarui atribut - nume, varsta, note
		String nume = "Daiana";
		int varsta = 21;
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		//verifica si pe atributele final
		
		Student student = new Student(nume, varsta, note);
		
		assertEquals("Numele nu este initializat corect", 
				nume, student.getNume());
		assertEquals("Varsta nu este initializata corect", 
				varsta, student.getVarsta());
		for(int i = 0; i < note.size(); i++) {
			assertEquals("Nota nu este initializata corect", 
					(int)note.get(i), student.getNota(i));
		}
	}
	
	@Test
	public void testConstructorRightCreareObiect() {	
		try {
			Student student = new Student(NUME, VARSTA, NOTE);
			assertNotNull(student); //verificam referinta
		}
		catch(Exception e) { //nu functioneaza din cauza exceptiei
			fail("Constructorul a generat exceptie pentru valori OK");
		}
	}
	
	@Test
	public void testSetVarstaRight() {
		//int varstaDiferita = 25;
		int varstaDiferita = VARSTA + 1; //nu avem voie sa modificam varsta, e FINAL
		
		student.setVarsta(varstaDiferita);
		
		assertEquals("Varsta nu este initializata corect", varstaDiferita, student.getVarsta()); //daca a fost modificata corect varsta prin set
	}
	
	@Test
	public void testGetMedie2ZecimaleRight() {
		ArrayList<Integer> note = 
				new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		student.setNote(note);
		
		float medieAsteptata = 9.33f;
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals("Media nu este calculata corect", medieAsteptata, medieCalculata, 0);	
	}
	
	//Error condition = daca dau valori incorecte, arunca exceptie?
	
	@Test(expected = ExceptieStudentVarstaInvalida.class)
	public void testSetVarstaConditiiEroare() {
		int varstaInvalida = -23;
		
//		try {
//		student.setVarsta(varstaInvalida); //ne asteptam sa arunce exceptie (pentru Error condition) -> nu cu fail
//		fail("Nu am primit exceptie!");
//		}
//		catch(ExceptieStudentVarstaInvalida e) {
//			assertTrue(true);
//		}	//in JUnit 3
		
		student.setVarsta(varstaInvalida);	//in JUnit 4
	}
	
}
