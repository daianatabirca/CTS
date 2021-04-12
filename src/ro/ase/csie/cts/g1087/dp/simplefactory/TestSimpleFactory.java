package ro.ase.csie.cts.g1087.dp.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		boolean selectieTemaUniversala = true;
		
		SuperErouAbstract superCaracter = null;
		
		if(selectieTemaUniversala) {
			
			superCaracter = FactorySuperErou.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
			superCaracter = FactorySuperErou.getSuperErou(TipErou.DC, "Batman");
			superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
			
			superCaracter.setPuncteViata(100);
		} else 
		{
			//folosesti caractere din tema originala a jocului
		}

	}

}
