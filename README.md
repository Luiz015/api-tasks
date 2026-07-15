✅ Task Manager API

API REST desenvolvida para gerenciamento de tarefas, permitindo criar, visualizar, atualizar e excluir tarefas de forma simples e organizada.

O projeto foi desenvolvido com Java + Spring Boot, aplicando conceitos de criação de APIs REST, persistência de dados e organização em camadas.

🚀 Funcionalidades
✅ Criar tarefas
✅ Listar tarefas
✅ Buscar tarefas por título
✅ Filtrar tarefas por status
✅ Atualizar tarefas
✅ Excluir tarefas
✅ Controle de status das tarefas
✅ Registro de data de criação e atualização
🛠️ Tecnologias utilizadas
Java 21
Spring Boot
Spring Web → criação dos endpoints REST
Spring Data JPA → comunicação com o banco de dados
Hibernate → ORM para persistência dos dados
H2 Database → banco de dados em memória
Lombok → redução de código repetitivo
📂 Estrutura do projeto
src/main/java/com/luiz/tasks

├── controller
│   └── TaskController.java
│
├── business
│   ├── TaskService.java
│   └── enums
│       └── StatusTask.java
│
└── infrastructure
    ├── entity
    │   └── Task.java
    │
    └── repository
        └── TaskRepository.java
📌 Modelo da Task

Cada tarefa possui:

id
titulo
descricao
status
dataCriacao
dataConclusao
dataAtualizacao
▶️ Como executar o projeto
Pré-requisitos
Java 21 instalado
Maven instalado
Clonar o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git
Entrar na pasta do projeto
cd tasks
Executar a aplicação
mvn spring-boot:run

A API estará disponível em:

http://localhost:8080

🗄️ Banco de dados

O projeto utiliza o H2 Database, um banco em memória utilizado para desenvolvimento e testes.

As informações são armazenadas enquanto a aplicação está em execução.

👨‍💻 Autor

Luiz Fernando de Carvalho Teixeira

Desenvolvido com Java e Spring Boot 🚀
