/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie6.cw6;

import java.util.Random;

/**
 *
 * @author glapi
 */
public class Cw6 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(50);
        int b = random.nextInt(50);
        int c = random.nextInt(50);
        int d = random.nextInt(50);
        int f = random.nextInt(50);
        int suma = sum(a,b,c,d,f);
        System.err.println("A = " + a);
        System.err.println("B = " + b);
        System.err.println("C = " + c);
        System.err.println("D = " + d);
        System.err.println("F = " + f);
        System.err.println("Suma = " + suma);

        if(suma % 2 == 0) {
            System.err.println("Suma jest parzysta");
        } else {
            System.err.println("Suma nie jest parzysta");
        }
    }
    
    public static int sum(int... nums) {
        int suma = 0;
        for(int i = 0; i < nums.length; i++) {
            suma+= nums[i];
        }
        return suma;
    }
}
