public class Escopo {
    public static void main(String args[]){
        int i = 5;
        {
            int j = 0;
            System.out.println(i);
            j = 5 * i;
            System.out.println(j);
            {
                System.out.println(i);
                System.out.println(j);
            }
        }
        System.out.println(i);
        //Programa não compilará porque este uso de j está fora de seu escopo
        //System.out.println(j);
    }
}
