# java10x-projeto1
Projeto 1 do Curso Java10x com Java 17 e Spring Boot 3</br>
![](https://skillicons.dev/icons?i=java,spring,docker,postgres,&perline=6)

# Bem-vindo ao Sistema de Cadastro de Ninjas, Aldeias e Missões!
Este projeto é uma aplicação de arquitetura em camadas desenvolvida com Spring Boot 3, projetada para cadastrar ninjas e suas respectivas missões e aldeia. O projeto utiliza PostgreSQL Dockerizado como banco de dados, Flyway para migrações de banco de dados e segue boas práticas de desenvolvimento de software como controle de versão com Git e hospedagem de repositório no GitHub. O projeto tambem conta com algumas aulas extras sobre banco de dados de uma maneira mais profunda.

## Visão Geral do Projeto
Este sistema foi desenvolvido para gerenciar ninjas e suas missões e aldeia na qual ele pertence. Cada ninja pode ser atribuído a uma única missão, enquanto uma missão pode ser associada a vários ninjas. Para utilizar o sistema, cadastre-se primeiro. As principais funcionalidades incluem:

- Cadastro de ninjas com nome, clã, poder de ataque, poder de defesa, poder de ninjutsu, aldeia, rank, cargo, titulo.
- Atribuição de uma missão para um ninja.
- Gerenciamento de missões e dos ninjas associados a elas.
- Gerenciamento de Aldeias e dos ninjas associados a elas.

## Tecnologias Utilizadas até o momento
- Spring Boot: Para criação da aplicação web e gerenciamento de dependências junto ao Maven.
- Spring Security com authenticação com Token JWT.
- Banco de Dados PostgreSQL: Banco de dados para desenvolvimento.
- Banco de Dados H2: Banco de dados para testes.
- Flyway: Para gerenciamento de migrações do banco de dados.
- JPA (Java Persistence API): Para mapeamento objeto-relacional (ORM).
- Git: Controle de versão para gerenciamento de mudanças no código.
- GitHub: Hospedagem do repositório para controle de versão.
- Spring Data JPA: Para interação com o banco de dados.
- Maven: Para build e gerenciamento de dependências do projeto.
- Lombok: Diminuição de código Boilerplate.
- Docker: Para build externo do banco de dados e da aplicação.
- SQL: Manipulação do banco de dados

## Design do Banco de Dados

### Entidades:
- Ninja: Contém atributos como id, nome, cla, power_atack, power_defense, power_ninjutsu, idade, rank, cargo e titulo.
- Missão: Contém atributos como id, rank, nome e descrição.
- Aldeia: Contém atributos como id, kageAtual.
- User: Contém os atributos como id, nickname, email, password.

### O esquema do banco de dados segue as seguintes relações:
- Um Ninja pode ter apenas uma Missão, mas uma Missão pode ser atribuída a vários Ninjas.
- Um Ninja pode ter apenas uma Aldeia, mas uma Aldeia pode ser atribuída a vários Ninjas.
- Um User contem seus atributos unicos, usado para fazer o login e utilizar a API.
