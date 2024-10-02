import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,r,y,z;
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        System.out.println("Sistema Bancário");

        do {
            System.out.println("Escolha o tipo de conta\n1 - Conta Corrente\n2 - Conta Poupança");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Digite seu nome");
                    cc.setNome(sc.next());
                    do {
                        System.out.println("Escolha uma das opções abaixo\n1 - Depositar\n2 - Sacar\n3 - Usar cheque especial\n4 - Exibir detalhes da conta");
                        y = sc.nextInt();
                        switch (y){
                            case 1:
                                System.out.println("Digite o valor a ser depositado");
                                cc.setAporte(sc.nextDouble());
                                cc.depositar();
                                System.out.println("Depósito realizado!");
                                System.out.printf("Seu saldo é de R$%.2f\n", cc.saldoAtual);
                                break;
                        }System.out.println("Para ver o menu novamente digite 0");
                        z = sc.nextInt();
                    }while (z==0);
                    break;
            }System.out.println("Para ver o menu novamente digite 0");
            r = sc.nextInt();
        } while (r==0);
    }
}