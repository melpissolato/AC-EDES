package ac14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[2];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("cadastro do funcionario " + (i + 1) + ":");

            System.out.print("nome: ");
            String nome = sc.nextLine();

            System.out.print("cargo: ");
            String cargo = sc.nextLine();

            System.out.print("salario: ");
            double salario = Double.parseDouble(sc.nextLine());

            System.out.print("num da carteira de trabalho: ");
            String numero = sc.nextLine();

            System.out.print("data de emissao: ");
            String dataEmissao = sc.nextLine();

            System.out.print("orgao emissor: ");
            String orgao = sc.nextLine();

            CarteiraTrabalho carteira = new CarteiraTrabalho(numero, dataEmissao, orgao);
            funcionarios[i] = new Funcionario(nome, cargo, salario, carteira);

            System.out.println();
        }

        System.out.println("=== funcionarios cadastrados ===");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println("--------------------------------");
        }

        sc.close();
    }
}