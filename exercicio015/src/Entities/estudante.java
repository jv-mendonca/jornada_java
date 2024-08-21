package Entities;


public class estudante {
    public String nome;
    public double primeiraNota, segundaNota, terceiraNota;

    public double notaFinal() {
        if (primeiraNota < 0 || primeiraNota > 30 || segundaNota < 0 || segundaNota > 35 || terceiraNota < 0 || terceiraNota > 35) {
            System.out.println("Erro: As notas devem estar entre 0 e 35");
            return -1;
        } else {
            double notaTotal = primeiraNota + segundaNota + terceiraNota;
            double notaMinima = 60;

            if (notaTotal >= notaMinima) {
                System.out.println("Aluno Aprovado!");
            } else {
                double pontosFaltantes = notaMinima - notaTotal;
                System.out.println("Aluno Reprovado");
                System.out.println("Faltam " + pontosFaltantes + " pontos para a aprovação.");
            }
            return notaTotal;
        }
    }
}
