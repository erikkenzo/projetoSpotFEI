package Model;

import java.util.List;
import model.Musica;
import java.util.ArrayList;

public class Playlist {
   private int id;
   private String nome;
   private List<Musica> musicas;
   
public Playlist() {
    this.musicas = new ArrayList<>();
}

    public Playlist(String nome) {
        this.nome = nome;
    }

    public Playlist(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
    
   public void adicionarMusica(Musica musica) {
       if (musica != null && !musicas.contains(musica)) {
           musicas.add(musica);
       }
   }
   
   public void removerMusicaPorId(int idMusica) {
       musicas.removeIf(m -> m.getId() == idMusica);
       
   }
   
   public boolean contemMusica(Musica musica) {
       return musicas.contains(musica);
   }
   
   @Override
   public String toString() {
       return "Playlist{" +
               "id=" + id +
               ", nome= '" + nome + '\'' +
               ", qtdMusicas=" + musicas.size() +
               '}';
   }
}