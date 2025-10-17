public class Main {
    public static void main(String[] args) {
        Carro carro1 = new CarroBasico("Fiat Uno", 40000, 52000);
        Carro carro2 = new CarroLuxo("BMW x6", 300000, 48000);

        System.out.println("----- cadastro ------\n");

        carro1.exibirDados();
        System.out.println("diaria: R$ " + carro1.calcularDiaria());
        carro1.verificarKm();

        System.out.println("\n--------------------\n");

        carro2.exibirDados();
        System.out.println("diaria: R$ " + carro2.calcularDiaria());
        carro2.verificarKm();
    }
}
