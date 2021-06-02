package ro.ase.csie.cts.g1087.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1087.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.g1087.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1087.testare.modele.Student;

public class TestStudentAlteTeste {
	
	//test fixture
	
	static Student student;
	static ArrayList<Integer> note;
	static String numeInitial;
	static int varstaInitiala;
	static int nrNoteInitiale;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		note = new ArrayList<>();
		nrNoteInitiale = 3;
		Random random = new Random();
		for(int i=0; i < nrNoteInitiale; i++) {
			note.add(random.nextInt(Student.MAX_NOTA) + 1);
		}
		numeInitial = "Daiana";
		varstaInitiala = Student.MIN_VARSTA + 1;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(numeInitial, varstaInitiala, note);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMinInt() throws ExceptieVarsta {
		int varstaNoua = Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}
	
	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMaxInt() throws ExceptieVarsta {
		int varstaNoua = Integer.MAX_VALUE;
		student.setVarsta(varstaNoua);
	}
	
	@Test
	public void testSetVarstaBoundaryVarstaMinimaRight() throws ExceptieVarsta {
		int varstaNoua = Student.MIN_VARSTA;
		student.setVarsta(varstaNoua); //nu ma astept la eroare
		int varstaModificata = student.getVarsta();
		assertEquals("Test pt limita inferioara varsta", varstaNoua, varstaModificata);
	}
	
	@Test
	public void testSetVarstaBoundaryVarstaMaximaRight() throws ExceptieVarsta {
		int varstaNoua = Student.MAX_VARSTA;
		student.setVarsta(varstaNoua); //nu ma astept la eroare
		int varstaModificata = student.getVarsta();
		assertEquals("Test pt limita superioara varsta", varstaNoua, varstaModificata);
	}
	
	@Test
	public void testSetNoteRefereneceDeepCopy() throws ExceptieNota { //nu ne intereseaza exceptia
		ArrayList<Integer> note = new ArrayList<>();
		note.add(10);
		note.add(10);
		note.add(10);
		student.setNote(note);
		
		
		int[] noteStudent = new int[student.getNrNote()];
		for(int i=0; i<student.getNrNote(); i++) {
			noteStudent[i] = student.getNota(i);
		}
		
		note.set(0, 5);
		
		int[] noteStudentDupaModificare = new int[student.getNrNote()];
		for(int i=0; i<student.getNrNote(); i++) {
			noteStudentDupaModificare[i] = student.getNota(i);
		}
		
		assertArrayEquals("Test modificare colectie note externa obiectelor", noteStudent, noteStudentDupaModificare);

	}
	
	@Test
	public void testGetMediePerformance() throws ExceptieNota {
		
		//NU aici = va inregistra si partea de definire a datelor
		//long tStart = System.currentTimeMillis();
		ArrayList<Integer> note = new ArrayList<>();
		int nrNote = 1000;
		for(int i=0; i<nrNote; i++) {
			note.add(Student.MAX_NOTA);
		}
		student.setNote(note);
		
		long tStart = System.currentTimeMillis();
		float medieCalculata = student.getMedie();
		long tFinal = System.currentTimeMillis();
		
		long durataMinima = 100; //100 milisecunde
		long durata = tFinal - tStart;
		if(durata <= durataMinima) {
			assertTrue(true);
		}
		else
		{
			fail("Testul a depasit durata minima");
		}
	}

}
