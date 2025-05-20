PROJETO SPOTIFY FEI
VISÃO GERAL
O Spotify FEI é um sistema completo de gerenciamento musical desenvolvido em Java utilizando interface gráfica Swing e arquitetura MVC. O projeto oferece funcionalidades robustas para cadastro de usuários, autenticação segura, gerenciamento de músicas e criação de playlists personalizadas. Com integração a banco de dados PostgreSQL, o sistema permite operações CRUD completas, pesquisa avançada por título ou artista, e uma experiência de usuário intuitiva através de suas diversas telas interconectadas.

DETALHES TÉCNICOS
COMPONENTES PRINCIPAIS
Modelagem de Dados

Usuario: Gerencia informações de autenticação (ID, nome, usuário, senha) com métodos de validação

Musica: Armazena metadados musicais (ID, título, artista, duração) com formatação especializada

Playlist: Estrutura flexível para agrupamento musical com métodos de manipulação de lista

Interface Gráfica

Login/Cadastro: Telas responsivas com validação em tempo real e feedback visual

Menu Principal: Navegação simplificada entre módulos do sistema

Gerenciamento Musical: Interface tabular com filtros e operações CRUD integradas

Playlists: Visualização hierárquica com arrastar-e-soltar (drag-and-drop)

Lógica de Negócios

Controladores especializados para cada módulo

Validação em múltiplas camadas (cliente/servidor)

Tratamento de exceções granular

Padrão DAO para persistência otimizada

Integração com Banco de Dados

Conexão PostgreSQL configurável

Pool de conexões eficiente

Consultas parametrizadas para segurança

Transações ACID para operações críticas

IMPLEMENTAÇÃO E EXECUÇÃO
PRÉ-REQUISITOS
Java JDK 11+

PostgreSQL 12+

Bibliotecas: JDBC, Swing

CONFIGURAÇÃO INICIAL
Criar database 'ProjetoSpotifei' no PostgreSQL

Executar scripts DDL para criação de tabelas

Configurar parâmetros de conexão em conexao.java

Popular tabelas com dados iniciais (opcional)

FLUXO DE TRABALHO TÍPICO
Autenticação:

Cadastro inicial com validação de duplicidade

Login seguro com criptografia básica

Gerenciamento Musical:

Importação de metadados musicais

Pesquisa multicritério (título/artista)

Edição em lote de propriedades

Playlists:

Criação com nomes personalizados

Organização por tags/categorias

Exportação/importação em formato JSON

Administração:

Backup automático de dados

Logs de operações críticas

Gerenciamento de usuários

MELHORIAS FUTURAS
Implementação de streaming musical

Integração com APIs de provedores de conteúdo

Sistema de recomendações baseado em machine learning

Versão mobile com sincronização em nuvem

Análise de estatísticas de reprodução

O projeto representa uma base sólida para sistemas de gerenciamento musical, com arquitetura escalável e boas práticas de desenvolvimento. O código-fonte está organizado para facilitar a manutenção e extensão de funcionalidades.

