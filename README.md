# Árvore AVL: cadastro de clientes (Java)

Implementação de uma **árvore AVL** (árvore binária de busca autobalanceada) em Java, usada para cadastrar clientes e buscá-los pelo CPF. O programa mostra quantas comparações a busca precisou, o que evidencia o custo O(log n) da árvore balanceada.

## O que está implementado

- Inserção com rebalanceamento pelas quatro rotações (simples e dupla, à esquerda e à direita)
- Busca por CPF que retorna o número de comparações
- Percurso em ordem (in-order), que lista os clientes ordenados pela chave (CPF)
- Classe `Cliente` com nome, data de nascimento, telefone, e-mail, endereço e CPF

## Como rodar

Pré-requisitos: JDK 8+ e Maven.

```bash
cd "AVL cadastro de clientes/Clients"
mvn compile exec:java -Dexec.mainClass=AVL_tree.Clients.App
```

Ou abra a pasta `Clients` como projeto Maven no Eclipse ou no IntelliJ e rode `App.java`.

## Estrutura

```
AVL cadastro de clientes/Clients/src/main/java/AVL_tree/Clients/
  AVLTree.java   árvore, rotações, busca e percurso
  Cliente.java   modelo do cliente
  App.java       exemplo de uso
```
