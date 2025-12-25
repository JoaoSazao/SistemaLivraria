# 📚 Sistema de Livraria em Java

Este projeto consiste em um **sistema de console para gerenciamento de empréstimos de livros**, desenvolvido em Java, com foco na aplicação prática dos conceitos fundamentais da linguagem.

O sistema permite listar livros disponíveis, realizar empréstimos e registrar informações básicas do cliente, tudo em **memória**, sem persistência em banco de dados.

## 🎯 Objetivo do Projeto

Aplicar e consolidar conhecimentos de:

* Programação Orientada a Objetos (POO)
* Classes, objetos e encapsulamento
* Listas (`ArrayList`)
* Métodos e responsabilidades
* Controle de fluxo (`if/else`)
* Entrada de dados via console (`Scanner`)
* Manipulação de datas com `LocalDate`

Este projeto foi desenvolvido como **exercício prático após a conclusão da parte teórica de Java**.

## 🛠️ Funcionalidades

* 📖 Listar livros disponíveis
* 🔍 Buscar livro pelo ID
* 🤝 Realizar empréstimo de um livro
* ❌ Impedir empréstimo de livros indisponíveis
* 👤 Registrar o nome do cliente no empréstimo
* 📅 Registrar data do empréstimo
* 🧠 Validações básicas de entrada (ID e nome)

## 🧱 Estrutura do Projeto

```text
src/
 └── biblioteca/
     ├── model/
     │   ├── Autor.java
     │   ├── Livro.java
     │   └── Emprestimo.java
     │
     ├── service/
     │   └── Biblioteca.java
     │
     └── Main.java
```

## 🧩 Classes Principais

### 📘 Autor

Representa o autor de um livro.

**Atributos:**

* `id`
* `nome`
* `dataNascimento`

### 📗 Livro

Representa um livro da biblioteca.

**Atributos:**

* `id`
* `titulo`
* `autor`
* `disponivel`
* `dataCadastro`
* `dataAtualizacao`

### 📕 Emprestimo

Representa o empréstimo de um livro.

**Atributos:**

* `id`
* `livro`
* `nomeCliente`
* `dataEmprestimo`
* `dataDevolucao`

### 🏛️ Biblioteca

Classe responsável pela regra de negócio do sistema.

**Responsabilidades:**

* Gerenciar livros, autores e empréstimos
* Listar livros disponíveis
* Buscar livro por ID
* Realizar empréstimos

## ▶️ Como Executar

1. Clone ou baixe o projeto
2. Abra em uma IDE Java (IntelliJ, Eclipse, VS Code)
3. Execute a classe `Main`
4. Interaja pelo console conforme as instruções

## ⚠️ Observações Importantes

* O sistema **não possui persistência**
* Todos os dados são mantidos **apenas durante a execução**
* Ao encerrar o programa, os dados são resetados

## 🚀 Possíveis Evoluções Futuras

* Menu interativo com múltiplas opções
* Cadastro dinâmico de livros e autores
* Classe `Cliente` com histórico de empréstimos
* Devolução de livros
* Persistência em arquivo ou banco de dados
* Busca por título ou autor

## 👨‍💻 Autor

João Victor | Estudante de Engenharia de Software

📌 **Projeto finalizado com sucesso (versão inicial)**
