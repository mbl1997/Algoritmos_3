//Uma imagem pode ser representada por uma matriz de pixels, onde cada pixel representa uma cor. 
//Uma operacao comum ao criar uma nova imagem e o preenchimento de areas com uma unica cor.

//Escreva um metodo, recursivo, que preencha uma area conta­gua a partir de um ponto na imagem, 
//substituindo todos os pixels com a mesma cor do ponto original pela cor do ponto selecionado.

//O metodo deveria ter a seguinte assinatura:

//public void preencheArea(Cor[][] matriz, Ponto ponto, Cor novaCor)

//A classe Ponto tem a seguinte estrutura:

class Ponto {
    public final int x;
    public final int y;
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
