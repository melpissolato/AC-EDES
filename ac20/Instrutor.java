package ac20;


import java.util.ArrayList;
import java.util.List;

public class Instrutor {
    private String nome;
    private String especialidade;
    private List<Curso> cursosMinistrados = new ArrayList<>();

    public Instrutor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void adicionarCurso(Curso curso) {
        cursosMinistrados.add(curso);
    }

    public List<Curso> getCursosMinistrados() {
        return cursosMinistrados;
    }

    public String toString() {
        return nome + " (Especialidade: " + especialidade + ")";
    }
}

