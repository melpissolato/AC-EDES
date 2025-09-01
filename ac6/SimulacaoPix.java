package ac6;

import java.util.Scanner;

public class SimulacaoPix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String SENHA_CORRETA = "J@vaPOO";

        Conta origem = new Conta(1000.00, 500.00);
        Conta destino = new Conta(2000.00, 500.00);

  
        boolean autenticado = false;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a senha de acesso: ");
            String senha = sc.nextLine();

            if (senha.equals(SENHA_CORRETA)) {
                autenticado = true;
                break;
            } else {
                System.out.println("Senha incorreta. Tentativa " + i + " de 3.");
            }
        }

        if (!autenticado) {
            System.out.println("\nAcesso bloqueado. Número máximo de tentativas atingido.");
            sc.close();
            return;
        }

       
        String opcao;
        do {
            System.out.print("\nDigite a chave PIX de destino: ");
            String chavePix = sc.nextLine();

            System.out.print("Digite o valor da transferência (R$): ");
            double valor = sc.nextDouble();
            sc.nextLine(); 

            boolean realizada = origem.transferir(valor, destino);

            System.out.println("\n===== RELATÓRIO DA OPERAÇÃO =====");
            System.out.println("Chave PIX destino: " + chavePix);
            System.out.printf("Valor da transferência: R$ %.2f%n", valor);
            System.out.println("Resultado da transferência: " + (realizada ? "REALIZADA" : "NEGADA"));
            System.out.printf("Saldo final de origem: R$ %.2f%n", origem.getSaldo());
            System.out.printf("Limite de transação PIX: R$ %.2f%n", origem.getLimitePix());
            System.out.printf("Saldo final de destino: R$ %.2f%n", destino.getSaldo());

            System.out.print("\nDeseja realizar outra transferência? (S/N): ");
            opcao = sc.nextLine().trim().toUpperCase();

        } while (opcao.equals("S"));

        System.out.println("\nEncerrando o sistema. Obrigado por usar o PIX!");
        sc.close();
    }
}
