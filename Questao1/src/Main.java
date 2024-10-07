import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaPoupanca cp = new ContaPoupanca();
        ContaCorrente cc = new ContaCorrente();
        Banco bc = new Banco();
        int x, z, y;

        do {
            System.out.println("Sistema Bancário. Selecione o tipo de Conta: ");
            System.out.println("1 para: Conta Corrente \n2 para: Conta Poupança");
            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Você escolheu a Conta Corrente.");
                    System.out.println("Digite seu nome: ");
                    cc.setTitular(sc.nextLine());
                    System.out.println("Digite seu CPF: ");
                    cc.setCpf(sc.nextInt());
                    System.out.println("1 para: Depositar \n2 para: Sacar \n3 para: Usar Cheque Especial.");
                    z = sc.nextInt();

                    switch (z) {
                        case 1:
                            System.out.println("Você escolheu depositar.");
                            System.out.println("Digite o valor do depósito: ");
                            double depositoCC = sc.nextDouble();
                            cc.depositar(depositoCC);
                            System.out.printf("Seu saldo é de R$%.2f\n", cc.getSaldoInicial());
                            break;
                        case 2:
                            System.out.println("Você escolheu sacar.");
                            System.out.println("Digite o valor do saque: ");
                            double saqueCC = sc.nextDouble();
                            cc.sacar(saqueCC);
                            System.out.printf("Seu saldo é de R$%.2f\n", cc.getSaldoInicial());
                            break;
                        case 3:
                            System.out.println("Você escolheu usar o cheque especial.");
                            System.out.println("Digite o valor a ser usado do cheque especial: ");
                            double chequeEspecial = sc.nextDouble();
                            cc.usarChequeEspecial(chequeEspecial);
                            System.out.printf("Seu saldo é de R$%.2f\n", cc.getSaldoInicial());
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Você escolheu a Conta Poupança. Digite:");
                    System.out.println("Digite seu nome: ");
                    cp.setTitular(sc.nextLine());
                    System.out.println("Digite seu CPF: ");
                    cp.setCpf(sc.nextInt());
                    System.out.println("1 para: Depositar \n2 para: Sacar \n3 para: Calcular Rendimento.");
                    z = sc.nextInt();

                    switch (z) {
                        case 1:
                            System.out.println("Você escolheu depositar.");
                            System.out.println("Digite o valor do depósito: ");
                            double depositoCP = sc.nextDouble();
                            cp.depositar(depositoCP);
                            System.out.printf("Seu saldo é de R$%.2f\n", cp.getSaldoInicial());
                            break;
                        case 2:
                            System.out.println("Você escolheu sacar.");
                            System.out.println("Digite o valor do saque: ");
                            double saqueCP = sc.nextDouble();
                            cp.sacar(saqueCP);
                            System.out.printf("Seu saldo é de R$%.2f\n", cp.getSaldoInicial());
                            break;
                        case 3:
                            System.out.println("Digite a taxa Selic atual:");
                            double selic = sc.nextDouble();
                            cp.setSelic(selic);
                            cp.calcularRendimento();
                            System.out.printf("Seu saldo após calcular rendimento é de R$%.2f\n", cp.getSaldoInicial());
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                default:
                    System.out.println("Opção de conta inválida.");
                    break;
            }

            System.out.println(bc.exibirDados());

            System.out.println("Para abrir o programa novamente digite 0");
            y = sc.nextInt();
            sc.nextLine();

        } while (y == 0);

        sc.close();
    }
}