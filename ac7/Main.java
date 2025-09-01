package ac7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o raio : ");
        double raio = teclado.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = teclado.nextDouble();
     
        Cilindro cilindro = new Cilindro(raio, altura);

   
        System.out.printf("Área = %.2f%n", cilindro.getArea());
        System.out.printf("Volume = %.2f%n", cilindro.getVolume());

        teclado.close();
    }
}
