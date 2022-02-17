public class P0223TryCatchFinally {
    public static void main(String[] args) {
        int j = 5;
        try {
            //Código princial
            j = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            //Tratamento de exceções ausencia de argumento
            System.out.printf("Argument not provided or invalid.\nUsing default value [%d]...\n", j);
        } finally {
            while (j >= 0) {
                System.out.println(j);
                j--;
            }
        }
    } 
}
