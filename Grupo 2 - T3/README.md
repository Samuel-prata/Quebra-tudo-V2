<h1 align="center">Biblioteca Vai na Web</h1>

## Aventure-se pelo mundo da literatura em nossa biblioteca:

### Tabela de conteúdos

- [Inventory](#invetory---descrição)
- [Book](#book---descrição)
- [Bibliothecary](#bibliothecary---descrição)
- [BookCard](#bookcard---descrição)
- [Library](#library---descrição)
- [Principal](#classe-principal---descrição)

## Invetory - Descrição

A classe Inventory é a classe responsável pelo gerenciamento de livros e fichas, fornecendo, por exemplo, as funções referentes a busca dos livros por nome, gênero, autor, código, ano e número de páginas.

### Requisitos

- JDK (Java Development Kit) instalado
- Uma lista de livros (List<Book>) para realizar a busca

## Como usar:

1. Instanciar a classe

```java
Inventory inventario = new Inventory();
```

2. Chamar a função buscaGenero()

```java
List<Book> livrosFiltrados = books.buscaGenero("terror");
```

- A função solicitará ao usuário que digite o gênero desejado.

## Book - Descrição

Classe que representa um livro, contendo as respectivas características e comportamentos necessários para o sistema.

## Como usar:

1. Instanciar a classe

```java
Book book = new Book("Oliver Twist", "Drama","Charles Dickens", 352, 1838);
```

## Bibliothecary - Descrição

Classe que representa um bibliotecário da biblioteca, contendo as respectivas características e comportamentos necessários para o sistema.

## Como usar:

1. Instanciar a classe

```java
Bibliothecary bibliotecario = new Bibliothecary("Alan Turing");
```

## BookCard - Descrição

Classe que representa uma ficha do usuário da biblioteca e devolução dos livros.

## Como usar:

1. Instanciar a classe

```java
BookCard bc = new BookCard(bookCode, bibliothecaryCode, clientName);
```

## Library - Descrição

Classe responsável pelo gerenciamento do estoque de livros e dos bibliotecários.

## Como usar:

1. Instanciar a classe

```java
Library library = new Library();
```

## Classe Principal - Descrição

É a classe onde se encontra o método main, responsável por rodar o programa.
Nela é possível criar todos os objetos e chamar todos os métodos. Gera a interface necessária para a interação do usuário.
