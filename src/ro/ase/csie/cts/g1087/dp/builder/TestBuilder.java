package ro.ase.csie.cts.g1087.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1. Construiesti obiectul -> dar nu avem cum, deoarece constructorul si atributele sunt PRIVATE
		
//		SuperErou superErou = new SuperErou();
		
		//2. Initializarea atributelor -> NU SE POATE, deoarece constructorul este PRIVATE 
		
//		new SuperErou("Batman", 100, false, false, new Arma(), null, null, null);

		//Vom folosi, asadar, clasa statica din interiour clasei principale (outer class)
		
		SuperErou superman =
				new SuperErou.SuperErouBuilder("Superman", 100)
				.setArmaDreapta(new Arma()) //new Arma(), deoarece interfata InterfataArma are o metoda
				.setArmaStanga(new Arma())
				.build();
		
		SuperErou joker = 
				new SuperErou.SuperErouBuilder("Joker", 150)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();
		SuperErou catwoman = 
				new SuperErou.SuperErouBuilder("Cat Woman", 120)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();

	}

}
