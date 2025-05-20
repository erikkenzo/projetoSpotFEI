Projeto Spotify FEI - Documentação
Visão Geral
O Spotify FEI é um sistema de gerenciamento de músicas e playlists desenvolvido em Java com interface gráfica Swing, seguindo o padrão arquitetural MVC (Model-View-Controller).

Funcionalidades Principais
✔ Autenticação de usuários (login e cadastro)
✔ Gerenciamento de músicas (CRUD: criar, ler, atualizar, deletar)
✔ Criação e edição de playlists
✔ Pesquisa de músicas (por título ou artista)

Arquitetura do Sistema
1. Model (Modelagem de Dados)
Classe	Atributos	Métodos Principais
Usuario.java	id, nome, usuario, senha	getters/setters, autenticar()
Musica.java	id, titulo, artista, duracao	getters/setters, formatarDuracao()
Playlist.java	nome, List<Musica>	adicionarMusica(), removerMusica()

2. View (Interface Gráfica)
Tela	Componentes Principais
LoginFrame.java	Campos: usuário e senha / Botões: Login e Cadastro
CadastroFrame.java	Campos: nome, usuário, senha / Validação de dados
MenuFrame.java	Opções: Gerenciar Músicas, Playlists, Sair
MusicaFrame.java	Lista de músicas / CRUD / Pesquisa
PlaylistFrame.java	Criação de playlists / Adição de músicas

3. Controller (Lógica de Aplicação)
Controller	Responsabilidade
ControllerLogin.java	Valida credenciais e gerencia autenticação
ControllerCadastro.java	Gerencia cadastro de novos usuários
ControllerMusica.java	Controla operações de músicas (CRUD, busca)
ControllerPlaylist.java	Gerencia criação e edição de playlists
ControllerMenu.java	Navegação entre telas do sistema

4. DAO (Acesso a Dados)
Classe	Métodos Principais
UsuarioDAO.java	inserir(), autenticar(), buscarPorUsuario()
MusicaDAO.java	listarTodas(), pesquisarPorTitulo()
PlaylistDAO.java	adicionarMusica(), removerMusica()



Conexao.java	Gerencia conexão com PostgreSQL
Configuração do Banco de Dados
O sistema utiliza PostgreSQL com a seguinte configuração:

URL: jdbc:postgresql://localhost:5432/ProjetoSpotifei  
Usuário: postgres  
Senha: 1211  


Tabelas Necessárias

CREATE TABLE Usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    usuario VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(50) NOT NULL
);

CREATE TABLE Musica (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    artista VARCHAR(100) NOT NULL,
    duracao INT NOT NULL
);

CREATE TABLE Playlist (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    usuario_id INT REFERENCES Usuario(id)
);

CREATE TABLE Playlist_Musica (
    playlist_id INT REFERENCES Playlist(id),
    musica_id INT REFERENCES Musica(id),
    PRIMARY KEY (playlist_id, musica_id)
);



Como Executar o Projeto
Pré-requisitos
✅ Java JDK 8+ instalado
✅ PostgreSQL configurado com as tabelas acima
✅ IDE (Eclipse, IntelliJ, VS Code) ou terminal com Maven

Passos para Execução
Clone o repositório (se aplicável) ou importe o projeto na IDE.

Configure o banco de dados no arquivo Conexao.java.

Execute a classe principal (Main.java ou equivalente).

Acesse o sistema via interface gráfica.

Build e Execução via Terminal
# Compilar
javac -d bin src/*.java  

# Executar
java -cp bin Main  
