/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie9.cw9;

import java.util.Scanner;

/**
 *
 * @author glapi
 */
public class Cw9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int N = scanner.nextInt();
        int bridges = N;
        for(int i = 1; ; i++) {
            if(bridges >= 0) {
                int patlu = i;
                if(bridges <= patlu) {
                    System.out.print(bridges + " ");
                    System.out.print("\nPatlu winner");
                    break;
                }
                System.out.print(patlu + " ");
                bridges -= i;
                int motu = i * 2;
                if(bridges <= motu) {
                    System.out.print(bridges);
                    System.out.print("\nMotu winner");
                    break;
                }
                System.out.print(motu + "\n");
                bridges -= motu;
            }
        }
    }
}
