package account;


public class contaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    public contaBancaria(int numeroConta, String nomeTitula, double valorDeposito) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitula;
        depositar(valorDeposito);

    }

    public contaBancaria(int numeroConta, String nomeTitula) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitula;
    }


    public int getNumero_conta() {
        return numeroConta;
    }

    public String getNome_titular(){
        return nomeTitular;
    }

    public  double getsaldo_conta(){
        return saldoConta;
    }

    public void depositar(double valorDepositoInicial){
        if (valorDepositoInicial > 0){
            saldoConta += valorDepositoInicial;
        } else{
            System.out.println("Valor Invalido");
        }
    }

    public void sacar(double valorSaque){
        saldoConta -= valorSaque + 5.0;

    }

    public String toString(){
        return "Conta: "
                + numeroConta
                + ", Titular: "
                + nomeTitular
                + ", Saldo: "
                + String.format("%.2f",saldoConta);
    }
}
