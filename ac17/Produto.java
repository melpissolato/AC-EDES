class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal() {
        return precoBase;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço final: R$ " + calcularPrecoFinal());
    }
}





