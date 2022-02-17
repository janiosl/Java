import java.util.Scanner;

public class SwitchMult {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o mes (numero): ");
        int mes = s.nextInt();
        int ndias;
        if (mes <= 12) {
            switch (mes) {
                case 1,3,5,7,8,10,12:
                    ndias = 31;
                    break;
                case 4,6,9,11:
                    ndias = 30;
                    break;
                default:
                    ndias = 28;
            }
            System.out.printf("Mes: %d\nDias: %d ", mes, ndias);
        } else {
            System.out.println("Valor invalido");
        }
    }    
}