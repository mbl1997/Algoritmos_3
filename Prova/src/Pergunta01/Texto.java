
 //Justifique por que diversos ambientes de programacao disponibilizam algoritmos baseados no Merge Sort como algoritmo de ordenacao de elementos por comparacao, 
//e qual as vantagens e desvantagens desses algoritmos sobre o Quicksort.

//RESPOSTA:

// Porque a sua base  de dividir(o problema em varios sub-problemas e resolver traves de varias recuperacoes repetidas) e conquistar
//(apos todos os sub-problemas terem sido resolvidos ocorre a cconquista que a uniao das resolucoes dos sub-problemas). 
//Como o algoritmos Merge Sort usa a recursividade,ha um alto consumo de memoria e tempo de execucao tornando esta tecnica nao muito eficiente em alguns problemas.

//A desvantagem de usar esse algoritmos sao:
//  - A utilizacao de funcoes recursivas;
//Gasto de memoria. O algoritmos cria uma copia de vetor para cada nivel de chamada recursiva, totalizando um uso adicional de memoria igual.

//Principal diferenca entre as duas sao:
//QuickSort utiliza o conceito de elemento pivada para dividir o problema em subproblemas;
//MergeSort sempre divide o problema de forma balanceada (gerando subproblemas de mesmo tamanho).


//Vantagens do Quicksort :
// -  extremamente eficiente para ordenar arquivos de dados;
//- Necessita de apenas uma pequena pilha como memÃ³ria auxiliar. Requer cerca de n log n comparacoes em media para ordenar n itens.

//Desvantagens:
//- Tem um pior caso O(n2) comparacoes;
// - Sua implementacao e muito delicada e dificil: Um pequeno engano pode levar a efeitos inesperados para algumas entradas de dados. O motodo nao e estavel.
