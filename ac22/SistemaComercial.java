package ac22;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SistemaComercial {
    private List<Produto> produtos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void exibirMenu() {
        int opcao = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Acessar produto por índice");
            System.out.println("3 - Calcular preço médio dos produtos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); 

                if (opcao == 1) {
                    cadastrarProdutos();
                } else if (opcao == 2) {
                    acessarProduto();
                } else if (opcao == 3) {
                    calcularMedia();
                } else if (opcao == 4) {
                    System.out.println("Saindo do sistema...");
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número inteiro válido para a opção!");
                sc.nextLine();
            } finally {
                System.out.println("========================================");
            }

        } while (opcao != 4);
    }

    public void cadastrarProdutos() {
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Preço do produto: ");
                double preco = sc.nextDouble();

                System.out.print("Quantidade em estoque: ");
                int quantidade = sc.nextInt();
                sc.nextLine();

                produtos.add(new Produto(nome, preco, quantidade));
                System.out.println("Produto cadastrado com sucesso!");

                System.out.print("Deseja cadastrar outro produto? (s/n): ");
                String resposta = sc.nextLine();
                if (resposta.equalsIgnoreCase("n")) {
                    continuar = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: valor inválido digitado. Tente novamente.");
                sc.nextLine(); 
            } finally {
                System.out.println("Operação de cadastro finalizada (com sucesso ou erro).");
            }
        }
    }

    public void acessarProduto() {
        try {
            System.out.print("Digite o índice do produto: ");
            int indice = sc.nextInt();
            sc.nextLine();

            System.out.println(produtos.get(indice));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora dos limites da lista!");
        } catch (Exception e) {
            System.out.println("Erro inesperado ao acessar produto: " + e.getMessage());
        } finally {
            System.out.println("Tentativa de acesso concluída.");
        }
    }

    public void calcularMedia() {
        try {
            if (produtos.isEmpty()) {
                throw new ArithmeticException("Não há produtos cadastrados para calcular a média.");
            }

            double soma = 0;
            for (Produto p : produtos) {
                soma += p.getPreco();
            }

            double media = soma / produtos.size();
            System.out.println("Preço médio dos produtos: R$ " + media);

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Cálculo de média concluído.");
        }
    }
}
