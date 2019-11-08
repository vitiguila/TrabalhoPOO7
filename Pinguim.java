package trabalho7;

public class Pinguim extends Ladrao{
	
	public void atirar() {
		System.out.println(getClass().getSimpleName() + " atirando...");
	}

	public void correr(float x, float y) {
		posicao_x = x;
		posicao_y = y;
		System.out.println(getClass().getSimpleName() + " correndo...");
	}
}
