public class PrintFormat {
    public static void main(String[] args) {
        double numero = 2.3f;
        double exp = 3.0f;
        double resultado = Math.pow(numero, exp);
        System.out.printf("%.2f ^ %.2f = %.2f", numero, exp, resultado);
    }    
}