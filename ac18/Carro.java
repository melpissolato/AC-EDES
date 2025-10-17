public abstract class Carro implements Locadora {
    protected String descricao;
    protected double valor;
    protected double kmAtual;
    protected static final double LIMITE_KM = 50000.0;

    public Carro(String descricao, double valor, double kmAtual) {
        this.descricao = descricao;
        this.valor = valor;
        this.kmAtual = kmAtual;
    }

    public void exibirDados() {
        System.out.println("descricao: " + descricao);
        System.out.println("valor: " + valor);
        System.out.println(" km atual:" + kmAtual);

    }
}
