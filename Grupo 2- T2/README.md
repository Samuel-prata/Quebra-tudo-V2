# Validador de CPF - Desafio Rápido (Vai na Web)

Este projeto consiste em uma classe *CPF* que permite validar e manipular números de CPF no formato brasileiro. Ele foi desenvolvido como parte de um desafio rápido do curso de **backend Java** oferecido pelo **Vai na Web**.

## Funcionalidades

- Validação da estrutura do CPF fornecido.
- Verificação da validade do CPF com base nos dígitos verificadores.
- Aceitação de formatos variados de entrada.

## Como Usar
Para utilizar a classe CPF, siga estas etapas:

- Instancie um objeto CPF fornecendo um número de CPF como argumento para o construtor.
- Utilize o método isValid() para verificar se o CPF é válido.
- Caso seja necessário, utilize o método toString() para obter o CPF formatado.

## Exemplo de Uso

```java
public static void main(String[] args) {
    String cpfNumber = "123.456.789-00"; // Substitua pelo CPF desejado
    CPF cpf = new CPF(cpfNumber);

    if (cpf.isValid()) {
        System.out.println("CPF válido!");
    } else {
        System.out.println("CPF inválido!");
    }

    System.out.println("CPF formatado: " + cpf.toString());
}
```

## Notas

Este projeto foi desenvolvido como um exercício de aprendizagem e não é recomendado para uso em ambientes de produção sem uma revisão completa e testes adicionais.