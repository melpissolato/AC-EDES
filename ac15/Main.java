public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "123.456.789-00");

        Livro l1 = new Livro("Dom Casmurro", 300);
        Livro l2 = new Livro("Memórias Póstumas de Brás Cubas", 250);

        autor.adicionarLivro(l1);
        autor.adicionarLivro(l2);

        autor.exibirResumoObras();
    }
}
