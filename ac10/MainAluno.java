package ac10;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de avaliações do aluno: ");
        int qtdAvaliacoes = sc.nextInt();

        double[] notas = new double[qtdAvaliacoes];

        for (int i = 0; i < qtdAvaliacoes; i++) {
            System.out.print("Digite a nota " + (i + 1) + " (0 a 10): ");
            notas[i] = sc.nextDouble();
        }

        Aluno aluno = new Aluno(notas);
        double mediaFinal = aluno.calcularMedia();

        System.out.printf("Média final do aluno: %.2f%n", mediaFinal);

        sc.close();
    }
}
