public class Corrida {

    private double distancia, tarifaBase, fatorDemanda;
    private int tempoEspera;
    double valorFinal;

    public void setDistancia(double distancia){
        this.distancia = distancia;
    }

    public double getDistancia(){
        return distancia;
    }

    public void setTarifaBase(double tarifaBase){
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaBase(){
        return tarifaBase;
    }

    public void setFatorDemanda(double fatorDemanda){
        this.fatorDemanda = fatorDemanda;
    }

    public double getFatorDemanda(){
        return fatorDemanda;
    }

    public void setTempoEspera(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera(){
        return tempoEspera;
    }

    public void calcularValorCorrida(){
        valorFinal = (distancia*2) + (tempoEspera*0.5) + tarifaBase * fatorDemanda;
    }

    public void exibirDetalhes(){
        System.out.printf("Detalhes da Corrida!\nDistância %.2f Km\nTempo de Espera: %d Minutos\nTarifa Base: %.2f\nFator de demanda: %.2f\nValor Total: R$%.2f\n", distancia, tempoEspera, tarifaBase, fatorDemanda, valorFinal);
    }
}
