/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pergunta04;

/**
 *
 * @author marib
 */
public class Node <T extends Comparable<T>> implements Comparable<T> {

    T valor;
    Node<T> esq;
    Node<T> dir;
    Node<T> pai;
    
            Node(T valor){
                 this.valor = valor;
                 esq = null;
                 dir = null;
                 pai = null;
            }
     
            Node(T valor , Node<T> pai){
                this.valor = valor;
                this.pai = pai;
                dir = null;
                esq = null;
            }
    
    @Override
    public int compareTo(T o) {
        return valor.compareTo(o);
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Node<T> getEsq() {
        return esq;
    }

    public void setEsq(Node<T> esq) {
        this.esq = esq;
    }

    public Node<T> getDir() {
        return dir;
    }

    public void setDir(Node<T> dir) {
        this.dir = dir;
    }

    public Node<T> getPai() {
        return pai;
    }

    public void setPai(Node<T> pai) {
        this.pai = pai;
    }
  }

