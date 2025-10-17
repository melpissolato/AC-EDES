public class CarroLuxo extends Carro {
    public CarroLuxo(String descricao, double valor, double kmAtual) {
        super(descricao, valor, kmAtual);
    }

    public double calcularDiaria() {
        double diaria = valor / 1000;
        if (diaria > 190) {
            diaria = 190;
        }
        return diaria;
    }

    public void verificarKm() {
        if (kmAtual > LIMITE_KM) {
            System.out.println("ATENCÃO " + descricao + ": leve para concessionaria .");
        } else {
            System.out.println(" " + descricao + ": dentro do limite de KM.");
        }
    }
}
