import java.io.*;
public class LeituraBytes {
	public static void main(String a[]) {
		if (a.length == 0 || a.length >1) {
			//Caso não receba argumentos
			//Orienta sobre o uso e finaliza o programa
			System.out.println("Argumentos errados ou ausentes. Uso:\njava LeituraBytes <nomeArquivo>");
			System.exit(-1);
		}
		System.out.println("=".repeat(40));
		//Abertura do arquivo e confirmação
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream(a[0]));
			System.out.println("Arquivo '" + a[0] + "' aberto.");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);			
		}
		//Leitura dos dados
		try {
			int j = 0;
			System.out.println("-".repeat(40));
			System.out.println("byte number : int value : double value");
			while (dis.available() > 0) {
				int i = dis.readInt();
				double aux = dis.readDouble();
				System.out.println("byte #" + j + " : " + i + " : " + aux);
				j++;
			}
			
		} catch (EOFException eof) {
			System.out.println("Leitura do arquivo finalizada.");
			System.out.println("-".repeat(40));
			
		} catch (IOException e) {
			System.out.println(e);
		}
		//Fechamento do arquivo
		try {
			dis.close();
			System.out.println("Arquivo '" + a[0] + "' fechado.");
			System.out.println("=".repeat(40));
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}