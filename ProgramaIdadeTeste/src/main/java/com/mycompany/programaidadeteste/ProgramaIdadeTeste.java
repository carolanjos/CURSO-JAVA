/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programaidadeteste;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class ProgramaIdadeTeste {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu? ");
        int nasc = t.nextInt();
        int i = 2015-nasc;
        System.out.println("Sua idade e " + i);
        if (i>=18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
}
