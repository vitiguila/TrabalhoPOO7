package trabalho7;

public class JamesBond extends Heroi {

	public void atirar() {
		System.out.println(getClass().getSimpleName() + " atirando...");
	}

	public void saltar(float z) {
		posicao_z = z;
		System.out.println(getClass().getSimpleName() + " saltando...");
	}
}
