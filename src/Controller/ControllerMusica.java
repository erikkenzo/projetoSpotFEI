package Controller;

import java.util.List;
import model.Musica;
import DAO.MusicaDAO;
import java.sql.SQLException;



public class ControllerMusica {
      private MusicaDAO musicaDAO;
    
    public ControllerMusica() {
        this.musicaDAO = new MusicaDAO();
    }

    public List<Musica> pesquisarMusicas(String termo) throws SQLException {
            return musicaDAO.pesquisar(termo);
       
    }

    public List<Musica> listarTodasMusicas() throws SQLException {
        return musicaDAO.listarTodas();
    }

}
