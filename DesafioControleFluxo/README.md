# DIO - Trilha Java

## Desafio de Controle de Fluxo

Este desafio tem como objetivo exercitar o uso de estruturas de controle de fluxo em Java, utilizando condicional, laços de repetição, exceções e entrada de dados pelo terminal com a classe Scanner.

## Cenário do Desafio

Crie o projeto `DesafioControleFluxo`, que receberá dois números inteiros via terminal. Com esses dois números, o sistema realizará uma contagem incremental conforme as regras abaixo:

1. Se o primeiro número for menor que o segundo:
   - O sistema deverá calcular a diferença entre os dois.
   - E executar um laço `for` para imprimir essa quantidade de vezes a mensagem:
     ```
     Imprimindo o número X
     ```

2. Se o primeiro número for maior que o segundo:
   - O sistema deverá lançar uma exceção personalizada chamada `ParametrosInvalidosException`.
   - E imprimir a seguinte mensagem:
     ```
     O segundo parâmetro deve ser maior que o primeiro
     ```

## Estrutura do Projeto

O projeto deve conter duas classes:

| Classe                          | Função                                                           |
|---------------------------------|------------------------------------------------------------------|
| `Contador.java`                 | Lógica principal, entrada de dados e controle de fluxo          |
| `ParametrosInvalidosException.java` | Exceção customizada que será lançada em caso de erro de lógica |

## Entrada de Dados

Os dados devem ser inseridos via terminal da seguinte forma:

Programa:
```
Digite o primeiro parâmetro:
```
Usuário:
```
12
```
Programa:
```
Digite o segundo parâmetro:
```
Usuário:
```
30
```

## Saída Esperada

Se os parâmetros forem válidos:
```
Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 18
```

Se forem inválidos:
```
O segundo parâmetro deve ser maior que o primeiro
```

## Tecnologias Utilizadas

- Java 17 ou superior
- Classe Scanner para entrada de dados
- IDE de sua preferência (IntelliJ, Eclipse, VS Code, etc.)
- Terminal/Console

## O que será praticado

- Uso da classe Scanner
- Estruturas de decisão (`if`)
- Laços de repetição (`for`)
- Criação e uso de exceções personalizadas
- Organização de projeto em Java
