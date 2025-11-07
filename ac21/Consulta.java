package ac21;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime dataHora;
    private Paciente paciente;

    public Consulta(LocalDateTime dataHora, Paciente paciente) {
        this.dataHora = dataHora;
        this.paciente = paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void reagendar(int diasAdicionais) {
        dataHora = dataHora.plusDays(diasAdicionais);
    }

    public long diasFaltando() {
        LocalDateTime agora = LocalDateTime.now();
        return Duration.between(agora.toLocalDate().atStartOfDay(), dataHora.toLocalDate().atStartOfDay()).toDays();
    }

    public LocalDateTime horaTermino() {
        return dataHora.plusMinutes(45);
    }

    public void exibirInformacoes() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("===== Detalhes da Consulta =====");
        System.out.println("Paciente: " + paciente.getNome() + " (CPF: " + paciente.getCpf() + ")");
        System.out.println("Data e hora da consulta: " + dataHora.format(formato));
        System.out.println("Término previsto: " + horaTermino().format(formato));
        System.out.println("Dias até a consulta: " + diasFaltando());
        System.out.println("===============================");
    }
}
