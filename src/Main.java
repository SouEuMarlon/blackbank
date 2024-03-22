import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Marlon Menezes";
        String contaCorrente = "Corrente";
        double saldoCorrente = 2000.00;
        String contaPoupanca = "Poupança";
        double saldoPoupanca = 3000.00;
        int opcao = 0;

        @SuppressWarnings("resource")
        Scanner leitura = new Scanner(System.in);

        while (opcao != 3) {

            System.out.println("Bem vindo(a) ao Black Bank " + nome + "\n");

            System.out.println("Selecione a opção desejada");

            System.out.println("1. Conta Corrente");
            System.out.println("2. Conta Poupança");
            System.out.println("3. Sair");

            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("\nConta Corrente\n");
                System.out.println("Digite a opção desejada\n");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Sair");

                int opcaoCCorrente = 0;

                @SuppressWarnings("resource")
                Scanner scannerCCorrente = new Scanner(System.in);

                while (opcaoCCorrente != 4) {
                    opcaoCCorrente = scannerCCorrente.nextInt();

                    switch (opcaoCCorrente) {
                        case 1:
                            System.out.println("\n***********************************");
                            System.out.println("Nome: " + nome);
                            System.out.println("Tipo de conta: " + contaCorrente);
                            System.out.println("Saldo: " + "R$ " + saldoCorrente);
                            System.out.println("***********************************\n");
                            break;

                        case 2:
                            System.out.println("Digite o valor do depósito");
                            Scanner scannerDeposito = new Scanner(System.in);
                            double deposito = scannerDeposito.nextDouble();
                            saldoCorrente += deposito;
                            System.out.println("Depósito realizado com sucesso");
                            System.out.println("\n***********************************");
                            System.out.println("Saldo atualizado: " + saldoCorrente);
                            System.out.println("***********************************\n");
                            System.out.println("Retornando ao menu da conta corrente...\n");
                            System.out.println("Digite a opção desejada\n");
                            System.out.println("1. Consultar Saldo");
                            System.out.println("2. Depositar");
                            System.out.println("3. Sacar");
                            System.out.println("4. Sair");
                            break;

                        case 3:
                            System.out.println("Digite o valor do saque");
                            Scanner scannerSaque = new Scanner(System.in);
                            double saque = scannerSaque.nextDouble();
                            if (saque > saldoCorrente) {
                                System.out.println("Saldo insuficiente. Retornando ao menu da conta corrente...\n");
                                System.out.println("Digite a opção desejada\n");
                                System.out.println("1. Consultar Saldo");
                                System.out.println("2. Depositar");
                                System.out.println("3. Sacar");
                                System.out.println("4. Sair");
                                break;
                                
                            }else {
                                saldoCorrente -= saque;
                            }
                            System.out.println("Saque realizado com sucesso");
                            System.out.println("\n***********************************");
                            System.out.println("Saldo atualizado: " + saldoCorrente);
                            System.out.println("***********************************\n");
                            System.out.println("Retornando ao menu da conta corrente...\n");
                            System.out.println("Digite a opção desejada\n");
                            System.out.println("1. Consultar Saldo");
                            System.out.println("2. Depositar");
                            System.out.println("3. Sacar");
                            System.out.println("4. Sair");
                            break;

                        case 4:
                            System.out.println("Saindo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                }
            } else if (opcao == 2) {
                System.out.println("\nConta Poupança\n");
                System.out.println("Digite a opção desejada\n");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Sair");

                int opcaoPoupanca = 0;

                @SuppressWarnings("resource")
                Scanner scannerPoupanca = new Scanner(System.in);

                while (opcaoPoupanca != 4) {
                    opcaoPoupanca = scannerPoupanca.nextInt();

                    switch (opcaoPoupanca) {
                        case 1:
                            System.out.println("\n***********************************");
                            System.out.println("Nome: " + nome);
                            System.out.println("Tipo de conta: " + contaPoupanca);
                            System.out.println("Saldo: " + "R$ " + saldoPoupanca);
                            System.out.println("***********************************\n");
                            break;

                        case 2:
                            System.out.println("Digite o valor do depósito");
                            Scanner scannerDeposito = new Scanner(System.in);
                            double deposito = scannerDeposito.nextDouble();
                            saldoPoupanca += deposito;
                            System.out.println("Depósito realizado com sucesso");
                            System.out.println("\n***********************************");
                            System.out.println("Saldo atualizado: " + saldoPoupanca);
                            System.out.println("***********************************\n");
                            System.out.println("Retornando ao menu da conta poupanca...\n");
                            System.out.println("Digite a opção desejada\n");
                            System.out.println("1. Consultar Saldo");
                            System.out.println("2. Depositar");
                            System.out.println("3. Sacar");
                            System.out.println("4. Sair");
                            break;

                        case 3:
                            System.out.println("Digite o valor do saque");
                            Scanner scannerSaque = new Scanner(System.in);
                            double saque = scannerSaque.nextDouble();
                            if (saque > saldoPoupanca) {
                                System.out.println("Saldo insuficiente. Retornando ao menu da conta poupança...\n");
                                System.out.println("Digite a opção desejada\n");
                                System.out.println("1. Consultar Saldo");
                                System.out.println("2. Depositar");
                                System.out.println("3. Sacar");
                                System.out.println("4. Sair");
                                break;                                    
                            }else {
                                saldoPoupanca -= saque;
                            }
                            System.out.println("Saque realizado com sucesso\n");
                            System.out.println("\n***********************************");
                            System.out.println("Saldo atualizado: " + saldoPoupanca);
                            System.out.println("***********************************\n");
                            System.out.println("Retornando ao menu da conta poupanca...\n");
                            System.out.println("Digite a opção desejada\n");
                            System.out.println("1. Consultar Saldo");
                            System.out.println("2. Depositar");
                            System.out.println("3. Sacar");
                            System.out.println("4. Sair");
                            break;

                        case 4:
                            System.out.println("Saindo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                System.exit(0);
            } else {
                System.out.println("Opção inválida");
            }
        }

    }

}