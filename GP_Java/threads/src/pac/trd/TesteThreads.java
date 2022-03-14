import pac.trd.*;
public class TesteThreads {
    public static void main(String args[]) {
        System.out.println("Start: main");
        P0801Thread mt1 = new P0801Thread(), mt2 = new P0801Thread(), mt3 = new P0801Thread();
        mt1.start();
        mt2.start();
        mt3.start();        
        System.out.println("End: main");
    }
}
