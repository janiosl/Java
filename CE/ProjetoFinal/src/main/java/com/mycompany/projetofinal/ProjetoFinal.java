/*
PROJETO FINAL - POO EM JAVA
CURSO EM VÍDEO
*/
package com.mycompany.projetofinal;
//import java.util.Random;
public class ProjetoFinal {
    public static void main(String args[]) {
        //Programa Principal
        System.out.println("================= PC ==================");
        //Criando e interagindo com vídeo
        System.out.println("Testando classes de vídeos - v2");
        System.out.println("--------------------------");
        Video v1 = new Video();
        v1.setTitulo("Java POO Aula 01");
        System.out.println(v1.toString());
        v1.play();
        v1.like();
        v1.setAvaliacao(5);
        v1.play();
        v1.setAvaliacao(5);
        System.out.println("*** Análise após reprodução ***");
        System.out.println(v1.toString());
        v1.consultarAvalicao();
        v1.pause();
        Video v2 = new Video();
        v2.setTitulo("Python DS - Aula 01 de Ciência de Dados");
        System.out.println("*** Simulando várias avaliações reprodução ***");
        //Random aleatorio = Random();
        int a; 
        //Linha apenas para teste do aleatório
        //System.out.println("Aleatório: " + a);
        for (int i=0; i<=3; i++) {
            a = (int)((Math.random() * 10)/2);
            v1.play();
            System.out.println(" Avaliação: " + a + " ");
            v1.setAvaliacao(a);
        }
        v1.pause();
        System.out.println(v1.toString());
        v1.consultarAvalicao();
        System.out.println("Testando classes de gafanhotos");
        System.out.println("------------------------------");
        Gafanhoto g1 = new Gafanhoto();
        g1.setNome("Janio");
        g1.setIdade(41);
        g1.setSexo("M");
        g1.setLogin("morpheus31");
        System.out.println(g1.toString());
        g1.viuMaisUm();
        System.out.println(g1.toString());
        System.out.println("*** Simulando várias aulas assistidas ***");
        for (int i=0; i<8; i++) {
            g1.viuMaisUm();
        }
        System.out.println(g1.toString());
        System.out.println("Testando classe de visualização");
        System.out.println("------------------------------");
        //Gafanhoto g1 assiste ao Vídeo v1
        Visualizacao vis1 = new Visualizacao(g1, v1);
        vis1.avaliar();
        System.out.println(vis1.toString());
        //Gafanhoto g1 assiste ao Vídeo v2
        Visualizacao vis2 = new Visualizacao(g1, v2);
        vis2.avaliar(25.0f);
        System.out.println(vis2.toString());
        System.out.println("=========================================");
    }
}
