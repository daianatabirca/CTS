package tabirca.daianamaria.g1087.flyweight;

public class Canvas {

	int dimX;
	int dimY;
	String culoareFill;
	String culoareStroke;

	public Canvas(int dimX, int dimY, String culoareFill, String culoareStroke) {
		super();
		this.dimX = dimX;
		this.dimY = dimY;
		this.culoareFill = culoareFill;
		this.culoareStroke = culoareStroke;
	}

	public int getDimX() {
		return dimX;
	}

	public int getDimY() {
		return dimY;
	}

	public String getCuloareFill() {
		return culoareFill;
	}

	public String getCuloareStroke() {
		return culoareStroke;
	}

}
