//package Model;
//
//import java.util.Objects;
//
//public class Pessoa {
//    private int id;
//    private String nome;
//    private String email;
//    private String senha;
//    private String tipo;
//
//    public Pessoa(int id, String nome, String email, String senha, String tipo) {
//        this.id = id;
//        this.nome = nome;
//        this.email = validarEmail(email);
//        this.senha = validarSenha(senha);
//        this.tipo = validarTipo(tipo);
//    }
//
//   
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = validarEmail(email);
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = validarSenha(senha);
//    }
//    
//    public String getTipo() {
//        return tipo;
//    }
//    
//    public void setTipo(String tipo) {
//        this.tipo = validarTipo(tipo);
//    }
//
//    
//    private String validarEmail(String email) {
//        Objects.requireNonNull(email, "Email não pode ser nulo");
//        if (!email.contains("@") || !email.contains(".")) {
//            throw new IllegalArgumentException("Email inválido");
//        }
//        return email;
//    }
//    
//    private String validarSenha(String senha) {
//        Objects.requireNonNull(senha, "Senha não pode ser nula");
//        if (senha.length() < 6) {
//            throw new IllegalArgumentException("Senha deve ter pelo menos 6 caracteres");
//        }
//        return senha;
//    }
//    
//    private String validarTipo(String tipo) {
//        Objects.requireNonNull(tipo, "Tipo não pode ser nulo");
//        if (!tipo.equalsIgnoreCase("USUARIO") && !tipo.equalsIgnoreCase("ADMIN")) {
//            throw new IllegalArgumentException("Tipo deve ser USUARIO ou ADMIN");
//        }
//        return tipo.toUpperCase();
//    }
//
//   
//    @Override
//    public String toString() {
//        return String.format("Pessoa[id=%d, nome='%s', email='%s', tipo='%s']", 
//                          id, nome, email, tipo);
//    }
//    
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pessoa pessoa = (Pessoa) o;
//        return id == pessoa.id && 
//               Objects.equals(email, pessoa.email);
//    }
//    
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, email);
//    }
//}