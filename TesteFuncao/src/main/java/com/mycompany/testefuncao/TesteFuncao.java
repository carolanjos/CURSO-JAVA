/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testefuncao;

/**
 *
 * @author Suporte
 */
public class TesteFuncao {
    
    static int soma(int a, int b){ 
        int s = a + b;
        return s; 
    }

    public static void main(String[] args) {
        System.out.println("Comecou o programa");
        int sm = soma(5,2);   
        System.out.println("A soma vale: " + sm);
    }
}