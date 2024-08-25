/*
Faça um programa para ler a cotaçao do dolar, e depois um valor em dolares
a ser comprado por uma pessoa em reais. Informando quantos reais a pessoa vai
pagar pelo dolares, considerando ainda que a pessoa tera que pagar 6% de IOF
sobre o valor em dolar
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import util.conversorDeMoeda;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos dolares serao comprados: ");
        double dolar = sc.nextDouble();

        double resultado = conversorDeMoeda.valorReais(dolar);

        System.out.printf("Valor a ser pago em reais: %.2f",resultado);

        sc.close();
    }
}
