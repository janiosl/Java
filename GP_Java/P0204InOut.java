import java.util.Scanner;

public class P0204InOut {
    public static void main(String args[]) {
        System.out.println("Olá!");
        System.out.print("Digite um inteiro: ");
        Scanner s = new Scanner(System.in); //Prepara entrada de dados
        int valor = s.nextInt(); //Declara e inicia a variável
        System.out.println("Valor = "+valor);
        s.close(); //Fecha o objeto leitor
    }
}
