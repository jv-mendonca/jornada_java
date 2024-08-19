/*
Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.
Valor do dolar U$5.41 dia 19/08/2024
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Configura o formato de numero para o padrao dos EUA
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto dinheiro voce tem na carteira: ");
        double real = sc.nextDouble();

        // Calcula o valor em dolares com base na taxa de cambio
        double dolar = real / 5.41;

        // Exibe o resultado formatado com duas casas decimais
        System.out.printf("Com R$%.2f voce pode comprar U$%.2f", real, dolar);

        sc.close();



    }
}
