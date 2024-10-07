public class ContaCorrente extends Banco{

    private double chequeEspecial = 1000.00;

    public void usarChequeEspecial(double valor) {
        if (valor > 0 && valor <= chequeEspecial) {
            setSaldoInicial(getSaldoInicial() - valor);
            System.out.println("Uso do cheque especial de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para uso do cheque especial.");
        }
    }
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldoInicial(getSaldoInicial() + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldoInicial()) {
            setSaldoInicial(getSaldoInicial() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }

    }
}