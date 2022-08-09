/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author Suporte
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 4;
        n2 = 8; 
        r = (n1>n2)? n1+n2:n1-n2; //como n1 não é maior que n2, vai aparecer 1 e não 0 
        System.out.println(r); 
    }
    
}
