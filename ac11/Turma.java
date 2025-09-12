package ac11;

public class Turma {
    private double[][] notas;

    public Turma(double[][] notas) {
        this.notas = notas;
    }

    public double calcularMediaTurma() {
        double soma = 0;
        int totalNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
                totalNotas++;
            }
        }
        return soma / totalNotas;
    }
}
