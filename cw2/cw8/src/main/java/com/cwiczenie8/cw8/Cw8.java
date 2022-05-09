/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwiczenie8.cw8;

import java.util.Scanner;

public class Cw8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int przypadki = scanner.nextInt();
        
        Winda winda = new Winda();
        for(int i = 0; i < przypadki; i++) {
            int pietro = scanner.nextInt();
            
            if(pietro >= 0 && pietro <= 7) {
                int windaA = winda.getWindaA();
                int windaB = winda.getWindaB();
                int lower = roznica(windaA, windaB, pietro);
                
                if(lower == positive(windaA, windaB)) {
                    if(windaA < windaB) {
                        System.out.println(pietro + " pietro, Winda " + "A("+ windaA +") i B("+windaB+") sa w rownej odlegloci wiec jedzie winda A.");
                        winda.setWindaA(pietro);
                    } else {
                        System.out.println(pietro + " pietro, Winda " + "A("+ windaA +") i B("+windaB+") sa w rownej odlegloci wiec jedzie winda B.");
                        winda.setWindaB(pietro);
                    }
                } else {
                    if(positive(windaA, pietro) == lower) {
                        winda.windaAGoing(pietro);
                        winda.setWindaA(pietro);
                    } else {
                        winda.windaBGoing(pietro);
                        winda.setWindaB(pietro);
                    }
                }
            }
        }
    }
    
    public static int positive(int a, int b) {
        return (a - b) > 0 ? (a - b) : -1 * (a -b);
    }
    
    public static int roznica(int windaA, int windaB, int pietro) {
        int roznicaA = positive(windaA, pietro);
        int roznicaB = positive(windaB, pietro);
        if(roznicaA < roznicaB) {
            return roznicaA;
        } else if(roznicaB < roznicaA) {
            return roznicaB;
        } else {
            return roznicaA + roznicaB;
        }
    }
   
}
