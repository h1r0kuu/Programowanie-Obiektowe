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
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        srednia(a, b, c);
    }
    
    public static void srednia(int... nums) {
        int numsLength = nums.length;
        int sum = 0;
        for(int i = 0; i < numsLength; i++) {
            sum += nums[i];
        }
        
        System.out.println( ((float)sum / (float)numsLength) );
    }
}
