package ac14;

class CarteiraTrabalho {
    private String numero;
    private String dataEmissao;
    private String orgaoEmissor;

    public CarteiraTrabalho(String numero, String dataEmissao, String orgaoEmissor) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    @Override
    public String toString() {
        return "carteira de trabalho {" +
                "numero='" + numero + '\'' +
                ", data de emissao='" + dataEmissao + '\'' +
                ", orgao emissor='" + orgaoEmissor + '\'' +
                '}';
    }
}
