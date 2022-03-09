import java.io.*;
public class LeituraBytesCloseAut {
	public static void main(String a[]) {
		if (a.length == 0 || a.length >1) {
			//Caso não receba argumentos
			//Orienta sobre o uso e finaliza o programa
			System.out.println("Invalid arguments or no arguments informed. How to use:\njava LeituraBytesCloseAut <nomeArquivo>");
			System.exit(-1);
		}
		System.out.println("=".repeat(40));
		
		//Abertura do arquivo como recurso no try e fechamento implítico
		try (DataInputStream dis = new DataInputStream(new FileInputStream(a[0]))) {
		//OUTRA OPÇÃO MAIS RECOMENDADA - declaração antecipada do recurso
		//DataInputStream dis = new DataInputStream(new FileInputStream(a[0]));
		//try (dis) {			
			System.out.println("File '" + a[0] + "' open.");
			int j = 0;
			//Leitura do conteúdo
			System.out.println("---- Content ----");
			System.out.println("bye number : int value : double value");
			while (dis.available()>0) {
				int i = dis.readInt();
				double aux = dis.readDouble();
				System.out.println("byte #" + j + " : " + i + " : " + aux);
				j++;
			}
			System.out.println("---- Content ----");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);
		} catch (EOFException eof) {
			System.out.println("Reading the file finished.");
			System.out.println("-".repeat(40));
			
		} catch (IOException e) {
			System.out.println(e);
			System.exit(-1);
		}
		System.out.println("File '" + a[0] + "' closed.");
	}
}