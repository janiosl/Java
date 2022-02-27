package com.mycompany.projetofinal;
public class Visualizacao {
    //Atributos
    private Gafanhoto espectador;
    private Video filme;
    //Métodos
    //Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    //Métodos - polimorfismo sobrecarga
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 2;
        } else if (porc <= 50) {
            tot = 3;
        } else if (porc <= 90) {
            tot = 4;
        } else {
            tot = 5;
        }
        this.filme.setAvaliacao(tot);
    }
    //Getters e setters
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    //Visualização

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + "\nfilme=" + filme + '}';
    }
}
