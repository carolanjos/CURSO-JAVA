/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contador01teste;

/**
 *
 * @author Suporte
 */
public class Contador01Teste {

    public static void main(String[] args) {
        int cc = 0;
        while(cc<=10){
           cc++;
           if (cc == 2 || cc == 3 || cc == 4) { 
              continue;
           }
           if (cc == 7){
              break; 
           }
           System.out.println("Cambalhota " + cc); 
        }
    }
}
