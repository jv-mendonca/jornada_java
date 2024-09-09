package application;

import java.util.Scanner;
import account.contaBancaria;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contaBancaria contaUsuario;

        System.out.print("Digite o numero da conta: ");
        int numero_conta = sc.nextInt();

        System.out.print("Digite o titular da conta: ");
        sc.nextLine();
        String nome_titula = sc.nextLine();

        System.out.print("Existe um deposito inicial (s/n) ?:");
        char resposta = sc.next().charAt(0);

        if (resposta == 's' || resposta == 'S'){
            System.out.print("Insira o valor do deposito inicial: ");
            double valorDepositoInicial = sc.nextDouble();
            contaUsuario = new contaBancaria(numero_conta,nome_titula, valorDepositoInicial);
        }
        else {
            contaUsuario = new contaBancaria(numero_conta, nome_titula);
        }
        System.out.println("Dados da Conta: ");
        System.out.println(contaUsuario);

        System.out.print("Quer fazer um [D]eposito ou [S]acar: ");

        resposta = sc.next().charAt(0);
        resposta = Character.toUpperCase(resposta);

        if (resposta == 'D'){
            System.out.println("Valor do deposito: ");
            double valorDeposito = sc.nextDouble();
            contaUsuario.depositar(valorDeposito);

            System.out.println("Dados da conta Atualizado");
            System.out.println(contaUsuario);

        }
        else if  (resposta == 'S'){
            System.out.println("Insira o valor para Saque: ");
            double valorSaque = sc.nextDouble();
            contaUsuario.sacar(valorSaque);

            System.out.println("Dados da conta Atualizado");
            System.out.println(contaUsuario);


        }




    }
}
