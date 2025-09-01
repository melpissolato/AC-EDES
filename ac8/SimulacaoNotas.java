package ac8;
import java.util.Scanner;



public class SimulacaoNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcao;
        do {
            System.out.print("\nDigite o nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Digite a matrícula do aluno: ");
            String matricula = sc.nextLine();

            System.out.print("Digite a nota da Avaliação 1 (peso 4): ");
            double a1 = sc.nextDouble();

            System.out.print("Digite a nota da Avaliação 2 (peso 4): ");
            double a2 = sc.nextDouble();

            System.out.print("Digite a nota da Atividade Complementar (peso 2): ");
            double atividade = sc.nextDouble();
            sc.nextLine(); 

            Aluno aluno = new Aluno(nome, matricula, a1, a2, atividade);

            aluno.calcularMediaInicial();

     
            if (aluno.getStatus().equals("EM AVALIAÇÃO SUBSTITUTIVA")) {
                System.out.print("Digite a nota da Avaliação Substitutiva: ");
                double notaAS = sc.nextDouble();
                sc.nextLine(); 
                aluno.aplicarSubstitutiva(notaAS);
            }

            
            aluno.imprimirRelatorio();

            
            System.out.print("\nDeseja lançar notas de outro aluno? (S/N): ");
            opcao = sc.nextLine().trim().toUpperCase();

        } while (opcao.equals("S"));

        System.out.println("\nEncerrando o sistema de notas.");
        sc.close();
    }
}






   
        