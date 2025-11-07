package ac22;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco + " | Quantidade: " + quantidade;
    }
}
