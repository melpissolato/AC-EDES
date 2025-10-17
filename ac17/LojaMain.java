public class LojaMain {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 20.0);
        ProdutoImportado p2 = new ProdutoImportado("Notebook Dell", 3000.0, 500.0);
        ProdutoComServico p3 = new ProdutoComServico("Instalação de software", 150.0, 50.0);

        p1.exibirInfo();
        System.out.println();
        p2.exibirInfo();
        System.out.println();
        p3.exibirInfo();
    }
}