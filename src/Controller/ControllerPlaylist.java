package Controller;

import DAO.PlaylistDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Musica;

public class ControllerPlaylist {
    private PlaylistDAO PlaylistDAO;
    
    public ControllerPlaylist() {
        this.PlaylistDAO = new PlaylistDAO();
    }
    
    public boolean criarPlaylist(String nome) {
        if (nome == null || nome .trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome da playlist não pode estar vazio!");
            return false;             
        }
        PlaylistDAO.setNomePlaylist(nome);
        return true;
        
    }
    public void adicionarMusica(Musica musica) {
        PlaylistDAO.adicionarMusica(musica);
    }
    
    public void removerMusica(int index) {
        PlaylistDAO.removerMusica(index);
    }
    
    
    public void editarMusica(int id, String titulo, String artista, String duracao) {
        Musica musicaAtualizada = new Musica(id, titulo, artista, duracao);
        PlaylistDAO.editarMusica(id, musicaAtualizada);
    }
    
    public void carregarMusicasNaTabela(DefaultTableModel model) {
        model.setRowCount(0); // limpa a tabela de musica
        
        
        List<Musica> musicas = PlaylistDAO.getMusicas();
        for (Musica musica: musicas) {
            model.addRow(new Object[]{
                musica.getId(),
                musica.getTitulo(),
                musica.getArtista(),
                musica.getDuracao()
            });
        }
    }
    public String getNomePlaylist() {
        return PlaylistDAO.getNomePlaylist();
    }
    
}
