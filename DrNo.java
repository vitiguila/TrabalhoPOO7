package trabalho7;

public class DrNo extends Terrorista {

	public void saltar(float z) {
		posicao_z = z;
		System.out.println(getClass().getSimpleName() + " saltando...");
	}

	public void atirar() {
		System.out.println(getClass().getSimpleName() + " atirando...");
	}

	public void correr(float x, float y) {
		posicao_x = x;
		posicao_y = y;
		System.out.println(getClass().getSimpleName() + " correndo...");
	}

}
