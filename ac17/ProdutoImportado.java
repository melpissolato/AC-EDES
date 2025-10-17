class ProdutoImportado extends Produto {
    private double taxaImportacao;

    public ProdutoImportado(String nome, double precoBase, double taxaImportacao) {
        super(nome, precoBase);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + taxaImportacao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Produto Importado: " + nome);
        System.out.println("Preço base: R$ " + precoBase);
        System.out.println("Taxa de importação: R$ " + taxaImportacao);
        System.out.println("Preço final: R$ " + calcularPrecoFinal());
    }
}