package ac9;

import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Melina", "13725618623", "123456", 1000000000000.00);
        Cliente cliente2 = new Cliente("Gabriel", "11122233344", "567890", 50.00);

        int opcao;
        do {
            System.out.println("\n===== MENU BANCÁRIO =====");
            System.out.println("1 - depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - transferir");
            System.out.println("4 - exibir dados de Melina");
            System.out.println("5 - exibir dados Gabriel");
            System.out.println("0 - encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("digite o valor para deposito: ");
                    double valorDep = sc.nextDouble();
                    cliente1.depositar(valorDep);
                    break;
                case 2:
                    System.out.print("digite o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    cliente1.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("digite o valor para transferir de Melina para Gabriel: ");
                    double valorTransf = sc.nextDouble();
                    cliente1.transferir(valorTransf, cliente2);
                    break;
                case 4:
                    cliente1.exibirDados();
                    break;
                case 5:
                    cliente2.exibirDados();
                    break;
                case 0:
                    System.out.println("encerrando sistema");
                    break;
                default:
                    System.out.println("operacao invalida");
            }

        } while (opcao != 0);

        sc.close();
    }
}

   