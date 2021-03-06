package ro.ase.csie.cts.g1087.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ProfilPlayer player = new ProfilPlayer("Superman", 60, 5);
		player.setStrategieBonus(new StrategiePaste()); //a primit 50 -> setam strategia 
		player.getBonus();

		player.setStrategieBonus(new StrategieCraciun());
		player.getBonus();

		//OVERRIDE pentru o metoda pe care o scriem noi, fara a-i mai defini o clasa 
		player.setStrategieBonus(new InterfataBonus() {
			public int getPuncteBonus(ProfilPlayer player) {
				if(player.nrNiveluri >3)
					return 30;
				else return 0;
			}
		});
		player.getBonus();

}
}