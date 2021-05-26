/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class Arreglo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Cuántos números aleatorios deseas? ");
        int aleatorio = sc.nextInt();
        System.out.println("¿Cual deseas que sea el limite de numero?");
        int limite = sc.nextInt();
        List<Double> array = new ArrayList<Double>();
        double suma = 0;
        for (int i = 0; i < aleatorio; i++) {
            double num = Math.round(Math.random() * limite + 1);
            System.out.println("\n Se ha ingresado " + num + " al arreglo ");
            array.add(num);

            suma += array.get(i);

            if (array.size() == aleatorio) {
                System.out.println(array);
                Collections.sort(array);
                System.out.println("La suma total de tu arreglo es: " + suma);
                System.out.println(array);
            }

             
        }
    
    }
}
