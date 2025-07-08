# Agenda de Contatos

Uma aplicação de terminal simples para armazenar, listar, buscar e remover contatos com nome, telefone e email.

---

## Funcionalidades

- Adicionar novo contato
- Listar todos os contatos cadastrados
- Buscar contato por nome (sem diferenciar maiúsculas/minúsculas)
- Remover contato por nome
- Interface via terminal (CLI)

---

## Estrutura do Projeto

O projeto é composto por três classes principais:

| Classe    | Função                                                        |
|-----------|---------------------------------------------------------------|
| `Contato` | Representa os dados de um contato (nome, telefone e email)    |
| `Agenda`  | Gerencia a lista de contatos (adicionar, listar, buscar, remover) |
| `Main`    | Interface com o usuário pelo terminal                         |

---

## Entrada de Dados

A entrada é feita via terminal com auxílio da classe `Scanner`.

O usuário verá instruções como:

```
--- Menu Agenda ---
1. Adicionar contato
2. Listar contatos
3. Buscar contato por nome
4. Remover contato por nome
0. Sair
Escolha uma opção:
```

Exemplo de entrada para adicionar contato:

```
Nome: João
Telefone: (11) 99999-9999
Email: joao@email.com
```

---

## Saída Esperada

**Ao adicionar:**

```
Contato adicionado.
```

**Ao listar contatos:**

```
Nome: João, Telefone: (11) 99999-9999, Email: joao@email.com
```

**Ao buscar um nome:**

```
Nome: João, Telefone: (11) 99999-9999, Email: joao@email.com
```

**Ao tentar buscar/remover um nome inexistente:**

```
Contato não encontrado.
```

---

## Execução

Para compilar e executar o projeto via terminal:

```bash
javac Main.java Contato.java Agenda.java
java Main
```

---

## Dicas de Estudo

- Reforce conceitos de listas com `ArrayList`
- Pratique sobrescrita de métodos (`toString`, `equals`)
- Revise o uso de `Scanner` para entrada de dados
- Explore manipulação de strings com `equalsIgnoreCase`
- Analise a estrutura de menus com `switch` e `while`

---
