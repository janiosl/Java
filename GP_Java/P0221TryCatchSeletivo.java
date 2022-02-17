public class P0221TryCatchSeletivo {
    public static void main(String[] args) {
        try {
            //Código princial
            int j = Integer.parseInt(args[0]);
            while (j >= 0) {
                System.out.println(j);
                j--;
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            //Tratamento de exceções ausencia de argumento
            System.out.println("Argument not provided");
        } catch (NumberFormatException e2) {
            //Tratamento de exceções formato incorreto
            System.out.println("Argument is not an integer");
        }
    }    
}
