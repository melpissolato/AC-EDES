package ac1;

import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String nome1, nome2, nome3;
        double salario1, salario2, salario3, media;

        System.out.print("Digite o nome do funcionário 1: ");
        nome1 = scanner.nextLine();
        System.out.print("Digite o salário de " + nome1 + ": ");
        salario1 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Digite o nome do funcionário 2: ");
        nome2 = scanner.nextLine();
        System.out.print("Digite o salário de " + nome2 + ": ");
        salario2 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Digite o nome do funcionário 3: ");
        nome3 = scanner.nextLine();
        System.out.print("Digite o salário de " + nome3 + ": ");
        salario3 = scanner.nextDouble();
        scanner.nextLine(); // pega a linha toda
        
        if (salario1 < 0 || salario2 < 0 || salario3 < 0) {
            System.out.println("Erro: salário não pode ser negativo.");
            scanner.close();
            return;
        }

        
        media = (salario1 + salario2 + salario3) / 3;
       
        
 
        System.out.println("\n--- Funcionários e Salários ---");
        System.out.printf("%s: R$ %.2f\n", nome1, salario1);
        System.out.printf("%s: R$ %.2f\n", nome2, salario2);
        System.out.printf("%s: R$ %.2f\n", nome3, salario3);
        
        //oq é: %.2f/n?= faz com que aconteca uma diminuição em casas decimais, fazendo com que seja somente 2 casas

        System.out.printf("\n A média salarial desses salários é: R$ %.2f\n", media);
        
        
        scanner.close();
        
        

    }
}
