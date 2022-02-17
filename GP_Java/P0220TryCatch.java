public class P0220TryCatch {
    public static void main(String[] args) {
        try {
            //Código princial
            int j = Integer.parseInt(args[0]);
            while (j >= 0) {
                System.out.println(j);
                j--;
            }
        } catch (Exception e) {
            //Tratamento de exceções no código principal
            System.out.println("Argumento não foi dado ou não e inteiro");
        }
    }    
}
