/*
Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.
 */
package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver sua Tabuada: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int multiplicacao = numero * i;
            System.out.printf("%d X %d = %d%n",numero , i , multiplicacao);

        }
        sc.close();
    }

}