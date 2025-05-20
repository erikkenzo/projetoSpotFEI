package Model;

public class Usuario {
    private int id;
    private String nome;
    private String usuario;
    private String senha;

    public Usuario(int id, String nome, String usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(String nome, String usuario, String senha) {
        this(0, nome, usuario, senha); // ID 0 indica que ainda não foi persistido
    }

    // Construtor vazio com valores padrão
    public Usuario() {
        this(0, "", "", "");
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}


    
    
 
 