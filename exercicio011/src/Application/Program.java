package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de Km percorridos: ");
        double kmPercorridos = sc.nextDouble();

        System.out.print("Quantidade de dias de aluguel: ");
        int diasAluguel = sc.nextInt();

        // Preço por dia de aluguel
        double precoPorDia = 60.0;
        // Preço por Km rodado
        double precoPorKm = 0.15;

        // Calcula o preço total a pagar
        double precoTotal = (precoPorDia * diasAluguel) + (precoPorKm * kmPercorridos);

        System.out.printf("O preço total a pagar é R$%.2f%n", precoTotal);

        sc.close();
    }
}
