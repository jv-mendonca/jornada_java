/*
Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
 */
package Application;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite um número Inteiro
        System.out.print("Digite um numero: ");
        int numeroUsuario = sc.nextInt();

        // Calcula o dobro do numero inserido
        int dobro = numeroUsuario * 2;

        // Calcula o triplo do numero inserido
        int triplo = numeroUsuario * 3;

        // Calcula a raiz quadrada do número inserido
        double raizQuadrada = Math.sqrt(numeroUsuario);

        // Exibe os resultados
        System.out.printf("O dobro de %d e %d%n", numeroUsuario, dobro);
        System.out.printf("O triplo de %d e %d%n", numeroUsuario, triplo);
        System.out.printf("A raiz quadrada de %d e %.2f", numeroUsuario, raizQuadrada);

        // Fecha o Scanner
        sc.close();
    }
}
