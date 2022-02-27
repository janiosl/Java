package com.mycompany.projetopessoas;
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
        //A linha acima substitui toda a lógica abaixo invertendo o valor
        /*if (this.isTrabalhando()) {
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }*/
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
