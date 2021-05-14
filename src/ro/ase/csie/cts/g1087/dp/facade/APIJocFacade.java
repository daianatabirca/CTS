package ro.ase.csie.cts.g1087.dp.facade;

public class APIJocFacade { //FACADE - inglobeaza
	
	public static ProfilJucator getProfil(String ipServer, int port, //intoarce referinta catre ProfilJucator (un profil)
			String numeUtilizator, String parola) { 
		
		ServerJoc server = new ServerJoc(ipServer,port); //cream un server pentru conectare la joc
		if(server.conectare()) { //returneaza true
			Utilizator utilizator = new Utilizator(); //cream un utilizator
			utilizator.login(numeUtilizator, parola); //se logheaza
			ProfilJucator profil = utilizator.getProfil(); //obtinem un obiect de tipul ProfilJucator
			return profil; //ne returneaza referinta 	
		}
		else 
			return null;
	}

}
