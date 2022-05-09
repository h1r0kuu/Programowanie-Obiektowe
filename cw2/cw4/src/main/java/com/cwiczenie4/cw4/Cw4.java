/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie4.cw4;

import java.util.Random;

/**
 *
 * @author glapi
 */
public class Cw4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(50) + 1;
        int b = random.nextInt(5) + 1;
        System.out.println("Random a = " + a);
        System.out.println("Random b = " + b);
        String textTrue = a + " jest podzielnie przez " + b;
        String textFalse = a + " nie jest podzielnie przez " + b;
        String result = (a % b == 0) ? textTrue : textFalse;
        System.out.println( result );
    }
}
