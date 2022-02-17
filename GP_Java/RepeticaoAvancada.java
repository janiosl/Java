public class RepeticaoAvancada {
    public static void main(String args[]) {
        double arranjo[] = {1.1964, 6.1995, 6.1935, 7.1931, 12.1968};
        //Uso do for comum
        System.out.print("Simple For:   [");
        int tamanho = arranjo.length;
        for (int i = 0; i<tamanho; i++) {
            System.out.print(arranjo[i] + " ");
        }
        System.out.println("] End");
        //Uso do for avançado
        System.out.print("Advanced For: [");
        for (double elemento: arranjo) {
            System.out.print(elemento + " ");
        }
        System.out.print("] End");
    }
}
