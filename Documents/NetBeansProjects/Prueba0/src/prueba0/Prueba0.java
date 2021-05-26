/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba0;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class Prueba0 {

     
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    
        System.out.println("Ingresa el numero de tu serie Fibonacci: ");
        int num = sc.nextInt();
        System.out.println(num);
        int inicio = 1, num1 = 0, num2 = 1;
        for (int i = 0; i < num; i++){
            System.out.println("El numero es : "+inicio);
            inicio = num1 + num2;
            num1 = num2;
            num2 = inicio;
             
        }
            
    }
    
}
