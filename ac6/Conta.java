package ac6;

public class Conta {
    private double saldo;
    private final double limitePix;

    public Conta(double saldo, double limitePix) {
        this.saldo = saldo;
        this.limitePix = limitePix;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimitePix() {
        return limitePix;
    }
 
    public boolean transferir(double valor, Conta destino) {
        if (valor <= 0) {
            System.out.println("\nTransferência negada: Valor inválido.");
            return false;
        } else if (valor > limitePix) {
            System.out.println("\nTransferência negada: Valor excede o limite do PIX.");
            return false;
        } else if (valor > saldo) {
            System.out.println("\nTransferência negada: Saldo insuficiente.");
            return false;
        } else {
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
    }
}
