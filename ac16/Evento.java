
import java.util.ArrayList;
import java.util.List;
class Evento {
    private String nome;
    private String local;
    private String data;
    private List<Artista> artistas;

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.artistas = new ArrayList<>();
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void exibirResumo() {
        System.out.println("\nEvento: " + nome);
        System.out.println("Local: " + local);
        System.out.println("Data: " + data);
        System.out.println("Artistas participantes:");
        for (Artista a : artistas) {
            System.out.println(" - " + a.getNome());
        }
    }
}