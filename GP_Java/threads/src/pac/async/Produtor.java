package pac.async;
public class Produtor extends Thread {
    private int quantidade;
    private Deposito deposito;
    public Produtor(int quant, Deposito dep) {
        this.quantidade = quant;
        this.deposito = dep;
    }
    public void run () {
        System.out.println("Producer [BEGIN]");
        int total = 0;
        for (int i = 0; i<quantidade; i++) {
            int valor = (int)(Math.random()*1234);
            deposito.armazenar(valor);
            System.out.println("Producer [OUT=" + valor + "]");
            total += valor;
        }
        System.out.println("Producer [END total="+total+"]");
    }
}