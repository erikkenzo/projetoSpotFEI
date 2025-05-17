package DAO;

import Conexao.conexao;
import model.Musica;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class MusicaDAO {
    
    public List<Musica> listarTodas() throws SQLException {
        String sql = "SELECT id, titulo, artista, duracao FROM musica ORDER BY titulo";
        List<Musica> musicas = new ArrayList<>();    
        
        try (Connection conn = conexao.Conexao();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Musica musica = new Musica();
                musica.setId(rs.getInt("id"));
                musica.setTitulo(rs.getString("titulo"));
                musica.setArtista(rs.getString("artista"));
                musica.setDuracao(rs.getString("duracao"));
                musicas.add(musica);
            }
        } catch (SQLException e){
            System.err.println("Erro ao listar músicas: " + e.getMessage());
            throw e;
        }
        return musicas;
}

    public List<Musica> pesquisar(String termoPesquisa) throws SQLException {
        String  sql = "SELECT id, titulo, artista, duracao FROM musica WHERE titulo LIKE ? OR artista LIKE ? ORDER BY titulo";
        List<Musica> musicas = new ArrayList<>();
        
        try (Connection conn = conexao.Conexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, "%" + termoPesquisa + "%");
            stmt.setString(2, "%" + termoPesquisa + "%");
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Musica musica = new Musica();
                    musica.setId(rs.getInt("id"));
                    musica.setTitulo(rs.getString("titulo"));
                    musica.setArtista(rs.getString("artista"));
                    musica.setDuracao(rs.getString("duracao"));
                    musicas.add(musica);
                }
            } catch (SQLException e) {
                System.err.println("Erro ao pesquisar músicas: " + e.getMessage());
            throw e;
            }
            return musicas;
        }
    }

}