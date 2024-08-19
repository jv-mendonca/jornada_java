package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double temperaturaCelsius = sc.nextDouble();

        // Fórmula para converter Celsius em Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        System.out.printf("A temperatura em Fahrenheit é: %.2f%n", temperaturaFahrenheit);

        sc.close();
    }
}
