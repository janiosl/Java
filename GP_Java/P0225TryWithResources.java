import java.io.*;
public class P0225TryWithResources {
    public static void main(String[] args) {
        try (InputStream recurso = new FileInputStream(args[0]);) {
            //uso do recurso
            System.out.println("Arquivo " + args[0] + " open ");
        } catch (IOException e1) {
            // tratamento de erro na obtenção do recurso
            System.out.println(e1);
        } //Finally não é declaro porque com esta sintaxe ele ocorre de maneira implícita
        System.out.println("File " + args[0] + "closed");
    }
}
