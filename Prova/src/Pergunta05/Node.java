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
public class Node {
    
private int valor;
    private Node left;
    private Node right;

    public Node(int valor) {
        this.valor = valor;
    }
    
    public boolean isLeaf() {
        return left == null && right == null;
    }
    // funÃ§oes set
    public void setValor(Integer valor) {
    	this.valor = valor;
    	}
    public void setLeft( Node left){
    	this.left = left;
    }
    
    public void setright( Node right){
    	this.right = right;
    }
    
    // funÃ§oes get
    public int getValor() {
        return valor;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
	    
}
