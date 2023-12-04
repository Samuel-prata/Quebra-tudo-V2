# Quebra-tudo Desafio de Código VNW - Grupo 6
Small Java project to challange another group

### Basic notes
- Prazo para apresentar o projeto: até quarta-feita (29/11);
- Serão necessárias duas versões do programa: uma rodando sem erros, e a versão "quebrada".

### Regras de Negócio
- O projeto é sobre uma aplicação de faturamento, cuja terá as entidades abaixo:

#### Cliente
- Ao criar um novo cliente, os dados obrigatórios, como nome cpf e contato, devem ser fornecidos.
- A classe Cliente pode conter uma lista de pedidos anteriores para criar um histórico de compras.

#### Produto
- Um produto deve ser cadastrado no sistema antes de ser incluido em um pedido;
- As informações do produto incluem nome, preço, Fornecedor, Estoque.

#### Pedido
- Cada instância de Pedido deve estar associada a um cliente específico.
- A classe Pedido pode conter uma lista de itens (produtos e quantidades).
- Calcular o total do pedido com base nos itens e preços.
- Ao realizar um pedido, atualizar o estoque dos produtos associados.

#### Fornecedor
- As informações do fornecedor incluem nome, endereço, contato;
- Um produto pode ter um relacionamento com um fornecedor específico.

#### Estoque
- O estoque do produto deve ser atualizado após a conclusão da venda;
- Se o produto estiver fora de estoque, o sistema deve notificar a equipe.

#### Pagamento do Pedido
- Um cliente pode pagar a pedido utilizando métodos de pagamento aceitos (cartão de crédito,
  boleto,etc).

#### Relacionamento entre Cliente, Produto e Fornecedor;
- Pode existir um histórico de compras para cada cliente, mostrando quais produtos foram comprados;
- Um produto pode ter um relacionamento com um fornecedor, facilitando a reordenação de estoque.
  

### Entidades
- Cliente;
- Produto;
- Fornecedor;
- Pagamento;
- Pedido;
- Estoque.


### Diagrama de Classes

<image src="" height="530"> 


### Componentes do grupo e divisão de tarefas
- Roberto: entidades Cliente e ItemPedido, e Regras de Negócio;
- Angélica: entidade Estoque e diagrama de Classes;
- Bárbara: entidade Fornecedor;
- Geize: entidade Produto;
- Filipe: entidade Pagamento;
- Pedro: entidade Pedido.
