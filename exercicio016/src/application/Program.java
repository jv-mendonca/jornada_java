/*
Fazer um programa para ler um valor numerico qualquer, e dai mostrar
quantp seria o valor de uma circunferencia e do volume de uma esfera
para um raio daquele valor. Informar tambem o valor de PI com duas casa decimais
 */
package application;

import util.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Valor do Raio: ");
        double raio = sc.nextDouble();

        double valorCircunferencia = calculadora.circunferencia(raio);

        double valorVolume =  calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", valorCircunferencia);
        System.out.printf("Volume: %.2f%n",valorVolume);
        System.out.printf("PI: %.2f%n", calculadora.PI);


        sc.close();
    }
}
