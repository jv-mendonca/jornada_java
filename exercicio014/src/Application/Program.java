/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do
funcionário (nome e salário líquido). Posteriormente, aumentar o salário do funcionário com base em uma porcentagem dada
(somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
 */
package Application;

import Entities.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario func = new funcionario();

        System.out.println("Nome: ");
        func.nome = sc.nextLine();

        System.out.println("Salario Bruto: ");
        func.salarioBruto = sc.nextDouble();

        System.out.println("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.printf("Funcionario: %s%n",func);

        System.out.print("Digite a porcentagem de aumento do salário: ");
        double porcentagem = sc.nextDouble();

        func.novoSalario(porcentagem);

        System.out.printf("Atualizaçao do Salario Bruto do Funcionario: %s", func);

        sc.close();

    }
}
