/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie7.cw7;

import java.util.Scanner;

/**
 *
 * @author glapi
 */
public class Cw7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
    
    public static int fibo(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
