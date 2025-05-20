




Projeto Spotify FEI
Visão Geral do Projeto
O Spotify FEI é um sistema de gerenciamento de músicas e playlists desenvolvido em Java com interface gráfica Swing, seguindo o padrão arquitetural MVC (Model-View-Controller). O sistema permite:

Cadastro e autenticação de usuários

Gerenciamento de músicas (cadastro, edição, exclusão)

Criação e manipulação de playlists

Pesquisa de músicas por título ou artista

Arquitetura do Sistema

1. Model (Modelagem de Dados)

Entidades Principais:

Usuario.java

Atributos: id, nome, usuario, senha

Métodos: getters/setters, autenticação básica

Musica.java

Atributos: id, titulo, artista, duracao

Métodos: getters/setters, formatação de duração

Playlist.java

Atributos: nome, lista de músicas

Métodos: adicionar/remover músicas, editar música

2. View (Interface Gráfica)
LoginFrame.java

Campos: usuário e senha

Botões: login e cadastro

CadastroFrame.java

Campos: nome completo, usuário, senha

Validação de campos obrigatórios

MenuFrame.java

Opções: Gerenciar Músicas, Gerenciar Playlists, Sair

MusicaFrame.java

Listagem de músicas

Pesquisa por título/artista

CRUD de músicas

PlaylistFrame.java

Criação de playlists

Adição/remoção de músicas

Visualização de playlists existentes

3. Controller (Lógica de Aplicação)
ControllerLogin.java

Valida credenciais

Gerencia fluxo de autenticação

Exibe mensagens de erro/sucesso

ControllerCadastro.java

Valida dados de cadastro

Verifica duplicidade de usuários

Gerencia persistência de novos usuários

ControllerMusica.java

Gerencia operações com músicas

Pesquisa e listagem

Integração com MusicaDAO

ControllerPlaylist.java

Criação e edição de playlists

Adição/remoção de músicas

Atualização da interface

ControllerMenu.java

Navegação entre telas

Gerencia ações do menu principal

4. DAO (Acesso a Dados)
UsuarioDAO.java

Métodos: inserir, atualizar, remover, autenticar

Consultas: por usuário, por usuário/senha

MusicaDAO.java

Métodos: listar todas, pesquisar

Consultas: por título ou artista

PlaylistDAO.java

Métodos: adicionar/remover músicas, editar

Armazenamento em memória (poderia ser persistente)

conexao.java

Gerencia conexão com PostgreSQL

Configuração de URL, usuário e senha

Métodos auxiliares para cadastro

Funcionalidades Implementadas
Autenticação e Cadastro
Login com validação de credenciais

Cadastro de novos usuários com verificação de duplicidade

Mensagens de feedback para o usuário

Gerenciamento de Músicas
Listagem completa de músicas

Pesquisa por termos (título ou artista)

Interface tabular para visualização

Playlists
Criação de playlists com nome personalizado

Adição e remoção de músicas

Visualização do conteúdo da playlist

Edição de músicas na playlist

Configuração do Banco de Dados
O sistema utiliza PostgreSQL com a seguinte configuração padrão


jdbc:postgresql://localhost:5432/ProjetoSpotifei
Usuário: postgres
Senha: 1211


Como Executar o Projeto
Certifique-se de ter o Java JDK 8+ instalado

Configure o banco de dados PostgreSQL com as tabelas necessárias

Importe o projeto na sua IDE favorita (Eclipse, IntelliJ, etc.)

Execute a classe principal ou construa o arquivo JAR


