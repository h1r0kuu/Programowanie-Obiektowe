/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie6.cw6;

import java.util.Scanner;

/**
 *
 * @author glapi
 */
public class Cw6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.err.println("Jeden");
                break;
            case 2:
                System.err.println("Dwa");
                break;
            case 3:
                System.err.println("Trzy");
                break;
            case 4:
                System.err.println("Cztery");
                break;
            case 5:
                System.err.println("Piec");
                break;
            default:
                throw new AssertionError();
        }
    }
}
