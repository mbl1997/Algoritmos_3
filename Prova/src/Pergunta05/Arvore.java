/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pergunta05;

/**
 *
 * @author marib
 */
public class Arvore {
    
private Node root;

    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }
    
    public int getAltura(){
        return getAltura(this.root);
    }
    
    private int getAltura(Node root){
        if(root == null){
            return 0;
        }
        int altEsq = getAltura(root.getLeft());
        int altDir = getAltura(root.getRight());
        if(altEsq > altDir){
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }
    
    public int getQtdNode(){
        return getQtdNode(root);
    }
    
    private int getQtdNode(Node root){
        if(root == null){
            return 0;
        }
        int qtdNodeEsq = getQtdNode(root.getLeft());
        int qtdNodeDireita = getQtdNode(root.getRight());
        return qtdNodeEsq + qtdNodeDireita + 1;
    }
    
    public void imprimirArvore(){
        if(this.root == null)
            System.out.println("Ãrvore vazia");
        else
            imprimirArvore(this.root);
    }
    
    private void imprimirArvore(Node node){
        if(node.getLeft() != null){
            imprimirArvore(node.getLeft());
        }
        if (node.getRight() != null){
            imprimirArvore(node.getRight());
        }
        System.out.println("NÃ³: " + node.getValor());
    }
    
    public void inserir(int valor){
        inserir(this.root, valor);
    }
    
    public void inserir(Node node, int valor) {
        if(this.root == null){
            this.root = new Node(valor);
        } else {
            if (valor < node.getValor()) {
                if (node.getLeft() != null) { 
                    inserir(node.getLeft(), valor); 
                } else { 
                    //Se nodo esquerdo vazio insere o novo no aqui 
                    node.setLeft(new Node(valor)); 
                } 
                //Verifica se o valor a ser inserido Ã© maior que o no corrente da Ã¡rvore, se sim vai para subarvore direita 
            } else if (valor > node.getValor()) { 
                //Se tiver elemento no no direito continua a busca 
                if (node.getRight() != null) { 
                    inserir(node.getRight(), valor); 
                } else {
                    //Se nodo direito vazio insere o novo no aqui 
                    node.setright(new Node(valor)); 
                } 
            }
        }
    }
    
    public Node remover(int valor) throws Exception{
        return remover(this.root, valor);
    }
    
    private Node remover(Node node, int valor) throws Exception{
        if(this.root == null){
            throw new Exception("Ãrvore vazia");
        } else {            
            if(valor < node.getValor()){
                node.setLeft(remover(node.getLeft(), valor));
            } else if(valor > node.getValor()){
                node.setright(remover(node.getRight(), valor));
            } else if (node.getLeft() != null && node.getRight() != null) {
                /*2 filhos*/  
                System.out.println("  Removeu No " + node.getValor());
                node.setValor(encontraMinimo(node.getRight()).getValor());
                node.setright(removeMinimo(node.getRight()));
            } else {  
                System.out.println("  Removeu No " + node.getValor());  
                node = (node.getLeft() != null) ? node.getLeft() : node.getRight();  
            }  
            return node;
        }
    }
    
    private Node removeMinimo(Node node) {  
        if (node == null) {  
            System.out.println("  ERRO ");  
        } else if (node.getLeft() != null) {  
            node.setLeft(removeMinimo(node.getLeft()));  
            return node;  
        } else {  
            return node.getRight();  
        }  
        return null;  
    }  
  
    private Node encontraMinimo(Node node) {  
        if (node != null) {  
            while (node.getLeft() != null) {  
                node = node.getLeft();  
            }  
        }  
        return node;  
    }
}
