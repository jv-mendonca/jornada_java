/*
Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo.
Calcule e mostre o comprimento da hipotenusa.
 */
package Application;

import entities.hypotenuse;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        hypotenuse hypot = new hypotenuse();

        System.out.println("Cateto Adjacente: ");
        hypot.catetoAdjacente = sc.nextDouble();

        System.out.println("Cateto Oposto: ");
        hypot.catetoOposto = sc.nextInt();

        System.out.println(hypot);


        sc.close();

    }
}
