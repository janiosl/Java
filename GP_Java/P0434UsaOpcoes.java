import gp.pk.P0433Opcoes;
public class P0434UsaOpcoes {
	public static void main(String args[]) {
		System.out.println("Teste");
		for (P0433Opcoes constante: P0433Opcoes.values()) {
			System.out.printf("%-25s #%02d: %-20s\n", constante, constante.getValor(), constante.getNome());
		}
	}
	
}
/*
enum P0433Opcoes{
	COMPACTAR("Compactação", 0),
	DESCOMPACTAR("Descompactação", 1);
	private final String nome;
	private final int valor;
	P0433Opcoes(String n, int v) {
		nome = n;
		valor = v;
	}
	public int getValor() {
		return valor;
	}
	public String getNome() {
		return nome;
	}
	public String toString() {
		return nome + "(" + valor + ")";
	}
}
*/