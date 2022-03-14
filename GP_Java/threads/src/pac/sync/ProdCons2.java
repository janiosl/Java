import pac.sync.*;
public class ProdCons2 {
    public static void main(String args[]) {
        Deposito d = new DepositoSync();
        Produtor p = new Produtor(4, d);
        Consumidor c = new Consumidor(4, d);
        p.start();
        c.start();
    }
}
