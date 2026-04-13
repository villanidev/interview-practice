# Escala de Eficiencia (Melhor para Pior)
| Complexidade    | Nome                   | Exemplo de Operacao                        |
|-----------------|------------------------|--------------------------------------------|
| O(1)            | Constante              | Acesso direto ao indice do array           |
| O(log n)        | Logaritmica            | Dividir para conquistar (Busca Binaria)    |
| O(n)            | Linear                 | Um unico loop (Leitura simples)            |
| O(n log n)      | Linear-Logaritmica     | Merge Sort ou Quick Sort                   |
| O(n^2)          | Quadratica             | Loops aninhados                            |
| O(2^n) ou O(n!) | Exponencial / Fatorial | Algoritmos de permutacao ou recursao bruta |
# Selecao baseada no tamanho do Input (n)
| Tamanho de n   | Complexidade Alvo | Limite Operacional           |
|----------------|-------------------|------------------------------|
| n <= 10-20     | O(2^n) ou O(n!)   | Recursao Bruta / Permutacoes |
| n <= 100       | O(n^3)            | Triplo Loop                  |
| n <= 1.000     | O(n^2)            | Loop Duplo                   |
| n <= 100.000   | O(n log n)        | Ordenacao (Quick/Merge)      |
| n <= 1.000.000 | O(n)              | Loop Unico                   |
| n > 1.000.000  | O(log n) ou O(1)  | Busca Binaria ou Matematica  |
# Tabela de Espaço (Auxiliary Space)
| Algoritmo  | Complexidade de Espaço | Por que?                                            |
|------------|------------------------|-----------------------------------------------------|
| Iterativo  | O(1)                   | Não cria novas estruturas ou pilhas de chamada.     |
| Recursivo  | O(n) ou O(log n)       | Ocupa a Call Stack (Pilha de Chamada).              |
| Merge Sort | O(n)                   | Precisa de arrays temporários para fundir os dados. |
# Selecao de Algoritmos
| Tecnica        | Aplicacao Principal       | Memoria (Extra) |
|----------------|---------------------------|-----------------|
| HashMap        | Frequencia e Complementos | O(n)            |
| Two Pointers   | Somas em Arrays Ordenados | O(1)            |
| Sliding Window | Subarrays Continuos       | O(1) ou O(n)    |
| Fast & Slow    | Ciclos e Meio de Listas   | O(1)            |
| Binary Search  | Busca em Espaco Ordenado  | O(1)            |