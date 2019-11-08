package trabalho7;

public abstract class Ladrao extends Vilao{

	public void saltar(float z) {
		posicao_z = z;
		System.out.println(getClass().getSimpleName() + " saltando...");
	}
}
