package ac5;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        double num1 = scanner.nextDouble();

        System.out.println("digite o segundo num:");
        double num2 = scanner.nextDouble();

        System.out.println("escolha a operação (+, -, *, /):");
        char operacao = scanner.next().charAt(0);

        double resultado;
        
        switch (operacao) {
        
        case '+':
        resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
        break;
        
        case '-':
        resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
        break;
        
        case '*':
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
            break;
        case '/':
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
            break;
            
        }
        scanner.close();
        
}
}



