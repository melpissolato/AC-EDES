package ac19;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String email;
    private int matricula;

    public Aluno(int matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    public int hashCode() {
        return Objects.hash(matricula);
    }

    public String toString() {
        return nome + " (matricula: " + matricula + ", email: " + email + ")";
    }
}
