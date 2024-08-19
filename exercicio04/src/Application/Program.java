/*
Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Define o padrao de localizaçao para usar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler a entrada do usuario
        Scanner sc = new Scanner(System.in);

        // Solicita a primeira nota ao Usuario
        System.out.print("Primeira Nota: ");
        double primeiraNota = sc.nextDouble();

        // Solicita a segunda nota ao Usuario
        System.out.println("Segunda Nota: ");
        double segundaNota = sc.nextDouble();

        // Calcula a media aritmetica das notas
        double mediaAritmetica = (primeiraNota + segundaNota) / 2.00;

        // Exibe o resultado formatado
        System.out.printf("A media entre %.2f e %.2f é igual a %.2f", primeiraNota, segundaNota, mediaAritmetica);

        // Fecha o scanner
        sc.close();

    }
}
