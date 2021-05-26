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
public class Calculadora {

    private final int num1;
    private final int num2;
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void Sumar (int num1, int num2){
        int suma = num1 + num2;
        System.out.println("El resultado es: "+suma);
    };
    public void Restar (int num1, int num2){
        int resta = num1 - num2;
        System.out.println("El resultado es: " +resta);
    };
    
    public void Multiplicar (int num1, int num2){
        int producto = num1 * num2;
        System.out.println("El resultado es: "+producto);
    };
     
    public void Dividir (int num1, int num2){
        int división = num1 / num2;
        System.out.println("El resultado es: "+división);
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Bienvenido a operaciones basicas");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.println("Ingresa una opción: ");
        int opc = sc.nextInt();
        switch(opc){
            case 1:
                System.out.println("********SUMA**********");
                System.out.println("Ingresa un numero: ");
                int num1 = sc.nextInt();
                System.out.println("Ingresa otro numero: ");
                int num2 = sc.nextInt();
                 Calculadora suma = new Calculadora (num1,num2);
                 suma.Sumar(num1, num2);
                 
                break;
            case 2:
                System.out.println("***********RESTA*********");
                System.out.println("Ingresa un numero: ");
                int num = sc.nextInt();
                System.out.println("Ingresa otro numero: ");
                int num0 = sc.nextInt();
                Calculadora resta = new Calculadora(num, num0);
                resta.Restar(num, num0); 
                break;
            case 3:
                System.out.println("*********MULTIPLICACION********");
                System.out.println("Ingresa un numero: ");
                int a = sc.nextInt();
                System.out.println("Ingresa otro numero: ");
                int b = sc.nextInt();
                Calculadora multiplicacion = new Calculadora(a, b);
                multiplicacion.Multiplicar(a, b);
                
                break;
            case 4:
                
                System.out.println("*********DIVISION********");
                System.out.println("Ingresa un numero: ");
                int c = sc.nextInt();
                System.out.println("Ingresa otro numero: ");
                int d = sc.nextInt();
                Calculadora division = new Calculadora(c, d);
                division.Dividir(c, d);
                
                break;
            default: 
                
        }
       
    }
}
