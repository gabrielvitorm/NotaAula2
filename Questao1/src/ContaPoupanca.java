public class ContaPoupanca extends Banco{

    private double selic;

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public void calcularRendimento() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = getSaldoInicial() * 0.005;
        } else {
            rendimento = getSaldoInicial() * (selic * 0.7 / 100);
        }
        setSaldoInicial(getSaldoInicial() + rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado.");
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