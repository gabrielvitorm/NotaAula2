public class Banco {

    protected String nome;
    protected double saldoInicial, aporte, depositar, sacar, saldoAtual;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAporte(double aporte){
        this.aporte = aporte;
    }

    public void setDepositar(double depositar){
        this.depositar = depositar;
    }

    public void setSacar(double sacar){
        this.sacar = sacar;
    }

    public void depositar(){
        saldoAtual += aporte;
    }
    

}
