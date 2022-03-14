public class P0432Enum1 {
	public enum Opcoes {COMPACTAR, DESCOMPACTAR};
	public static void main (String args[]) {
		for (Opcoes opcao: Opcoes.values()) {
			System.out.println(opcao);
		}
		System.out.println("=====================");
		System.out.println(Opcoes.toString());
	}
}