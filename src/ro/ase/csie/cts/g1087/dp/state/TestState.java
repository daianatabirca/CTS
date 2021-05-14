package ro.ase.csie.cts.g1087.dp.state;

public class TestState {

	public static void main(String[] args) {
		SuperErou superman = new SuperErou("Superman", 100);
		
		//are setata starea initiala de miscare normala
		//celelalte stari se seteaza in interiorul clasei obiect 
		superman.seDeplaseaza();
		superman.esteAtacat(50); //s-a setat noua miscare sau s-a pastrat vechia stare
		superman.seDeplaseaza();
		
		superman.esteAtacat(45);
		superman.seDeplaseaza();
		
		superman.seVindeca(30);
		superman.seDeplaseaza();

	}

}
