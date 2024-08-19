/*
Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a quantidade de
tinta necessária para pintá-la, sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura da parede (em metros): ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura da parede (em metros): ");
        double altura = sc.nextDouble();

        // Calcula a area da parede
        double area = largura * altura;

        // Calcula a quantidade d tinta necessaria
        double litrosDeTinta = area / 2.0;

        // Exibe o resultado
        System.out.printf("Para pintar uma parede de %.2f m x %.2f m %nVocê precisará de %.2f litros de tinta.%n", largura, altura, litrosDeTinta);


        sc.close();
    }
}
