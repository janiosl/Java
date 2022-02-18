/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.cap03metodos;

import java.util.HashSet;

/**
 *
 * @author janio
 */
public class Cap03Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        P0301Hora inicio = new P0301Hora();
        inicio.setHorario(12, 45, 38);
        System.out.println("Start: " + inicio.toString());
        //A classe criada permite erros lógicos como o seguinte
        P0301Hora horario = new P0301Hora();
        horario.hor = 44;
        horario.min = 1023;
        horario.min = -23;
        System.out.println("Start: " + horario.toString());
        //horario.set
        //A classe nova corrige este problema
        P0302Hora horario2 = new P0302Hora();
        //As linhas abaixo não são sequer aceitas porque os campos são private
        //horario2.hor = 44;
        //horario2.min = 1023;
        //horario2.min = -23;
        //A tentativa abaixo não gera o horário errado
        horario2.setHorario(44, 1023, -23);
        System.out.println("Start: " + horario2.toString());
    }
}