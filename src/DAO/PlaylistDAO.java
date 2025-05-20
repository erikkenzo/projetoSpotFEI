package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Musica;

public class PlaylistDAO {
    private List<Musica> musicas;
    private String nomePlaylist;
    
    public PlaylistDAO() {
        this.musicas = new ArrayList<>();
    }
    
    // add musicas na playlist
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }
    
    
    public void removerMusica(int index) {
        if (index >= 0 && index  < musicas.size()) {
            musicas.remove(index);
        }
    }
    
    
    public void editarMusica(int id, Musica musicaAtualizada) {
        if (id >=  0 &&  id < musicas.size()) {
            musicas.set(id, musicaAtualizada);
            
        }
    }
    
    public List<Musica> getMusicas() {
        return new ArrayList<>(musicas);
        
    }
    
    public void setNomePlaylist(String nome) {
        this.nomePlaylist = nome;
    }
    
    public String getNomePlaylist() {
        return nomePlaylist;
    }
            
}
