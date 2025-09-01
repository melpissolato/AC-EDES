package ac8;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaA1;
    private double notaA2;
    private double notaAtividade;
    private double notaSubstitutiva = -1; // 
    private double mediaFinal;
    private String status;

   
    public Aluno(String nome, String matricula, double notaA1, double notaA2, double notaAtividade) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaA1 = notaA1;
        this.notaA2 = notaA2;
        this.notaAtividade = notaAtividade;
    }

 
    public void calcularMediaInicial() {
        this.mediaFinal = (notaA1 * 4 + notaA2 * 4 + notaAtividade * 2) / 10;
        if (this.mediaFinal >= 7) {
            this.status = "APROVADO";
        } else {
            this.status = "EM AVALIAÇÃO SUBSTITUTIVA";
        }
    }

    public void aplicarSubstitutiva(double notaAS) {
        this.notaSubstitutiva = notaAS;

        if (notaA1 < notaA2) {
            notaA1 = notaAS;
        } else {
            notaA2 = notaAS;
        }

        this.mediaFinal = (notaA1 * 4 + notaA2 * 4 + notaAtividade * 2) / 10;
        this.status = (this.mediaFinal >= 7) ? "APROVADO" : "REPROVADO";
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public String getStatus() {
        return status;
    }

    
    public void imprimirRelatorio() {
        System.out.println("\n===== RELATÓRIO DO ALUNO =====");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.printf("Nota A1: %.2f%n", notaA1);
        System.out.printf("Nota A2: %.2f%n", notaA2);
        System.out.printf("Nota Atividade Complementar: %.2f%n", notaAtividade);
        if (notaSubstitutiva >= 0) {
            System.out.printf("Nota Substitutiva: %.2f%n", notaSubstitutiva);
        }
        System.out.printf("Média Final: %.2f%n", mediaFinal);
        System.out.println("Status: " + status);
    }
}
