package ac21;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String cpf;
    private String nome;
    private List<Consulta> consultas = new ArrayList<>();

    public Paciente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public String toString() {
        return "Paciente: " + nome + " (CPF: " + cpf + ")";
    }
}
