package tabirca.daianamaria.g1087.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DProdus implements Cloneable {

	String material;

	ArrayList<Integer> dimensiuni = new ArrayList<>();

	private Model3DProdus() {
	}

	public Model3DProdus(String material) {
		this.material = material;
		System.out.println("Incarcare model 3D pentru produs din fisierul fbx...");
		try {
			Thread.sleep(1000);

			Random random = new Random(10);
			for (int i = 0; i < 3; i++) {
				this.dimensiuni.add(random.nextInt(200));
			}
			System.out.println("Dimensiunile modelului s-au generat.");
		} catch (InterruptedException e) {

		}
		System.out.println("Generarea modelului s-a finalizat");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Model3DProdus produsCopie = new Model3DProdus();
		produsCopie.material = this.material;
		produsCopie.dimensiuni = (ArrayList<Integer>) this.dimensiuni.clone();
		return produsCopie;
	}

	@Override
	public String toString() {
		return "Model3DProdus [material=" + material + ", dimensiuni=" + dimensiuni + "]";
	}

}
