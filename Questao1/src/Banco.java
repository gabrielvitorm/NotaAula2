public class Banco {

    protected String titular;
    protected int cpf;
    protected double saldoInicial = 0.0;


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldoInicial += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldoInicial >= valor) {
            saldoInicial -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public String exibirDados() {
        return  "Titular: " + titular + "\nCpf: " + cpf ;
    }

}