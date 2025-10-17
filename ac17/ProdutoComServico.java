class ProdutoComServico extends Produto {
    private double taxaServico;

    public ProdutoComServico(String nome, double precoBase, double taxaServico) {
        super(nome, precoBase);
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + taxaServico;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Produto com Serviço: " + nome);
        System.out.println("Preço base: R$ " + precoBase);
        System.out.println("Taxa de serviço: R$ " + taxaServico);
        System.out.println("Preço final: R$ " + calcularPrecoFinal());
    }
}
