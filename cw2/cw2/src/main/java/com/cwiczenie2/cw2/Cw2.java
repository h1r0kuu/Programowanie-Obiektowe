/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie2.cw2;

import java.util.Random;

/**
 *
 * @author glapi
 */
public class Cw2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(50) + 1;
        for(int i = 2; i <= 9; i++) {
            if(a % i == 0) {
                System.out.println(a + " jest podzielne przez " + i);
            }
        }
    }
}
