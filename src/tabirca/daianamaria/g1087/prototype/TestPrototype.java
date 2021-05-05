package tabirca.daianamaria.g1087.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Model3DProdus canapea = new Model3DProdus("Lemn");

		Model3DProdus canapeaExtensibila = (Model3DProdus) canapea.clone();

		System.out.println(canapea.toString());
		System.out.println(canapeaExtensibila.toString());

	}

}
