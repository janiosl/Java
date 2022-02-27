package com.mycompany.projetofinal;
public class Gafanhoto extends Pessoa {
    //Atributos específicos
    private String login;
    private int totAssistido;
    //Métodos
    //Específicos
    public void viuMaisUm() {
        this.totAssistido++;
        this.ganharExp();
    }

    //Implementação de abstratos
    @Override
    protected void ganharExp() {
        this.experiencia+=5;
    }
    //Getters e setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
        this.ganharExp();
    }
    //Visualização
    @Override
    public String toString() {
        //Construção manual do toString() com atributos da superclasse
        /*return "Gafanhoto{" + "nome=" + nome + ", idade=" + idade +
                ", sexo=" + sexo + ", experiencia=" + experiencia +
                " login=" + login + ", totAssistido=" + totAssistido + '}';*/
        //Construção simplificada carregando com super.toString()
        return "Gafanhoto{" + super.toString() +
                "\nlogin=" + login + ", totAssistindo=" + totAssistido;
    }
}
