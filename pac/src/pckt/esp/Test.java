/*
TESTANDO CONSTRUÇÃO MANUAL DE PACOTES
Adaptado(1) do exemplo disponível em:
https://github.com/janiosl/Java/blob/main/GP_Java/JGP4/Cap003_POO/README.md

(1) Para adaptação foi substituída a estrutura de diretórios da seguinte forma:
DE ==>
    D:\JGP4\Cap003_POO\src\jandl\jgp4
    D:\JGP4\Cap003_POO\bin
PARA ==>
    D:\Java\pac\src\pckt\esp
    D:\Java\pac\bin
*/
import pckt.esp.*;
//A importação acima substitui as linhas comentadas abaixo
//import pckt.esp.Esporte;
//import pckt.esp.Lutador;
//import pckt.esp.Pessoa;
public class Test {
    public static void main(String[] args) {
        //Criação do esporte
        Esporte k = new Esporte();
        k.setEsporte("Karate");
        k.setTipo("Luta");
        k.setCompetidores(2);
        k.setColetivo(false);
        System.out.println(k.toString());
        //Criação do lutador
        Lutador l1 = new Lutador("Janio", k);
        l1.setIdade(41);
        l1.setPeso(71.5f);
        System.out.println(l1.toString());
    }
}
