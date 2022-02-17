import java.util.Arrays;
public class P0231Matriz {
    public static void main(String args[]) {
        //Criação vazia
        double m[][] = new double[3][4];
        //Preenchimento da matriz
        for (int l=0; l<m.length; l++) {
            for (int c=0; c<m[l].length; c++) {
                m[l][c] = l*m[l].length + c;
            }
        }
        //Visualização
        for (int l=0; l<m.length; l++) {
            for (int c=0; c<m[l].length; c++) {
                System.out.print(m[l][c] + "\t");
            }
            System.out.println();
        }
        System.out.println("=======================================");
        //Criação com inicialização de valores
        int m2x3[][] = {{1,2,3},{4,5,6}};
        //Visualização
        for (int l=0; l<m2x3.length; l++) {
            for (int c=0; c<m2x3[l].length; c++) {
                System.out.print(m2x3[l][c] + "\t");
            }
            System.out.println();
        }
        System.out.println("=======================================");
        int m3x2[][] = {{1,2}, {3,4}, {5,6}};
                //Visualização
        for (int l=0; l<m3x2.length; l++) {
            for (int c=0; c<m3x2[l].length; c++) {
                System.out.print(m3x2[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
