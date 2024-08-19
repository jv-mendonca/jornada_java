/*
Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
 */
package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o salario de um funcionario: ");
        double salarioFuncionario = sc.nextDouble();


        double novoSalario = salarioFuncionario + (salarioFuncionario * 15 / 100);

        System.out.printf("O novo salário do funcionário é R$%.2f%n", novoSalario);

    }
}
