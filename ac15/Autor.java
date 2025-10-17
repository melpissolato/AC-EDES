import java.util.ArrayList;
import java.util.List;

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

    public void exibirResumoObras() {
        System.out.println("Autor: " + nome + " | CPF: " + cpf);
        System.out.println("Obras publicadas:");
        for (Livro livro : livros) {
            System.out.println(" - " + livro.getDescricao() + " (" + livro.getPaginas() + " páginas)");
        }
    }
}


