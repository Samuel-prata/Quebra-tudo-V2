![Banner](https://i.postimg.cc/GpJ0wKcs/banner-vnw-dinamica-quebra-tudo.png)

Dinâmica em grupo para fixação de conteúdo, proposta pelo [Vai na Web](https://www.linkedin.com/company/vainaweb/): Os alunos foram divididos em grupos para criar programas em Java. Os códigos foram posteriormente "quebrados", e o desafio consistiu em praticar a revisão de código, aplicando os conhecimentos adquiridos em sala de aula.

## 📚 Sobre o Sistema Bancário

Programa simples de um sistema bancário. O programa solicita os dados do banco, em seguida é apresetado um menu de opções que permite a criação, listagem, seleção e remoção de agências do banco.

### 🌐 Classes

1. **Agencia:** Representa uma agência bancária com nome e número, e métodos para obter esses atributos.
2. **Banco:** Representa um banco com nome, endereço e uma lista de agências. Permite a criação, listagem, seleção e remoção de agências.
3. **Application:** Ponto de entrada do programa, interage com o usuário usando Scanner. Possibilita adicionar, listar, selecionar e remover agências em um loop interativo.

### ⚙️ Funcionalidades

- **Adicionar agência:** Solicita nome e número da agência, adicionando ela à lista do Banco.
- **Listar agência:** Exibe uma lista das agências existentes no Banco.
- **Selecionar agência:** Solicita o número da agência desejada e exibe detalhes se encontrada.
- **Remover agência:** Solicita o número da agência a ser removida e a remove, se existir. (não implementado)
- **Sair do programa:** Encerra a execução do programa.

#### ⚙️ Implementação para Equipe Adversária

- [ ] Implementar validação no método `criarAgencia()`, caso já exita uma agênciacom o número infomado, deve retornar um erro com mensagem condizente ao erro.
- [ ] Implementar funcionalidade para remoção de agência.

### 🏞️ Imagens do programa

<details>
  <summary><b>Cadastro do banco</b></summary>
  
  ![cadastro](https://i.postimg.cc/fT8Q8FqK/image.png)
</details>

<details>
  <summary><b>Menu</b></summary>
  
  ![menu](https://i.postimg.cc/4ywqF7Pd/image.png)
</details>

<details>
  <summary><b>Adicionar agência</b></summary>
  
  ![adicionar](https://i.postimg.cc/pVGtZ46B/image.png)
</details>

<details>
  <summary><b>Listar agências</b></summary>
  
  ![listar](https://i.postimg.cc/zGPj2S16/image.png)
</details>

<details>
  <summary><b>Selecionar agência</b></summary>
  
  ![selecionar](https://i.postimg.cc/W4V2KKcf/image.png)
</details>

<details>
  <summary><b>Remover agência</b></summary>

  ![remover](https://i.postimg.cc/5NG5w5Wt/image.png)  
</details>

## 🛣️ Como Rodar o Projeto

Siga as instruções para rodar o projeto no seu ambiente de desenvolvimento.

### 🚀 Pré-requisitos

- Você vai precisar do [Git](https://git-scm.com/) e Java ([JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)) instalados no seu computador.
- Além disso, é bom ter um editor como o [Eclipse](https://eclipseide.org/) para trabalhar com o código.

### 🎲 Rodando

```bash
# Clone o projeto em uma pasta da sua preferência
$ git clone https://github.com/usuario/nome-repositorio.git
```

Caso esteja usando o Eclipse como editor de código:

1. Abra o Eclipse.
2. Importe o projeto Java para o Eclipse.
   - Clique em File > Import > General > Existing Projects into Workspace.
   - Selecione a pasta do projeto `atividade-quebra-tudo` (talvez o nome mude após a troca de repositórios) e clique em Finish.
3. Clique com o botão direito do mouse no projeto e selecione Run as > Java Application.
4. O Eclipse irá compilar e executar o programa.

As etapas para executar o projeto em outro editor são semelhantes. Em geral, você vai precisar importar o projeto para editor, compilar e em seguida executar o código.

## 🗂️ Estrutura do Projeto

```markdown
atividade-quebra-tudo/
├── .settings/
├── src/br/com/vainaweb/backendt1/
│   ├── funcionando/
│   │   ├── Agencia.java
│   │   ├── Application.java
│   │   └── Banco.java
│   └── quebrado/
│       ├── Agencia.java
│       ├── Application.java
│       └── Banco.java
├── .classpath
├── .gitignore
├── .project
└── README.md
```

## 🛠️ Tecnologias

- [Java JDK v17.0.9](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

</br>

## 👨‍💻 Integrantes

<table>
  <tr>
    <td align="center"><a href="https://www.linkedin.com/in/alinemelofrontend/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/109696840?v=4" width="100px;" alt=""/><br /><sub><b>Aline Melo</b></sub></a><br /><a href="https://github.com/alinemello29" title="Aline Melo">👨‍💻</a></td>
    <td align="center"><a href="https://www.linkedin.com/in/hamomgs/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/88857655?v=4" width="100px;" alt=""/><br /><sub><b>Hamom Silva</b></sub></a><br /><a href="https://github.com/hamomgs" title="Hamom Silva">👨‍💻</a></td>
    <td align="center"><a href="https://www.linkedin.com/in/joaquimbsneto/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/108842217?v=4" width="100px;" alt=""/><br /><sub><b>Joaquim Neto</b></sub></a><br /><a href="https://github.com/joaquimnetodev" title="Joaquim Neto">👨‍💻</a></td>
    <td align="center"><a href="https://www.linkedin.com/in/luis-viana-3b9194120/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/26436332?v=4" width="100px;" alt=""/><br /><sub><b>Luis Fernando</b></sub></a><br /><a href="https://github.com/lbarrosviana" title="Luis Fernando">👨‍💻</a></td>
    <td align="center"><a href="https://www.linkedin.com/in/mikaela-tito-8a00501b8/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/144917085?v=4" width="100px;" alt=""/><br /><sub><b>Mikaela Tito</b></sub></a><br /><a href="https://github.com/mikatito99" title="Mikaela Tito">👨‍💻</a></td>
</tr>
</table>

## 🧑‍🏫 Instrutores

<table>
  <tr>
    <td align="center"><a href="https://www.linkedin.com/in/samuel-silveriom/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/103957897?v=4" width="100px;" alt=""/><br /><sub><b>Samuel Silvério</b></sub></a><br /><a href="https://github.com/Samuel-prata" title="Samuel Silvério">🧑‍🏫</a></td> 
    <td align="center"><a href="https://www.linkedin.com/in/leno-rafael-85a2ab1ba/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/73203800?v=4" width="100px;" alt=""/><br /><sub><b>Leno Rafael</b></sub></a><br /><a href="https://github.com/lenors" title="Leno Rafael">🧑‍🏫</a></td>
</tr>
</table>
