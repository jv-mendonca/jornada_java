/*
Fazer um programa par ler os valores da largura e altura de um retangulo.
Em seguida, mostre na tela o valor de sua area, perimetro e diagonal.
 */
package Application;

import Entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo rect =  new Retangulo();

        System.out.println("Insira a Largua e a altura do retangulo: ");

        System.out.print("Largura: ");
        rect.largura = sc.nextDouble();

        System.out.print("Altura: ");
        rect.altura = sc.nextDouble();

        System.out.println("-------- Resultado --------");
        System.out.println(rect);


        sc.close();



    }
}
