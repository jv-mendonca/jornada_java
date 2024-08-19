/*
Crie um programa que leia dois numeros e mostre a soma entre eles
*/
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.println("Digite um numero: ");
        int primeiroNumero = sc.nextInt();

        // Solicita ao usuário que digite outro número
        System.out.println("Digite outro numero: ");
        int segundoNumero = sc.nextInt();

        // Calcula a soma dos dois numero
        int soma = primeiroNumero + segundoNumero;

        // Exibe o resultado da soma
        System.out.printf("A soma vale: %d",soma);


        // Fecha o scanner
        sc.close();
    }
}





