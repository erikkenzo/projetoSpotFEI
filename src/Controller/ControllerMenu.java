package Controller;

import view.MenuFrame;
import view.MusicaFrame;
import view.PlaylistFrame;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class ControllerMenu {
    private MenuFrame view;

    public ControllerMenu(MenuFrame view) {
        this.view = view;
        initController();
    }

    private void initController() {
        view.getBtnMusicas().addActionListener(e -> abrirMusicas());
        view.getBtnPlaylist().addActionListener(e -> abrirPlaylists());
        view.getBtnSair().addActionListener(e -> sair());
    }
    
    private void abrirMusicas() {
        Musicaframe musicasFrame = new Musicaframe();
        musicasFrame.setVisible(true);
        view.dispose();
    }
    
    private void abrirPlaylists() {
        PlaylistFrame playlistFrame = new PlaylistFrame(view);
        playlistFrame.setVisible(true);
        view.dispose();
    }
    
    private void sair() {
        int confirm = JOptionPane.showConfirmDialog(
            view, 
            "Deseja realmente sair?", 
            "Confirmação", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private static class Musicaframe {

        public Musicaframe() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

