package Entities;

public class funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void novoSalario(double porcetagem){
        salarioBruto += salarioBruto * porcetagem / 100.00;
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f",salarioBruto);
    }
}

