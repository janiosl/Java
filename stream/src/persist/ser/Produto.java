package ser.persist;
import java.io.Serializable;
public class Produto implements Serializable {
    String nome;
    int codigo;
    public Produto(String n, int c) {
            this.nome = n;
            this.codigo = c;
    }
    public String toString() {
        return "Produto[nome=" + this.nome + ", codigo=" + this.codigo + "]";
    }
}
