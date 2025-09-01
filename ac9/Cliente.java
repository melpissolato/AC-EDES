package ac9;

public class Cliente {
    private String nome;
    private String cpf;
    private String numeroConta;
    private double saldo;

    public Cliente(String nome, String cpf, String numeroConta, double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("deposito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("valor inválido para deposito.");
        }
    }

    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("valor invalido para saque.");
        } else if (valor > saldo) {
            System.out.println("saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

    public void transferir(double valor, Cliente destino) {
        if (valor <= 0) {
            System.out.println("valor invalido para transferencia.");
        } else if (valor > saldo) {
            System.out.println("saldo insuficiente para transferencia.");
        } else {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.printf("transferencia de R$ %.2f para %s realizada com sucesso.%n", valor, destino.nome);
        }
    }

    
    public void exibirDados() {
        System.out.println("\n===== dados =====");
        System.out.println("nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("num da conta: " + numeroConta);
        System.out.printf("saldo: R$ %.2f%n", saldo);
    }
}
