/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie2.cw2;

import java.util.Scanner;

/**
 *
 * @author glapi
 */
public class Cw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > 3 && number < 5) {
            System.out.println(number + " is in interval (3, 5)");
        }
    }
}
