package ro.ase.csie.cts.seminar4.singleton;

public class Elvis {
	
	public final static Elvis theTrueElvis = new Elvis(); //singleton (FINAL = important)
	
	private Elvis() {
		
	}
	
	public void sing() {
		System.out.println("Elvis is singing");
	}

}
