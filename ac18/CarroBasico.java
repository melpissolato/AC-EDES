public class CarroBasico extends Carro {
    public CarroBasico(String descricao, double valor, double kmAtual) {
        super(descricao, valor, kmAtual);
    }

    public double calcularDiaria() {
        double diaria = valor / 2000;
        return diaria;
    }

    public void verificarKm() {
        if (kmAtual > LIMITE_KM) {
            System.out.println("atencao " + descricao + ": leve para revisao.");
        } else {
            System.out.println(" " + descricao + ": dentro do limite de KM.");
        }
    }
}


