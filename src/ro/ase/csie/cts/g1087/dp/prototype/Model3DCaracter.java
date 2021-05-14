package ro.ase.csie.cts.g1087.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter implements Cloneable {
	
	String culoare;
	int inaltime;
	
	ArrayList<Integer> puncte = new ArrayList<>(); //vector de inturi (punctele) JUSTIFICA PROTOTYPE (deep-copy)

	public Model3DCaracter(String culoare) { //constructorul (pt crearea obiectului)
		this.culoare = culoare;
		System.out.println("Incarcare model 3D din fisier...");
		try {
			Thread.sleep(2000); //la 2 secunde (2000 milisec)
			
			Random random = new Random(10);
			for(int i=0;i<20;i++) { //20 nr
				this.puncte.add(random.nextInt(1000)); //genereaza nr intre 0 (inclusiv) si 1000 (exclusiv)
			}
			System.out.println("Model 3D generat");
		} catch (InterruptedException e) {
			
		}
	}

	private Model3DCaracter() { //constructor default PENTRU CLONARE 

	}

	//DEEP-COPY -> CLONE()
	//cloneaza obiectul (crearea este costisitoare), mai multe instante ale aceluiasi obiect
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Model3DCaracter copie = new Model3DCaracter(); //cream o instanta de Model3DCaracter in care retinem valorile (de copiat)
		copie.culoare = this.culoare;
		copie.inaltime = this.inaltime;
		copie.puncte = (ArrayList<Integer>) this.puncte.clone(); //deep-copy
		return copie; //copie e de tipul Object (ne returneaza copia)
	}

	
	
	
	
	
	

}
