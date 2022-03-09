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
//Classe reimplementada para agilizar e evitar a necessidade de deixar tudo no mesmo pacote persist.ser
class Produto implements Serializable {
    String nome;
    int codigo;
    public Produto(String n, int c) {
            this.nome = n;
            this.codigo = c;
    }
    public String toString() {
        return "Produto[nome=" + this.nome + ", codigo=" + this.codigo + "]";
    }
}
