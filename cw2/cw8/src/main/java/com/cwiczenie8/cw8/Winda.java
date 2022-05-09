/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie8.cw8;

/**
 *
 * @author glapi
 */
public class Winda {
    private int windaA = 0;
    private int windaB = 7;

    public void windaAGoing(int pietro) {
        System.out.println(pietro + " pietro, Winda " + "A("+ this.windaA +") jedzie.");
    }
    
    public void windaBGoing(int pietro) {
        System.out.println(pietro + " pietro, Winda " + "B("+ this.windaB +") jedzie.");
    }
    
    public int getWindaA() {
        return windaA;
    }

    public void setWindaA(int windaA) {
        this.windaA = windaA;
    }

    public int getWindaB() {
        return windaB;
    }

    public void setWindaB(int windaB) {
        this.windaB = windaB;
    }
    
}