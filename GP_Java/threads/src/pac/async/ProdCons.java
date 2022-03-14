import pac.async.*;
public class ProdCons {
    public static void main(String args[]) {
        Deposito d = new Deposito();
        Produtor p = new Produtor(4, d);
        Consumidor c = new Consumidor(4, d);
        p.start();
        c.start();
    }
}
