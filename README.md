# ✅ Task Manager API

API REST desenvolvida para gerenciamento de tarefas, permitindo criar, visualizar, atualizar e excluir tarefas de forma simples e organizada.

O projeto foi desenvolvido utilizando **Java + Spring Boot**, aplicando conceitos de desenvolvimento de APIs REST, persistência de dados e organização em camadas.

---

## 🚀 Funcionalidades

- ✅ Criar tarefas
- ✅ Listar tarefas
- ✅ Buscar tarefas por título
- ✅ Filtrar tarefas por status
- ✅ Atualizar tarefas
- ✅ Excluir tarefas
- ✅ Controle de status das tarefas
- ✅ Registro de data de criação e atualização

---

## 🛠️ Tecnologias utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web** → criação dos endpoints REST
- **Spring Data JPA** → comunicação com o banco de dados
- **Hibernate** → mapeamento objeto-relacional (ORM)
- **H2 Database** → banco de dados em memória
- **Lombok** → redução de código repetitivo

---

## 📂 Estrutura do projeto

```
src/main/java/com/luiz/tasks

├── controller
│   └── TaskController.java
│
├── business
│   ├── service
│   │   └── TaskService.java
│   │
│   └── enums
│       └── StatusTask.java
│
└── infrastructure
    ├── entity
    │   └── Task.java
    │
    └── repository
        └── TaskRepository.java
```

---

## 📌 Modelo da Task

Cada tarefa possui os seguintes atributos:

| Campo | Descrição |
|---|---|
| `id` | Identificador único da tarefa |
| `titulo` | Nome da tarefa |
| `descricao` | Descrição da tarefa |
| `status` | Estado atual da tarefa |
| `dataCriacao` | Data em que a tarefa foi criada |
| `dataConclusao` | Data em que a tarefa foi concluída |
| `dataAtualizacao` | Última atualização realizada |

---

## ▶️ Como executar o projeto

### Pré-requisitos

- Java 21 instalado
- Maven instalado

### Clonar o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

### Entrar na pasta do projeto

```bash
cd tasks
```

### Executar a aplicação

```bash
mvn spring-boot:run
```

A API estará disponível em:

```
http://localhost:8080
```

---

# 🔗 Endpoints

## Criar tarefa

**POST**

```
/tasks
```

Exemplo de requisição:

```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Criar uma API REST",
  "status": "PENDENTE"
}
```

---

## Buscar tarefa por título

**GET**

```
/tasks/titulo?titulo=Estudar Spring Boot
```

---

## Buscar tarefas por status

**GET**

```
/tasks/status?status=PENDENTE
```

Status disponíveis:

```
PENDENTE
EM_ANDAMENTO
CONCLUIDA
```

---

## Atualizar tarefa

**PUT**

```
/tasks?titulo=Estudar Spring Boot
```

Exemplo de requisição:

```json
{
  "titulo": "Estudar Spring Boot Avançado",
  "descricao": "Aprofundar conhecimentos em Spring",
  "status": "EM_ANDAMENTO"
}
```

---

## Excluir tarefa

**DELETE**

```
/tasks?titulo=Estudar Spring Boot
```

---

## 🗄️ Banco de dados

O projeto utiliza o **H2 Database**, um banco de dados em memória utilizado para desenvolvimento e testes.

As informações são mantidas enquanto a aplicação está em execução.

---

## 📚 Conceitos aplicados

Durante o desenvolvimento do projeto foram utilizados conceitos como:

- Criação de APIs REST
- Arquitetura em camadas
- Injeção de dependências
- Persistência de dados com JPA/Hibernate
- Regras de negócio utilizando Service
- Uso de Enums
- Manipulação de requisições HTTP
- Testes de endpoints utilizando Postman

---

## 👨‍💻 Autor

**Luiz Teixeira**

Desenvolvido com Java e Spring Boot 🚀
