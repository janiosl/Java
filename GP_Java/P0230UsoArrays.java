import java.util.Arrays;
import java.util.Scanner;
public class P0230UsoArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int tamanho = sc.nextInt();
        System.out.print("Real filling: ");
        double valor = sc.nextDouble();
        double arr1[] = new double[tamanho];
        Arrays.fill(arr1, valor);
        System.out.println(Arrays.toString(arr1));
    }
}
