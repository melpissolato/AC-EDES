class Livro {
    private String descricao;
    private int paginas;

    public Livro(String descricao, int paginas) {
        this.descricao = descricao;
        this.paginas = paginas;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPaginas() {
        return paginas;
    }
}
