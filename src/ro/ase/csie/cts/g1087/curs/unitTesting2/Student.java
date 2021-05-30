package ro.ase.csie.cts.g1087.curs.unitTesting2;

import java.util.ArrayList;

//REGULI
//nume - minim 3 caractere (doar litere din alfabet si spatiu)
//     - maxim 255 caractere
//varsta - valori in intervalul [14, 90]
//note - valori in intervalul [1, 10]


//metodele genereaza exceptii de tipul 

public class Student {
	
	String nume;
	int varsta;
	ArrayList<Integer> note;
	
	//Conformance - test cu valori corecte pt care astept un obiect initializat cu acele valori
	//            - test cu valori invalide <= exceptii custom - specifice
	
	//Reference - nu vrem sa facem shallow - copy. Transmitem un ArrayList de note si modificam o nota in ArrayList-ul extern (cel trimis ca param)
	
	public Student(String nume, int varsta, ArrayList<Integer> note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	
	//Conformance - test cu valori corecte <= verific daca numele este modificat dupa apelul lui setNume
	//            - test cu valori invalide <= exceptie particulara
	
	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	//Conformance - test metoda cu valori in intervalul [14, 90]
	
	//Range - teste cu valori din intervalele identificate in analiza (cele 6 din paint)
	
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	//ATENTIE! NU IL AVEM
//	public ArrayList<Integer> getNote() {
//		return note;
//	}
	
	public int getNrNote() {
		return this.note.size();
	}
	
	public int getNota(int index) {
		return this.note.get(index);
	}
	

	public void setNote(ArrayList<Integer> note) {
		this.note = note;
	}
	
	//Conformance - test cu valori corecte <= media sa fie calculata corect
	//ex: pt 9,9,10, media asteptata este 9.33
	
	//
	
	public float getMedie2Zecimale() {
		return 0;
	}
	
	//Conformance - test cu un sir de note random (fara sortare)
	//ex: {9,7,8,10,9} <= nota minima 7
	
	//Ordering - test in care notele sunt sortate crescator/descrescator <= nota minima determinata corect
	//ex: {2,3,4,5,6,7} <= nota minima 2
	//ex: {7,6,5,4,3) <= nota minima 3
	
	//Existance - test cu note = null <= exceptie
	
	//Cardinalitate - test cu 0 note <= exceptie
	//              - test cu 1 nota <= media este nota respectiva
	//              - test cu >=2 note <= media este calculata corect 
	
	public int getNotaMinima() {
		return 0;
	}
	

}
