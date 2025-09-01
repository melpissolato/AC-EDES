package ac4;

import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_AULAS = 40;
        final int MAXIMO_FALTAS = 10;

        System.out.print("Nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Número de faltas do aluno: ");
        int faltas = scanner.nextInt();

        double media = (nota1 + nota2) / 2;
        double presenca = ((TOTAL_AULAS - faltas) / (double) TOTAL_AULAS) * 100;

        System.out.printf("Média final: %.2f\n", media);
        System.out.printf("Presença: %.2f%%\n", presenca);

        if (media >= 7.0 && faltas <= MAXIMO_FALTAS) {
            System.out.println("Aprovado!");
        } else if (media < 7.0 && faltas > MAXIMO_FALTAS) {
            System.out.println("Reprovado por nota e por falta.");
        } else if (media < 7.0) {
            System.out.println("Reprovado por nota");
        } else {
            System.out.println("Reprovado por falta.");
        }

        scanner.close();
    }
}



        
