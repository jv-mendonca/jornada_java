/*
Crie um programa que leia um numero real qualquer pelo teclado e motre na tela a sua porçao inteira
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



    }
}
