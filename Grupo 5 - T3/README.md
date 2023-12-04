
# Lista de tarefas

Essecialmente, esse projeto realiza as operações CRUD em memória, cujo a entidade que essas operações são realizadas é a entidade Tarefa. A ideia é algo similar a um "to-do list".




## Funcionalidades

- O método adicionar vai receber um objeto do tipo Tarefa. Atente-se ao formatação da data que é no formato yyyy-MM-dd (ano-mês-dia)
- O método listar vai percorrer exibir cada objeto da lista. Há um mensagem específica quando a lista for vazia.
- O método remover vai exibir a lista de tarefas e irá pedir o identificador associado a tarefa que o usuário deseja excluir.
- O método tarefaOk funciona da mesma forma que o método remover, mas aqui, o estado da tarefa do id inserido irá sai de pendente para concluído.
- O método listarTarefasConcluidas vai percorrer a lista como o método listar, mas sempre verificando se o objeto possui o valor booleano do atributo concluida como true e caso verdadeiro, é exibido o objeto.
- O método listarTarefasPendentes faz a mesma coisa que o método listarTarefasConcluidas, no entanto, aqui o valor de concluida deve ser negativo e caso seja, o objeto é exibido.
- O método apertaEnterParaContinuar exige com que a tecla Enter seja pressionada prosseguir.


