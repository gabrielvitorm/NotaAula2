import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,r;

        Scanner sc = new Scanner(System.in);
        Corrida cr = new Corrida();

        System.out.println("O programa vai calcular o valor da sua corrida!");
        System.out.println("Digite as distância em Km");
        cr.setDistancia(sc.nextDouble());

        System.out.println("Digite o tempo de espera em minutos:");
        cr.setTempoEspera(sc.nextInt());

        System.out.println("Digite o valor da tarifa base:");
        cr.setTarifaBase(sc.nextDouble());

        System.out.println("Digite o fator de demanda R$ (1,0 = normal, 1,5 = pico)");
        cr.setFatorDemanda(sc.nextDouble());

        do {
            System.out.println("Escolha uma das opções abaixo\n1 - Ver valor final da corrida\n2 - Ver detalhes da corrida");
            x = sc.nextInt();
            switch (x){
                case 1:
                    cr.calcularValorCorrida();
                    System.out.printf("O valor da corrida é de R$%.2f\n", cr.valorFinal);
                    break;
                case 2:
                    cr.exibirDetalhes();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }System.out.println("Para ver o menu novamente digite 0");
            r = sc.nextInt();
        }while (r==0);
    }
}