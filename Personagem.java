package trabalho7;

public abstract class Personagem {
	private boolean vivo;
	protected float posicao_x;
	protected float posicao_y;
	protected float posicao_z;
	protected int cor;

	abstract void correr(float x, float y);

	abstract void saltar(float z);

	abstract void atirar();

	public void morrer() {
		vivo = false;
		System.out.println("Morto");
	}
}
