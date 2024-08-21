/*
Fazer um programa para ler o nome de um aluno e as tres notas que ele obteve
nos tres trimestres do ano (primeiro trimestre vale 30 e o segundo e o terceiro valem
35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer tambem se o aluno
aprovado (pass) ou nao (failed) e, em caso negativo, quantos pontos faltam
para o aluno obeter o minimo para ser aprovado (que é 60% da nota)
 */

package Application;

import Entities.estudante;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        estudante aluno = new estudante();

        System.out.println("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.println("Nota Primeiro semestre: ");
        aluno.primeiraNota = sc.nextDouble();

        System.out.println("Nota Segundo semestre: ");
        aluno.segundaNota = sc.nextDouble();

        System.out.println("Nota Terceiro semestre: ");
        aluno.terceiraNota = sc.nextByte();


        double notaFinal = aluno.notaFinal();

        if (notaFinal >= 0){
            System.out.println("Nota Final do aluno: " + notaFinal);
        }


        sc.close();


    }
}
