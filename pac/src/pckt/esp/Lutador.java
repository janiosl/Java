package pckt.esp;
public class Lutador extends Pessoa {
    //Atributos
    private int vitorias;
    private Esporte luta;
    //Métodos
    //Construtor
    public Lutador(String nome, Esporte luta) {
        this.setNome(nome);
        this.setVitorias(0);
        this.setLuta(luta);
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }
    public int getVitorias() {
        return this.vitorias;
    }
    public void setLuta(Esporte l) {
        this.luta = l;
    }
    public Esporte getLuta() {
        return this.luta;
    }
    //Visualização
    public String toString() {
        return "Lutador{lutador=" + super.toString() +
        "\nvitorias=" + this.getVitorias() + ", luta=" + this.getLuta() + "}";
    }    
}
