package ro.ase.csie.cts.g1087.curs.testare3.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1087.curs.testare3.exceptii.ExceptieNota;
import ro.ase.csie.cts.g1087.curs.testare3.exceptii.ExceptieNume;
import ro.ase.csie.cts.g1087.curs.testare3.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1087.curs.testare3.modele.Student;

public class TestStudent {

	//Test fixture 
		static Student student;
		static ArrayList<Integer> note;
		
		static String numeInitial="Daiana";
		static int varstaInitiala=21;

		@BeforeClass
		public static void setUpBeforeClass() throws Exception { 
			note=new ArrayList<>();
			note.add(9);
			note.add(10);
			note.add(8);
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception { //destructor logic 
		}

		@Before
		public void setUp() throws Exception { //studentul este recreat inainte de fiecare unit test
			student=new Student(numeInitial, varstaInitiala, note);
		}

		@After
		public void tearDown() throws Exception {
			student=null; //fortam stergerea 
		}

		@Ignore
		@Test
		public void test() {
			fail("Not yet implemented");
		}

		@Test
		public void testSetVarstaValoriNormaleRight() throws ExceptieVarsta { 
			int varstaNoua=Student.MIN_VARSTA+1;
			student.setVarsta(varstaNoua);
			assertEquals("Testare cu valori ok",varstaNoua, student.getVarsta());
		}
		
		@Test
		public void testSetNumeRight() { 
			
			String numeNou="Maria";
			try {
				student.setNume(numeNou);
				assertEquals("Testare cu valori corecte",numeNou, student.getNume());
			} catch (ExceptieNume e) {
				fail("Am primit exceptie pentru valori normale");
			}
		}
		
		@Test
		public void testSetVarstaErrorConditionsValoriNegative() { 
			int varstaNoua=-100;
			try {
				student.setVarsta(varstaNoua);
				fail("Nu am primit excp pt varsta cu valori negative");
			} catch (ExceptieVarsta e) {
				assertTrue(true); 
			}
		}
		
		@Test(expected = ExceptieVarsta.class) 
		public void testSetVarstaErrorConditionsValoriMari() throws ExceptieVarsta { 
			int varstaNoua=Student.MAX_VARSTA+100;
			student.setVarsta(varstaNoua);
		}
		
		@Test
		public void testGetNotaMinimaOrderingSortateCrescator() throws ExceptieNota {
			int notaMinima=4;
			ArrayList<Integer> noteSortate=new ArrayList<>();
			for(int i=0; i<5;i++) {
				noteSortate.add(notaMinima+i);
			}
			
			student.setNote(noteSortate);
			int notaDeterminata=student.getNotaMinima();
			assertEquals("Test cu note sortate crescator",notaMinima, notaDeterminata);
		}
		
		@Test
		public void testGetNotaMinimaCardinalityZero() throws ExceptieNota {
			ArrayList<Integer> note=new ArrayList<>();
			student.setNote(note);
			
			int notaMinima=0;
			int notaMinimaCalculata=student.getNotaMinima();
			
			assertEquals("Test fara note", notaMinima, notaMinimaCalculata);
		}
		
		@Test
		public void testGetNotaMinimaCardinalityUnu() throws ExceptieNota {
			ArrayList<Integer> note=new ArrayList<>();
			note.add(Student.MAX_NOTA);
			student.setNote(note);
			
			int notaMinima=Student.MAX_NOTA;
			int notaMinimaCalculata=student.getNotaMinima();
			
			assertEquals("Test cu o singura nota", notaMinima, notaMinimaCalculata);
		}
		
		@Test
		public void testGetNotaMinimaExistenceReferintaNull() throws ExceptieNota {
			student.setNote(null);
			
			int notaMinima=0;
			int notaMinimaCalculata=student.getNotaMinima();
			
			assertEquals("Test cu referinta null pentru note", notaMinima, notaMinimaCalculata);
		}

}
