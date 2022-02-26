package pckt.esp;
public class Esporte {
    //Atributos
    public String esporte;
    public String tipo;
    public int competidores;
    public boolean coletivo;
    //Métodos
    //Getters e setters
    public void setEsporte(String e) {
        this.esporte = e;
    }
    public String getEsporte() {
        return this.esporte;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setCompetidores(int c) {
        this.competidores = c;
    }
    public int getCompetidores() {
        return this.competidores;
    }
    public void setColetivo(boolean c) {
        this.coletivo = c;
    }
    public boolean isColetivo() {
        return this.coletivo;
    }
    //Visualização
    public String toString() {
        return "Esporte{esporte=" + this.esporte + ", tipo=" + this.tipo + 
        ", competidores=" + this.competidores + ", coletivo=" + this.coletivo + "}";
    }   
}