package Conexao;

import DAO.PlaylistDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;



public class conexao {
     public static Connection conectar() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            return java.sql.DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/ProjetoSpotifei", // banco
                "postgres", // usuário
                "1211"  // senha
            );
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Erro ao conectar: " + e.getMessage());
        }
    }
        // retornar a varivel de connection;
     
     
     
     
      public static boolean cadastrarUsuario(String nome, String usuario, String senha) {
        String sql = "INSERT INTO usuario (nome, usuario, senha) VALUES (?, ?, ?)";
        
        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nome);
            stmt.setString(2, usuario);
            stmt.setString(3, senha);
            
          return stmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }
    }
     
     
    public static void main(String[] args) {
        try (Connection c = conectar()) {
            System.out.println("Conexão bem-sucedida!");  
            
            boolean cadastrou = cadastrarUsuario("Erik", "erik123", "senha1211");
            
            
      if (cadastrou) {
                System.out.println("Usuário cadastrado com sucesso!");
            } else {
                System.out.println("Falha ao cadastrar usuário.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }

    public static Connection Conexao() throws SQLException {
        return conectar();
    }

     public static Connection getConnection() throws SQLException {
        return conectar(); // Reutiliza a conexão existente
    }

   
 
}
    
            

