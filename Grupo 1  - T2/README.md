# Banco Vai na Web - Sistema Simples de Banco

Este é um sistema simples de banco que permite criar contas para clientes, calcular gastos usando uma calculadora básica e realizar operações bancárias como saques e depósitos.

## Estrutura do Projeto

O projeto está dividido em pacotes para organizar as classes:

- **br.com.bancoVaiNaWeb** - Pacote raiz
  - **conta** - Classes relacionadas às contas bancárias
  - **cliente** - Classes que representam os clientes do banco
  - **operacoes** - Funcionalidades como criação de conta, operações bancárias e controle principal

### Principais Classes

- **Main.java** - Contém a classe principal do programa. Permite a interação com o usuário para calcular gastos, criar contas, realizar saques e depósitos, e visualizar dados da conta.
- **Conta.java** - Classe que define a estrutura de uma conta bancária, incluindo número, saldo e dados do cliente.
- **Cliente.java** - Representa o cliente com nome e CPF.
- **CriarConta.java** - Classe responsável pela criação de uma nova conta com dados inseridos pelo usuário.
- **Calculadora.java** - Oferece funcionalidades de uma calculadora simples: soma, subtração, multiplicação e divisão.
- **RealizarSaque.java** - Funcionalidade para realizar saques na conta bancária.
- **RealizarDeposito.java** - Funcionalidade para realizar depósitos na conta bancária.

## Como Executar

1. Certifique-se de ter o Java instalado no seu ambiente.
2. Clone ou baixe este repositório.
3. Compile os arquivos Java: `javac Main.java`
4. Execute o programa: `java Main`

## Funcionalidades

- **1: Calcular seus gastos** - Uma calculadora simples permite ao usuário realizar operações matemáticas básicas.
- **2: Criar uma conta** - Permite ao usuário inserir seus dados para criar uma conta bancária.
- **3: Realizar Saque** - Permite ao usuário realizar saques na conta bancária.
- **4: Realizar Depósito** - Permite ao usuário realizar depósitos na conta bancária.
- **5: Verificar dados da sua conta** - Mostra os dados da conta bancária criada.

## Features Futuras
- **1: Criar um menu para direcionar o usuário para um determinado tipo de conta, dentre as 3 opções**: Poupança, Corrente e Jurídica, com cada uma seguindo suas características do mundo real.
- **2: Correções Gramaticais**: Fazer as correções gramaticais de acordo com a formalidade do Banco da Vai na Web.
