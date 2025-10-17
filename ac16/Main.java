public class Main {
    public static void main(String[] args) {
        Artista a1 = new Artista("Caetano Veloso", 78);
        Artista a2 = new Artista("Anitta", 31);
        Artista a3 = new Artista("Alceu Valença", 76);

        Evento e1 = new Evento("Festival da Música Brasileira", "Rio de Janeiro", "12/11/2025");
        Evento e2 = new Evento("Show de Verão", "Salvador", "20/01/2026");

        e1.adicionarArtista(a1);
        e1.adicionarArtista(a3);
        e2.adicionarArtista(a2);
        e2.adicionarArtista(a1);

        e1.exibirResumo();
        e2.exibirResumo();
    }
}