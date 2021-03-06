import persist.ser.Produto;
import java.io.*;
import java.util.Date;
public class Serializa {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.\nHow to use it: java Serializa <nomeArquivo.ser>");
            System.exit(-1);
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(args[0]));) {
            System.out.println("File '" + args[0] + "' opened");
            System.out.println("Creating content...");
            Produto p = new Produto("Orient Automatic Watch", 49);
            oos.writeObject(p);
            System.out.println(p);
            Date d = new Date();
            oos.writeObject(d);
            System.out.println(d);
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("File '" + args[0] + "' closed");
    }
}
