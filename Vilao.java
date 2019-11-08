package trabalho7;

public abstract class Vilao extends Personagem{
	
	public void correr(float x, float y) {
		posicao_x = x;
		posicao_y = y;
		System.out.println(getClass().getSimpleName() + " correndo...");
	}
}
