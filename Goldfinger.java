package trabalho7;

public class Goldfinger extends Terrorista implements Personificacao{
	private Heroi heroi;
	
	public void saltar(float z) {
		posicao_z = z;
		System.out.println(getClass().getSimpleName() + " saltando...");
	}

	public void personificar(Heroi heroi) {
		this.heroi = heroi;
		System.out.println("Personificando");
	}

	public void camuflar(int cor) {
		this.cor = cor;
	}
	
}
