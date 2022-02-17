public class RepeticaoSimples {
    public static void main(String args[]) {
        //Contagem de 0 a 10
        System.out.println("Contagem de 0 a 10");
        for (int x = 0; x<=10; x++) {
            System.out.print(x + " ");
        }
        //Contagem regressiva de 10 a 0
        System.out.println("\nContagem regressiva de 10 a 0");
        for (int i=10; i>=0; i--) {
            System.out.print(i + " ");
        }
        //Contagem de 0 a 10 de 2 em 2
        System.out.println("\nContagem de 0 a 10 de 2 em 2");
        for (int j=0; j<=10; j+=2) {
            System.out.print(j + " ");
        }
    }
}
