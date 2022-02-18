/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cap03metodos;

/**
 *
 * @author janio
 */
public class P0301Hora {
    public int hor, min, seg;
    public void setHorario(int h, int m, int s) {
        hor = h;
        min = m;
        seg = s;
    }
    public String toString() {
        return hor + ":" + min + ":" + seg;
    }
}
