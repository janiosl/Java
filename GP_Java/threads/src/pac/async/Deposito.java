package pac.async;
public class Deposito {
    protected int valor;
    public void armazenar (int valor) {
        this.valor = valor;
    }
    public int retirar () {
        return this.valor;
    }    
}
