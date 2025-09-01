
package ac3;
import java.util.Scanner;
public class CalculosCilindro {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o raio do cilindro (cm): ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro (cm): ");
        double altura = scanner.nextDouble();
        
        double area = 2 * Math.PI * raio * (altura + raio);
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.printf("area da superficie do cilindro é %.2f cm²\n", area);
        System.out.printf("volume do cilindro é: %.2f cm³\n", volume);

        scanner.close();
    }
}


	


