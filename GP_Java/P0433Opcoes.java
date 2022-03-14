package gp.pk;
public enum P0433Opcoes{
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