package trabalho7;

public class Batman extends Heroi implements Camuflagem{

	public void atirar() {
		System.out.println(getClass().getSimpleName() + " atirando...");
	}

	public void camuflar(int cor) {
		this.cor = cor;
		System.out.println(getClass().getSimpleName() + " camuflando...");
	}
}
