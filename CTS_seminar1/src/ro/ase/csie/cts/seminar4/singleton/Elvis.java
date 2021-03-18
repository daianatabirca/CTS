package ro.ase.csie.cts.seminar4.singleton;

public class Elvis {
	
	private static Elvis theTrueElvis ; //SINGLETON (design pattern) (FINAL = important, daca instantiem aici (se creeaza la inceput, INCARCA mem)
	
	private Elvis() {
		
	}
	
	public static  Elvis getInstance() { //incapsulare, getter
//		synchronized (Elvis.class) {
//			if (theTrueElvis==null)
//				theTrueElvis = new Elvis();
//		}
		if (theTrueElvis==null)
			theTrueElvis = new Elvis();
		
		return theTrueElvis; //doar aici modificam daca nu mai vrem SINGLETON
	}
	
	public void sing() {
		System.out.println("Elvis is singing");
	}

}
