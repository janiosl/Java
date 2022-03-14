package pac.sync;
public class DepositoSync extends Deposito {
    private boolean ok = false; //Atributo sinalizador (flag)
    public synchronized void armazenar (int valor) {
        while (ok == true) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.valor = valor; //Registra o valor
        this.ok = true; //Atualiza flag
        notifyAll(); //Noticia outras threads
    }
    public synchronized int retirar () {
        while (ok == false) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.ok = false; // Atualiza flag
        notifyAll(); //Noticia outras threads
        return this.valor; //Retorna valor
    }
}
