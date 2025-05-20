package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import Model.Usuario;

public class UsuarioDAO {
    private final Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }
    

    public ResultSet consultar(Usuario usuario) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        return statement.executeQuery();
    }
    
    public boolean inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (nome, usuario, senha) VALUES (?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getUsuario());
            statement.setString(3, usuario.getSenha());
            return statement.executeUpdate() > 0;
        }
    }
    
    public boolean atualizar(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET senha = ? WHERE usuario = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, usuario.getSenha());
            statement.setString(2, usuario.getUsuario());
            return statement.executeUpdate() > 0;
        }
    }
    
    public boolean remover(Usuario usuario) throws SQLException {
        String sql = "DELETE FROM usuario WHERE usuario = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, usuario.getUsuario());
            return statement.executeUpdate() > 0;
        }
    }

    public boolean remover(String usuario) throws SQLException {
        String sql = "DELETE FROM usuario WHERE usuario = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, usuario);
            return statement.executeUpdate() > 0;
        }
    }

    public boolean usuarioExiste(String usuario) throws SQLException {
        String sql = "SELECT COUNT(*) FROM usuario WHERE usuario = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, usuario);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            return false;
        }
    }
    
    public Usuario buscarPorUsuario(String usuario) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE usuario = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, usuario);
            
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getString("nome"),
                        rs.getString("usuario"),
                        rs.getString("senha")
                    );
                }
                return null;
            }
        }
    }

    public Usuario autenticar(String usuario, String senha) throws SQLException {
    String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
    
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, usuario);
        stmt.setString(2, senha); 
        
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()) {
            Usuario user = new Usuario();
            user.setId(rs.getInt("id"));
            user.setNome(rs.getString("nome"));
            user.setUsuario(rs.getString("usuario"));
            return user;
        }
        return null;
    }
}

    public Usuario buscarPorUsuarioESenha(String usuario, String senha) throws SQLException {
    String sql = "SELECT id, nome, usuario, senha FROM usuario WHERE usuario = ? AND senha = ?";
    
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, usuario);
        stmt.setString(2, senha);
        
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                Usuario user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setUsuario(rs.getString("usuario"));
                user.setSenha(rs.getString("senha"));
                return user;
            }
            return null;
        }
    }
    
    
}
    public void listarTodosUsuarios() throws SQLException {
    String sql = "SELECT id, nome, usuario, senha FROM usuario";
    
    try (PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        
        System.out.println("=== USUÁRIOS NO BANCO DE DADOS ===");
        while (rs.next()) {
            System.out.println(
                "ID: " + rs.getInt("id") + " | " +
                "Nome: " + rs.getString("nome") + " | " +
                "Usuário: " + rs.getString("usuario") + " | " +
                "Senha: " + rs.getString("senha")
            );
        }
    }
}
   

    
}