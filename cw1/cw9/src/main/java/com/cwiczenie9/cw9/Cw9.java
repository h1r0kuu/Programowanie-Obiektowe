/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie9.cw9;

import java.util.Random;

/**
 *
 * @author glapi
 */
public class Cw9 {
    public static void main(String[] args) {
        Random random = new Random();
        float a = random.nextFloat(50);
        float b = random.nextFloat(50);
        float c = random.nextFloat(50);
        float d = random.nextFloat(50);
        System.err.println("A = " + a);
        System.err.println("B = " + b);
        System.err.println("C = " + c);
        System.err.println("D = " + d);
        System.out.println(a / 5);
        System.out.println(b / 5);
        System.out.println(c / 5);
        System.out.println(d / 5);

    }
}
