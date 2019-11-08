package trabalho7;

public abstract class Heroi extends Personagem {

	public void correr(float x, float y) {
		posicao_x = x;
		posicao_y = y;
		System.out.println(getClass().getSimpleName());
	}

	public void saltar(float z) {
		posicao_z = z;
		System.out.println(getClass().getSimpleName() + " saltando...");
	}
}
