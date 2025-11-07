package ac20;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String sigla;
    private Instrutor instrutor;
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
        instrutor.adicionarCurso(this); 
    }

    public void matricularAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public String toString() {
        return nome + " (" + sigla + ")";
    }
}

