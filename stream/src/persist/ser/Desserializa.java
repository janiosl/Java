import persist.ser.Produto;
import java.io.*;
import java.util.Date;
public class Desserializa {
    public static void main(String[] args) {
        //Tratamento dos argumentos
        if (args.length == 0) {
            System.out.println("No arguments provided.\nHow to use it: java Desserializa <nomeArquivo.ser>");
            System.exit(-1);
        }

        //Desserialização do objeto persistido
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(args[0]));) {
            System.out.println("File '" + args[0] + "' opened.");
            System.out.println("--- Content ---");
            //Recuperação dos dados da Classe Produto
            Produto p1 = (Produto) ois.readObject();
            System.out.println(p1);
            Date d1 = (Date) ois.readObject();
            System.out.println(d1);
            System.out.println("--- Content ---");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("File '" + args[0] + "' closed.");
    }
}