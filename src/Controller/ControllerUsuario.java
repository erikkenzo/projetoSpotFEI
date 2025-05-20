//package controller;
//
//import DAO.UsuarioDAO;
//import Conexao.conexao;
//import java.sql.Connection;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//import Model.Usuario;
//import java.awt.Component;
//
//
//    public class ControllerUsuario {
//        private Usuario usuario;
//        private Component view;
//
//    public ControllerUsuario(Usuario usuario) {
//        this.view = view;
//        this.usuario = usuario;
//    }
//    
////    public void atualizar(){
//        Component view = null;
//        String novaSenha = view.getTxt_senha().getText(); 
//        String usuario = view.getLbl_Nome().getText(); 
//        Usuario usuarioObj = new Usuario("", usuario, novaSenha);
//        
//        conexao conexao = new conexao();
//        try{
//            Connection conn = conexao.getConnection();
//            UsuarioDAO dao = new UsuarioDAO(conn);
//            dao.atualizar(usuarioObj);
//            JOptionPane.showMessageDialog(view, "Senha de Usuário atualizada com Sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(view, "Falha de conexão!", "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    
//    public void remover(){
//        String usuario = this.usuario.getUsuario();
//        Component view = null;
//        int option = JOptionPane.showConfirmDialog(view, "Deseja realmente excluir o cadastro",
//                "Aviso", JOptionPane.YES_NO_OPTION);
//        if(option != 1){
//            conexao conexao = new conexao();
//            try{
//                Connection conn = conexao.getConnection();
//                UsuarioDAO dao = new UsuarioDAO(conn);
//                dao.remover(usuario);
//                JOptionPane.showMessageDialog(view, "Usuario removido com Sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
//            }catch(SQLException e){
//                JOptionPane.showMessageDialog(view, "Falha de conexão!", "Erro", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    }
//    
//}
//
