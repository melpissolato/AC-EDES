package ac21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Paciente> pacientes = new HashMap<>();

        int opcao = 0;

        do {
            System.out.println("\n===== MENU CLÍNICA =====");
            System.out.println("1 - Registrar paciente");
            System.out.println("2 - Agendar consulta");
            System.out.println("3 - Reagendar consulta");
            System.out.println("4 - Listar consultas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("CPF do paciente: ");
                    String cpf = sc.nextLine();

                    if (pacientes.containsKey(cpf)) {
                        System.out.println("Paciente já cadastrado!");
                        break;
                    }

                    System.out.print("Nome do paciente: ");
                    String nome = sc.nextLine();

                    Paciente novoPaciente = new Paciente(cpf, nome);
                    pacientes.put(cpf, novoPaciente);

                    System.out.println("Paciente registrado com sucesso!");
                    break;

                case 2:
                    System.out.print("CPF do paciente: ");
                    cpf = sc.nextLine();

                    Paciente paciente = pacientes.get(cpf);
                    if (paciente == null) {
                        System.out.println("Paciente não encontrado. Cadastre primeiro.");
                        break;
                    }

                    try {
                        System.out.print("Digite a data e hora da consulta (dd/MM/yyyy HH:mm): ");
                        String dataHoraStr = sc.nextLine();
                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                        LocalDateTime dataHora = LocalDateTime.parse(dataHoraStr, formato);

                        Consulta consulta = new Consulta(dataHora, paciente);
                        paciente.adicionarConsulta(consulta);

                        consulta.exibirInformacoes();
                    } catch (Exception e) {
                        System.out.println("Formato de data inválido. Use o padrão dd/MM/yyyy HH:mm.");
                    }
                    break;

                case 3:
                    System.out.print("CPF do paciente: ");
                    cpf = sc.nextLine();
                    paciente = pacientes.get(cpf);

                    if (paciente == null || paciente.getConsultas().isEmpty()) {
                        System.out.println("Nenhuma consulta encontrada para este paciente.");
                        break;
                    }

                    System.out.println("Consultas atuais:");
                    for (int i = 0; i < paciente.getConsultas().size(); i++) {
                        Consulta c = paciente.getConsultas().get(i);
                        System.out.println(i + " - " + c.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
                    }

                    System.out.print("Escolha o número da consulta a reagendar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Quantos dias deseja adicionar à data atual? ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    Consulta consultaSelecionada = paciente.getConsultas().get(indice);
                    consultaSelecionada.reagendar(dias);

                    System.out.println("Consulta reagendada com sucesso!");
                    consultaSelecionada.exibirInformacoes();
                    break;

                case 4:
                    for (Paciente p : pacientes.values()) {
                        System.out.println("\n" + p);
                        for (Consulta c : p.getConsultas()) {
                            c.exibirInformacoes();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}

