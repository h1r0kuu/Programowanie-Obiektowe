/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie1.cw1;

/**
 *
 * @author glapi
 */
public class Cw1 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 0; ;i++) {
            if(i != 0) {
                if(i % 6 == 0) {
                    counter++;
                    System.out.println(i);
                    if(counter == 20) {
                        break;
                    }
                }
            }
        }
    }
}
