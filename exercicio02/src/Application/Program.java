/*
 Faça um programa que leia um número Inteiro e mostre na tela o seu sucessor e seu antecesso
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero Interio: ");
        int numeroUsuario = sc.nextInt();

        int sucesso = numeroUsuario + 1;
        int antecessor = numeroUsuario - 1;

        System.out.printf("O Sucessor de %d e %d",numeroUsuario, sucesso);
        System.out.printf("O Antecessor de %d e %d", numeroUsuario, antecessor);

        sc.close();
    }
}
