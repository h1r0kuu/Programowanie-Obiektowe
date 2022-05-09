/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie8.cw8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author glapi
 */
public class Cw8 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(50);
        int b = random.nextInt(50);
        int c = random.nextInt(50);
        int[] array = {a,b,c};
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        bubbleSort(array);
    }
    public static void bubbleSort(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for(int j : arr) {
            System.out.println(j);
        }
    }
}
