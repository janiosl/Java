package com.mycompany.projetofinal;
public class Video implements AcoesVideo {
    //Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //Métodos
    //Poderia ser criado também o construtor
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    public void consultarAvalicao(){
        int estrelas = this.getAvaliacao()/this.getViews();
        System.out.print("Avaliação: " + estrelas + " estrelas -> " );
        for (int i=1; i <= estrelas; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //Implementação da interface de origem
    @Override
    public void play() {
        System.out.println("Reproduzindo vídeo...");
        this.setReproduzindo(true);
        this.views++;
    }
    @Override
    public void pause() {
        System.out.println("Vídeo pausado!");
        this.setReproduzindo(false);
    }
    @Override
    public void like() {
        System.out.println("Curti!");
        this.curtidas++;
    }
    
    //Getters e setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao += avaliacao;
        //this.avaliacao = (this.avaliacao)/this.getViews();
        //this.avaliacao /= this.getViews();
    }
    /*public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
    }*/

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
