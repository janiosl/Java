import java.io.*;
public class StreamBasic {
	public static void main (String args[]) {
		if (args.length ==0 || args.length>1) {
			System.out.println("Invalid arguments. How to use this:\njava StreamBasic <arquivo>");
			System.exit(-1);
		}
		System.out.println(" Basic Streaming with Java");
		System.out.println("---------------------------");
		try {
			//String arquivo = "arquivo.txt";
			DataInputStream in = new DataInputStream (
				new BufferedInputStream(
					new FileInputStream(args[0])));
			while (in.available()>0) {
				System.out.println(in.readInt());
			}
			in.close();
		} catch (EOFException eof) {
			System.out.println("Leitura do arquivo finalizada.");
			
		} catch (IOException e) {
			System.out.println("Erro de IO");
			e.printStackTrace();
		} finally {
			
			System.out.println("---------------------------");
			System.out.println("Programa encerrado");
		}
	}
}