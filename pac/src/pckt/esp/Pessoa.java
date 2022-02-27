package pckt.esp;
public abstract class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private float peso;
    //Métodos    
    //Getters e setters
    public void setNome(String n) {
        this.nome = n;
    }
    public String getNome() {
        return this.nome;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setPeso(float p) {
        this.peso = p;
    }
    public float getPeso() {
        return this.peso;
    }
    //Visualização
    public String toString() {
        return "Pessoa{nome=" + this.getNome() + ", idade=" + this.getIdade() +
        " anos, peso=" + this.getPeso() + "kg}";
    } 
}
