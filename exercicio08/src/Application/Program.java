/*
Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Qual é o preço do produto? R$: ");
        double valorProduto = sc.nextDouble();

        double valorDesconto = valorProduto - (valorProduto * 5 / 100);

        System.out.printf("O produto que custava R$%.2f, na promoçao com desconte de 5%% vai custar R$%.2f", valorProduto,valorDesconto);
    }
}
