/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie3.cw3;

/**
 *
 * @author glapi
 */
public class Cw3 {
    public static void main(String[] args) {
        int sum = 0;
        int counter=0;
        for(int i = 5;; i += 5) {
            sum += i;
            counter++;
            if(counter == 10) {
                break;
            }
        }
        System.err.println(sum);
    }
}
