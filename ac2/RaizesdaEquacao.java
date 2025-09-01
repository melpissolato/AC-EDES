package ac2;
import java.util.Scanner;

public class RaizesdaEquacao {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Digite o valor de a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Digite o valor de b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Digite o valor de c: ");
	        double c = scanner.nextDouble();

	        
	        if (a == 0) {
	            System.out.println("Isso não é uma equação do 2º grau.");
	            scanner.close();
	            return;
	        }
	     //   if - vai verificar se é uma equação do 2 grau ou não
	        
	     
	        double delta = b * b - 4 * a * c;
	        System.out.println("Delta = " + delta);
	        // nessa parte vai ocorrer a definição do delta
	        
	        if (delta < 0) {
	            System.out.println("A equação não possui raízes reais.");
	        } else if (delta == 0) {
	            double x = -b / (2 * a);
	            System.out.println("A equação possui uma raiz real: x = " + x);
	        } else {
	        	
	       // o  System.out.println vai mover o cursor para a prox linha e exibir o resultado, a diferenca entre o print normal é mover o cursor para a próx linha
	        }
	        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	        System.out.println("A equação possui duas raízes reais:");
	        System.out.println("x1 = " + x1);
	        System.out.println("x2 = " + x2);
	        scanner.close();
	    }

	   
	   }
	    
	        
	        


	       





