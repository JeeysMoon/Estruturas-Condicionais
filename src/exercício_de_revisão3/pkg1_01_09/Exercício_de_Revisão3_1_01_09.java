/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício_de_revisão3.pkg1_01_09;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Exercício_de_Revisão3_1_01_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Contrua um programa que receba dois números inteiros e verifique se eles estão em ordem crescente ou decrescente, 
         * O programa deve ser encerrado quando os dois números formados forem de igual valor. (Estruturas condicionais)
         */
    
    Scanner leitor = new Scanner(System.in);
    int valor1 = leitor.nextInt();
    int valor2 = leitor.nextInt();
    // Lê os valores direto sem imprimir
    
    while (valor1 != valor2) {
        if(valor1 < valor2) {
            System.out.println("Está na ordem crescente");
        } else {
            System.out.println("Está em ordem decrescente");
        }
        
         valor1 = leitor.nextInt();
         valor2 = leitor.nextInt();
    }
     
       
    }
    
}
