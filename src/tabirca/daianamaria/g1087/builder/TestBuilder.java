package tabirca.daianamaria.g1087.builder;

import tabirca.daianamaria.g1087.builder.module.BrandInternational;
import tabirca.daianamaria.g1087.builder.module.GarantieExtinsa;
import tabirca.daianamaria.g1087.builder.module.OrigineItalia;
import tabirca.daianamaria.g1087.builder.module.PretScump;

public class TestBuilder {

	public static void main(String[] args) {

		Canapea canapeaCatifea = 
				new Canapea.CanapeaBuilder("Canapea Sophia", "Interior")
				.adaugaBrand(new BrandInternational("LUXDECO", true))
				.adaugaGarantie(new GarantieExtinsa(20))
				.adaugaTaraOrigine(new OrigineItalia(120))
				.adaugaPret(new PretScump(50.5))
				.build();
	
		System.out.println(canapeaCatifea.getBrandOrigine().toString());
		
		System.out.println(canapeaCatifea.getTaraOrigine().toString());

	}

}
