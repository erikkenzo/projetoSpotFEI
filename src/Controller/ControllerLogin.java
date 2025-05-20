package Controller;

import DAO.UsuarioDAO;
import Conexao.conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Usuario;
import view.LoginFrame;
import view.MenuFrame;

public class ControllerLogin {
    private final LoginFrame view;

    public ControllerLogin(LoginFrame view) {
        this.view = view;
    }
    
    public void loginUsuario() {
        // Validação dos campos
        if(view.txtNomeLogin().getText().isEmpty() || 
           view.txtSenhaLogin().getText().isEmpty()) {
            JOptionPane.showMessageDialog(view,
                "Por favor, preencha todos os campos!",
                "Aviso",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        String usuarioLogin = view.txtNomeLogin().getText();
        String senhaLogin = view.txtSenhaLogin().getText();

        try (Connection conn = conexao.conectar()) {
            UsuarioDAO dao = new UsuarioDAO(conn);
            
            
            Usuario usuario = dao.buscarPorUsuarioESenha(usuarioLogin, senhaLogin);
            
            if(usuario != null) {
                new MenuFrame().setVisible(true);
                view.dispose(); 
                JOptionPane.showMessageDialog(view,
                    "Login realizado com sucesso! Bem-vindo, " + usuario.getNome() + ".",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                JOptionPane.showMessageDialog(view,
                    "Usuário ou senha incorretos!",
                    "Erro de login",
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(view,
                "Erro ao conectar com o banco de dados: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
       
        }
    }
    
     private void fazerLogin() {
        boolean autenticado = false;
        
        if(autenticado) {
            MenuFrame menuFrame = new MenuFrame();
            new ControllerMenu(menuFrame); 
            menuFrame.setVisible(true);
            view.dispose();
        }
    }
}