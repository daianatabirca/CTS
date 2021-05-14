package ro.ase.csie.cts.g1087.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		//metoda care cere mult timp etc. 
		ServerJoc server = new ServerJoc("10.0.0.1",3506);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login("Player1", "1234");
			ProfilJucator profil = utilizator.getProfil();
			String dateProfil = profil.getDateProfil();
		}

		//Simpligicare prin FACADE
		ProfilJucator profil2 = APIJocFacade.getProfil("10.0.0.1",3506, "Player2", "123456"); 
		//String dateProfil2 = profil2.getDateProfil();
		System.out.println(profil2.getDateProfil());
	}

}
