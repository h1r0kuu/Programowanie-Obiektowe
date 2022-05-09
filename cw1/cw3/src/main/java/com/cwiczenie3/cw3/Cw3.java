/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie3.cw3;

import java.util.Scanner;

/**
 *
 * @author glapi
 */
public class Cw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if(biggerThan(first, second)) {
            System.out.println(first + " bigger than " + second);
        } else {
            System.out.println(second + " bigger than " + first);

        }
    }
    
    public static boolean biggerThan(int a, int b) {
        if(a > b) {
            return true;
        }
        return false;
    }
}
