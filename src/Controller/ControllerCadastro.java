package Controller;
        
import DAO.UsuarioDAO;
import Conexao.conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Usuario;
import view.CadastroFrame;

public class ControllerCadastro {
    private final CadastroFrame view;
    
    public ControllerCadastro(CadastroFrame view){
        this.view = view;
    }
    
    public void salvarUsuario(){
      if (view.getTxtNome().getText().isEmpty() || 
        view.getTxtUsuario().getText().isEmpty() || 
        view.getTxtSenha().getText().isEmpty()) {
        JOptionPane.showMessageDialog(view, 
                "Preencha todos os campos!", 
                "Erro", JOptionPane.WARNING_MESSAGE);
        return;
    }
        
    Connection conn = null;
    try {
        String nome = view.getTxtNome().getText();
        String usuario = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        
        Usuario usuarioObj = new Usuario(nome, usuario, senha);
        conn = conexao.conectar();
        UsuarioDAO dao = new UsuarioDAO(conn);
            
        if (dao.usuarioExiste(usuario)) {
            JOptionPane.showMessageDialog(view, 
                "Usuário já cadastrado!", 
                "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }    
       
        boolean cadastrou = dao.inserir(usuarioObj);
                 
        if (cadastrou) {
            JOptionPane.showMessageDialog(view, 
                "Usuário cadastrado com sucesso!", 
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            view.getTxtNome().setText("");
            view.getTxtUsuario().setText("");
            view.getTxtSenha().setText("");
        } else {
            JOptionPane.showMessageDialog(view, 
                "Falha ao cadastrar usuário!", 
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(view, 
            "Erro ao cadastrar: " + e.getMessage(), 
            "Erro de Banco de Dados", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                
            }
        }
    }
    }
}