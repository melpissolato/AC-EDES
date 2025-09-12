package ac11;

import java.util.Scanner;

public class MainTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos da turma: ");
        int qtdAlunos = sc.nextInt();

        System.out.print("Digite o número de avaliações por aluno: ");
        int qtdAvaliacoes = sc.nextInt();

        double[][] notas = new double[qtdAlunos][qtdAvaliacoes];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            for (int j = 0; j < qtdAvaliacoes; j++) {
                System.out.print("Digite a nota " + (j + 1) + " (0 a 10): ");
                notas[i][j] = sc.nextDouble();
            }
        }

        Turma turma = new Turma(notas);
        double mediaTurma = turma.calcularMediaTurma();

        System.out.printf("%nMédia final da turma: %.2f%n", mediaTurma);

        sc.close();
    }
}
