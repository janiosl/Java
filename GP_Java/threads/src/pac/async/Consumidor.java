package pac.async;
public class Consumidor extends Thread {
    private int quantidade;
    private Deposito deposito;
    public Consumidor (int quant, Deposito dep) {
        this.quantidade = quant;
        this.deposito = dep;
    }
    public void run() {
        System.out.println("Consumer [BEGIN]");
        int total = 0;
        for (int i=0; i<quantidade; i++) {
            int valor = deposito.retirar();
            System.out.println("Consumer [IN=" + valor + "]");
            total += valor;
        }
        System.out.println("Consumer [END total="+total+"]");
    }
}
