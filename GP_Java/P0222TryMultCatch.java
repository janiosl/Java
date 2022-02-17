public class P0222TryMultCatch {
    public static void main(String[] args) {
        try {
            //Código princial
            int j = Integer.parseInt(args[0]);
            while (j >= 0) {
                System.out.println(j);
                j--;
            }
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            //Tratamento de exceções ausencia de argumento
            System.out.println("Argument not provided or invalid");
        }
    } 
}
