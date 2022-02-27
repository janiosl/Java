package com.mycompany.projetopessoas;
public class ProjetoPessoas {
    public static void main(String args[]) {
        // TODO code application logic here
        try {
            Pessoa p1 = new Pessoa();
            Aluno p2 = new Aluno();
            Professor p3 = new Professor();
            Funcionario p4 = new Funcionario();
            
            //Registro dos nomes - atributo herdado
            p1.setNome("Pedro");
            p2.setNome("Maria");
            p3.setNome("Cláudio");
            p4.setNome("Fabiana");
            
            p1.setSexo("M");
            p4.setSexo("F");
            p2.setIdade(18);
            
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());
            System.out.println(p4.toString());
            
            //Registro de outros dados - atributos específicos
            p2.setCurso("Informática");
            p3.setSalario(2500.75f);
            p4.setIdade(19);
            p4.mudarTrabalho();
            
            System.out.println(p4.toString());
            
        } catch (Exception e) {
            System.out.println("Erro na execução.\nDetalhe: " + e);
        }
    }
}
