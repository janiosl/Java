package com.mycompany.projetopessoas;
public class Aluno extends Pessoa {
    //Atributos
    private int mat;
    private String curso;
    
    //Métodos
    //Personalizados
    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada");
    }
    
    //Getters e setters

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
