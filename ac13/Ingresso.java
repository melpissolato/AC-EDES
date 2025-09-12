package ac13;

public class Ingresso {
    private int numero;
    private String descricaoShow;
    private Cliente cliente; 

    public Ingresso(int numero, String descricaoShow) {
        this.numero = numero;
        this.descricaoShow = descricaoShow;
    }

    public void registrarVenda(Cliente cliente) {
        this.cliente = cliente;
    }

    public void imprimirResumo() {
        System.out.println(" resumo do ingresso");
        System.out.println("num ingresso"+ numero);
        System.out.println("descrição do ingresso"+ descricaoShow);
    
    if (cliente != null) {
        System.out.println("comprador: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
    } else {
        System.out.println("ingresso n foi vendido.");
    }
}
}
    