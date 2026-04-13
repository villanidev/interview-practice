# Para problemas lineares - baseados no Leetcode
- Seguir essa ordem:
- 1-Arrays + Hashmap = Two Sum, Group Anagrams, Subarray Sum Equals K
- 2-Two pointers = Valid Palindrome, Two Sum 2, Remove Duplicates from Sorted Array
- - Direção oposta: ponteiro que começa no inicio e outro no fim
- - Mesma direção: pointeiro fast e slow, aonde um se move 2x mais rápido que o outro
### Colinha
| Ferramenta        | Quando Usar                                                 | Vantagens (Prós)               | Custo (Contras)                  |
|-------------------|-------------------------------------------------------------|--------------------------------|----------------------------------|
| HashMap / HashSet | Contar frequências, achar pares/complementos (ex: Two Sum). | Busca em tempo constante O(1). | Sacrifica memória O(n)           |
| Opostos           | Arrays ordenados, busca de somas, palíndromos ou áreas.     | Espaço constante O(1).         | Exige ordenação prévia.          |
| Fast & Slow       | Processar in-place, remover duplicatas, detectar ciclos.    | Sem criar cópias do array.     | Lógica de índices mais sensível. |
- Dica de Ouro: **"Sorted?"**
  Sempre que receber um problema de busca ou pares, pergunte-se: **"O array está ordenado?"**
  - Sim: Vá de Dois Ponteiros ou Busca Binária.
  - Não: Considere usar um HashMap ou ordenar você mesmo (O (n log n)) para facilitar o resto do trabalho.
- 3-Sliding window = Maximum Average Subarray I, Longest Substring Without Repeating Characters, Minimum Size Subarray Sum, Permutation in String
- - Fixo: o tamanho nao mude dentro do problema (e geralmente é informado)
- - Dinâmico: a janela expande ou contrai de acordo com as condições
- - Dica: Os dois ponteiros sempre andam na mesma direção e o foco é no intervalo entre eles (o conteúdo da janela).
- - A conta é sempre: Soma = Soma + Chegou - Saiu
### Colinha
| Característica | Janela Fixa                   | Janela Dinâmica                        |
|----------------|-------------------------------|----------------------------------------|
| Quando usar?   | O tamanho k é dado.           | O tamanho é o que você quer descobrir. |
| Condição       | Chegou no tamanho k? Desliza. | Regra quebrou? Encolhe a esquerda.     |
| Estrutura      | if (i >= k - 1)               | while (condição_inválida)              |
- 4-Binary search = Binary Search, Search in Rotated Sorted Array, Find First/Last Position
- 5-Stack + Queue = Valid Parentheses, Min Stack, Daily Temperatures
- 6-Linked list = Middle of the Linked List (two pointers), Reverse Linked List, Detect Cycle, Merge Two Sorted Lists