import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    String categoria;
    String codigo;
    double preco;
    int quantidade;

    public Produto(String nome, String categoria, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Categoria: " + categoria +
                ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}

public class LojaProdutos {

    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 4:
                    exibirQuantidadeTotal();
                    break;
                case 5:
                    exibirValorTotalEstoque();
                    break;
                case 6:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private static void mostrarMenu() {
        System.out.println("\n==== MENU ====");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Remover produto pelo código");
        System.out.println("3. Exibir todos os produtos");
        System.out.println("4. Exibir quantidade total de produtos");
        System.out.println("5. Exibir valor total do estoque");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarProduto() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();
        System.out.print("Código único: ");
        String codigo = scanner.nextLine();
        System.out.print("Preço unitário: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Quantidade em estoque: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        produtos.add(new Produto(nome, categoria, codigo, preco, quantidade));
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void removerProduto() {
        System.out.print("Digite o código do produto a remover: ");
        String codigo = scanner.nextLine();

        Produto encontrado = null;
        for (Produto p : produtos) {
            if (p.codigo.equals(codigo)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            produtos.remove(encontrado);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\n=== Lista de Produtos ===");
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    private static void exibirQuantidadeTotal() {
        int total = 0;
        for (Produto p : produtos) {
            total += p.quantidade;
        }
        System.out.println("Quantidade total de produtos no estoque: " + total);
    }

    private static void exibirValorTotalEstoque() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.preco * p.quantidade;
        }
        System.out.println("Valor total do estoque: R$" + total);
    }
}

Escreva um programa que, a partir de um input do usuário, verifique se um aluno foi aprovado em um curso sobre Java. Considere as seguintes questões:
O curso tem um total de 40 aulas e 2 avaliações (provas);
Para ser aprovado:
O aluno deve ter nota maior ou igual a 7 nas duas avaliações;
O aluno deve ter no mínimo 75% de presença.
Input: Nome do aluno, nota prova 1, nota prova 2 e quantidade de faltas.
Output: nome do aluno, média e seu status: Aprovado ou Reprovado.
Escreva um programa que, a partir de um input do usuário, faça operações matemáticas simples (soma, subtração, multiplicação e divisão) em dois valores.
Input: 
Número 1;
Número 2;
Operação a ser realizada.
Output:
Operação inserida;
Resultado da operação;
Mensagem de erro em caso de divisão por 0 (zero).

Escreva um programa em Java que simule uma transferência via PIX.
O usuário deve digitar uma senha para acessar o sistema. O usuário tem até 3 tentativas para inserir a senha correta. Senha correta: J@vaPOO.
O programa deve conter os seguintes valores pré-definidos: Saldo da Conta de Origem: R$ 1.000,00, Limite de Transação para PIX: R$ 500,00 e Saldo da Conta de Destino: R$ 2.000,00.
Após autenticação, o usuário deve informar: Chave PIX de destino (sem validação externa) e Valor da transferência (em reais).
O sistema deve verificar o saldo e limite do PIX antes de realizar a transação.
Após a tentativa (bem-sucedida ou não), o sistema deve exibir um relatório com as informações: Valor da transferência. Resultado da transferência (realizada ou negada). Saldo final de origem. Limite Transação PIX. Saldo final de destino.

Escreva um programa que, a partir de um input do usuário, calcule a área e volume de um cilindro. O programa deve conter a classe Cilindro com seus atributos e métodos.
Área cilindro = 2 * π * raio * (raio + altura)
Volume cilindro = π * raio2 * altura
Input: raio e altura do cilindro.
Output: área e volumo do cilindro.
Exemplo:
Raio = 5.0 e Altura = 8.0
Área = 408.20
Volume = 628.00

Escreva um programa em Java que calcule o valor a média final de um aluno, considerando: 
O professor deve informar o nome do aluno e número de matricula;
O professor deve informar o valor da Avaliação 1 (Peso 4), Avaliação 2 (Peso 4) e Atividade Complementar (Peso 2);
O sistema deve calcular a média na nota do aluno e:
Se média for maior ou igual a 7, o aluno está aprovado e o professor não precisa de lançar a nota da Avaliação Substitutiva (Substitui a menor nota entre A1 e A2); 
Se média menor que 7, o sistema solicitar ao professor para lançar a nota da Avaliação Substitutiva e deve calcular a nova média final do aluno.
O sistema deve imprimir as informações finais do aluno: Matrícula, Nome Aluno, Nota A1, Nota A2, Nota AS (Caso exista), Média Final e Status (Aprovado ou Reprovado).
O professor pode inserir notas de diferentes alunos até encerrar a execução do programa.
Criar um sistema em Java para simular operações bancárias entre clientes, utilizando apenas uma classe Cliente.
O cliente deve conter os seguintes atributos: nome, CPF, número da conta e saldo.
O sistema deve conter as seguintes operações:
Depositar: aumenta o saldo do cliente.
Sacar: reduz o saldo, somente se houver saldo suficiente.
Transferir: transfere um valor da conta atual para a conta de outro cliente, somente se houver saldo suficiente.
Exibir dados de um cliente com todos atributos.
O sistema não deve permitir saldos negativos.
O sistema deve apresentar as operações disponíveis em um menu.
O usuário pode executar as operações disponíveis até encerrar a execução do programa.

Escreva um programa que, a partir de um input do professor, calcule o valor a média final de um aluno em uma disciplina, considerando que: 
O professor deve informar o número de avaliações que serão inseridas para o aluno (não existe um limite para a quantidade de avaliações);
O professor deve informar o valor das avaliações (0 – 10);
O sistema deve calcular e imprimir a média final do aluno.


Escreva um programa que, a partir de um input do professor, calcule o valor a média final de toda a turma em uma disciplina, considerando que: 
O professor deve informar o número de alunos da turma;
O professor deve informar o número total de avaliações que serão inseridas para cada aluno;
O professor deve informar o valor das avaliações (0 – 10);
O sistema deve calcular e imprimir a média final da turma.

Escreva um programa que, a partir de um input do usuário, calcule o valor total de uma compra e valor das parcelas do pagamento, considerando que: 
Produto possui: nome e valor.
O usuário pode inserir quantos produtos desejar na sua cesta de compra.
O usuário deve informar o nome do produto e seu valor para adicionar o produto a cesta.
Ao encerrar a inserção de produtos na cesta, o sistema deve
Solicitar o número de parcelas de pagamento.
Calcular o valor final da compra.
Calcular o valor de cada parcela.
Imprimir o resumo da compra.

Escreva um programa que relacione um ingresso com seu comprador, considerando que: 
O comprador possui nome e CPF.
O bilhete possui um número de ingresso e descrição do show.
Um cliente pode comprar um único bilhete e o bilhete pertence a um único cliente (1-1).
O sistema deve registrar a venda do bilhete para o comprador.
O sistema deve imprimir um resumo da transação.

Escreva um programa que relacione um funcionário e sua carteira de trabalho, considerando que:
Cada funcionário deve possuir exatamente uma carteira de trabalho.
Funcionário possui: nome, cargo e salário.
Carteira de trabalho possui:  número, data de emissão e órgão emissor.
O sistema deve registrar o cadastro do funcionário e sua carteira de trabalho.
Por meio do teclado, crie pelo menos dois funcionários com suas respectivas carteiras e exiba os dados de cada um para simular o vínculo oficial entre empregado e carteira de trabalho no contexto de uma empresa.
Sacar: reduz o saldo, somente se houver saldo suficiente.
Transferir: transfere um valor da conta atual para a conta de outro cliente, somente se houver saldo suficiente.
Exibir dados de um cliente com todos atributos.
O sistema não deve permitir saldos negativos.
O sistema deve apresentar as operações disponíveis em um menu.
O usuário pode executar as operações disponíveis até encerrar a execução do programa.


Escreva um programa que, a partir de um input do usuário, calcule o valor total de uma compra e valor das parcelas do pagamento, considerando que: 
Produto possui: nome e valor.
O usuário pode inserir quantos produtos desejar na sua cesta de compra.
O usuário deve informar o nome do produto e seu valor para adicionar o produto a cesta.
Ao encerrar a inserção de produtos na cesta, o sistema deve
Solicitar o número de parcelas de pagamento.
Calcular o valor final da compra.
Calcular o valor de cada parcela.
Imprimir o resumo da compra.

Escreva um programa que relacione um ingresso com seu comprador, considerando que: 
O comprador possui nome e CPF.
O bilhete possui um número de ingresso e descrição do show.
Um cliente pode comprar um único bilhete e o bilhete pertence a um único cliente (1-1).
O sistema deve registrar a venda do bilhete para o comprador.
O sistema deve imprimir um resumo da transação.

Escreva um programa que relacione um funcionário e sua carteira de trabalho, considerando que:
Cada funcionário deve possuir exatamente uma carteira de trabalho.
Funcionário possui: nome, cargo e salário.
Carteira de trabalho possui:  número, data de emissão e órgão emissor.
O sistema deve registrar o cadastro do funcionário e sua carteira de trabalho.
Por meio do teclado, crie pelo menos dois funcionários com suas respectivas carteiras e exiba os dados de cada um para simular o vínculo oficial entre empregado e carteira de trabalho no contexto de uma empresa.

Escreva um programa que relacione um autor com sua obra (livro), considerando que: 
O autor possui nome e CPF.
O livro possui uma descrição e número de páginas.
Um autor pode estar relacionado a muitos livros e um livro pertence a um único autor (1-*).
O sistema deve registrar a autoria do livro a seu autor.
O sistema deve imprimir um resumo das obras do autor.


import java.util.ArrayList;
import java.util.List;

// Classe Livro
class Livro {
    private String descricao;
    private int numeroPaginas;
    private Autor autor;

    public Livro(String descricao, int numeroPaginas, Autor autor) {
        this.descricao = descricao;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        autor.adicionarLivro(this); // Registra o livro no autor
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public Autor getAutor() {
        return autor;
    }
}

// Classe Autor
class Autor {
    private String nome;
    private String cpf;
    private List<Livro> livros;

    public Autor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void imprimirResumoObras() {
        System.out.println("Autor: " + nome + " | CPF: " + cpf);
        System.out.println("Obras:");
        for (Livro livro : livros) {
            System.out.println("- " + livro.getDescricao() + " (" + livro.getNumeroPaginas() + " páginas)");
        }
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "123.456.789-00");

        Livro livro1 = new Livro("Dom Casmurro", 256, autor1);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", 198, autor1);

        autor1.imprimirResumoObras();
    }
}
import java.util.Scanner;

public class TransferenciaPIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados pré-definidos
        final String SENHA_CORRETA = "J@vaPOO";
        double saldoOrigem = 1000.00;
        double limitePix = 500.00;
        double saldoDestino = 2000.00;

        boolean autenticado = false;

        // Tentativas de senha
        for (int tentativas = 1; tentativas <= 3; tentativas++) {
            System.out.print("Digite a senha de acesso: ");
            String senha = sc.nextLine();

            if (senha.equals(SENHA_CORRETA)) {
                autenticado = true;
                break;
            } else {
                System.out.println("Senha incorreta! Tentativa " + tentativas + " de 3.");
            }
        }

        if (!autenticado) {
            System.out.println("\nAcesso negado! Número de tentativas excedido.");
            sc.close();
            return;
        }

        // Se chegou aqui, está autenticado
        System.out.println("\nAcesso liberado ✅");

        // Informar chave PIX (sem validação externa)
        System.out.print("Informe a chave PIX de destino: ");
        String chavePix = sc.nextLine();

        // Informar valor da transferência
        System.out.print("Informe o valor da transferência (R$): ");
        double valorTransferencia = sc.nextDouble();

        boolean transferenciaRealizada = false;

        // Verificações
        if (valorTransferencia > saldoOrigem) {
            System.out.println("\n❌ Transferência negada! Saldo insuficiente.");
        } else if (valorTransferencia > limitePix) {
            System.out.println("\n❌ Transferência negada! Valor excede o limite de transação PIX.");
        } else if (valorTransferencia <= 0) {
            System.out.println("\n❌ Transferência negada! Valor inválido.");
        } else {
            // Transferência realizada
            saldoOrigem -= valorTransferencia;
            saldoDestino += valorTransferencia;
            transferenciaRealizada = true;
            System.out.println("\n✅ Transferência realizada com sucesso!");
        }

        // Relatório final
        System.out.println("\n------ RELATÓRIO DA TRANSAÇÃO ------");
        System.out.println("Chave PIX destino: " + chavePix);
        System.out.println("Valor da transferência: R$ " + String.format("%.2f", valorTransferencia));
        System.out.println("Resultado: " + (transferenciaRealizada ? "REALIZADA" : "NEGADA"));
        System.out.println("Saldo final de origem: R$ " + String.format("%.2f", saldoOrigem));
        System.out.println("Limite de transação PIX: R$ " + String.format("%.2f", limitePix));
        System.out.println("Saldo final de destino: R$ " + String.format("%.2f", saldoDestino));

        sc.close();
    }
}
class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}

class TransacaoPIX {
    private double limite;

    public TransacaoPIX(double limite) {
        this.limite = limite;
    }

    public boolean transferir(Conta origem, Conta destino, double valor) {
        if (valor <= 0) return false;
        if (valor > limite) return false;
        if (!origem.sacar(valor)) return false;

        destino.depositar(valor);
        return true;
    }

    public double getLimite() {
        return limite;
    }
}

public class Main {
    public static void main(String[] args) {
        final String SENHA_CORRETA = "J@vaPOO";
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Conta origem = new Conta(1000.00);
        Conta destino = new Conta(2000.00);
        TransacaoPIX pix = new TransacaoPIX(500.00);

        // Autenticação
        boolean autenticado = false;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();
            if (senha.equals(SENHA_CORRETA)) {
                autenticado = true;
                break;
            } else {
                System.out.println("Senha incorreta! Tentativa " + i + " de 3.");
            }
        }

        if (!autenticado) {
            System.out.println("Acesso negado!");
            sc.close();
            return;
        }

        // Coleta dados
        System.out.print("Informe a chave PIX destino: ");
        String chavePix = sc.nextLine();
        System.out.print("Informe o valor da transferência: ");
        double valor = sc.nextDouble();

        boolean sucesso = pix.transferir(origem, destino, valor);

        // Relatório
        System.out.println("\n------ RELATÓRIO ------");
        System.out.println("Chave PIX destino: " + chavePix);
        System.out.println("Valor da transferência: R$ " + String.format("%.2f", valor));
        System.out.println("Resultado: " + (sucesso ? "REALIZADA" : "NEGADA"));
        System.out.println("Saldo final origem: R$ " + String.format("%.2f", origem.getSaldo()));
        System.out.println("Limite PIX: R$ " + String.format("%.2f", pix.getLimite()));
        System.out.println("Saldo final destino: R$ " + String.format("%.2f", destino.getSaldo()));

        sc.close();
    }
1
}