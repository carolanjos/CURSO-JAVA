/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); 
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); 
        System.out.println("Digite a idade do aluno: ");
        int idade = teclado.nextInt(); 
        System.out.format("A nota de %s e %.1f e ela tem %d anos \n", nome, nota, idade);
    }
    
}
