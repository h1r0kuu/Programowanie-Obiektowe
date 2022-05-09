/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie5.cw5;

import java.util.Random;

/**
 *
 * @author glapi
 */
public class Cw5 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(5) + 1;
        int b = random.nextInt(5) + 1;
        System.err.println("a = " + a);
        System.err.println("b = " + b);

        if(a % b == 0) {
            System.err.println(a + " dzieli sie przez " + b);
        } else {
            System.err.println(a + " nie jest podzielne przez " + b);

        }
    }
}
