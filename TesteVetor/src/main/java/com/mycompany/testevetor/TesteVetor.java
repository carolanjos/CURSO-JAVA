/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testevetor;

import java.util.Calendar;

/**
 *
 * @author Suporte
 */
public class TesteVetor {

    public static void main(String[] args) {
        //obter o ano atual do sistema
        Calendar calendario = GregorianCalendar.getInstance(); 
        int ano = calendario.get(Calendar.YEAR);
        
        //mes e dia: 
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",  
          "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"}; 
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i=0; i<mes.length; i++){
            //ano bissexto
            if((ano % 4 == 0) && (ano % 100 != 0))||(ano % 400 == 0)){ 
            dias[1] = 29;
            System.out.println("O mes de " + mes[i] + " tem " + dias[i]);
            //Não é ano bissexto
            }else{
              
        }
        
    }
}
