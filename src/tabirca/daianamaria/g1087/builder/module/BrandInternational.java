package tabirca.daianamaria.g1087.builder.module;

public class BrandInternational implements InterfataBrand {
	String denumire;
	boolean esteDeLux;

	public BrandInternational(String denumire, boolean esteDeLux) {
		super();
		this.denumire = denumire;
		this.esteDeLux = esteDeLux;
	}

	@Override
	public String toString() {
		return "BrandInternational [denumire=" + denumire + ", esteDeLux=" + esteDeLux + "]";
	}

}
