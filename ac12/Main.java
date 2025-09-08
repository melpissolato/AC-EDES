package ac12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("iphone 13", 3000.00));
        produtos.add(new Produto("iphone 14", 4000.00));
        produtos.add(new Produto("iphone 15", 5000.00));
        produtos.add(new Produto("iphone 16", 6000.00));

        List<Produto> cesta = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== iphones disponiveis ===");
            for (int i = 0; i < produtos.size(); i++) {
                Produto p = produtos.get(i);
                System.out.println((i + 1) + " - " + p.getNome() + " | R$ " + String.format("%.2f", p.getValor()));
            }
            System.out.println("0 - finalizar compra");

            System.out.print("escolha um produto (digite o num): ");
            opcao = sc.nextInt();

            if (opcao > 0 && opcao <= produtos.size()) {
                Produto escolhido = produtos.get(opcao - 1);
                cesta.add(escolhido);
                System.out.println(escolhido.getNome() + " adicionado a cesta!");
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        
   
        double total = 0;
        System.out.println("\n=== carrinho ===");
        for (Produto p : cesta) {
            System.out.println("- " + p.getNome() + " | R$ " + String.format("%.2f", p.getValor()));
            total += p.getValor();
        }

        System.out.println("\n valor da compra: R$ " + String.format("%.2f", total));

        System.out.print("num de parecelas: ");
        int parcelas = sc.nextInt();
        sc.close();

        double valorParcela = total / parcelas;

        System.out.println("\n=== resumo ===");
        System.out.println("Total: R$ " + String.format("%.2f", total));
        System.out.println("Parcelado em " + parcelas + "x de R$ " + String.format("%.2f", valorParcela));
    }
}


