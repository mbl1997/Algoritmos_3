/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pergunta04;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marib
 */
public class Arvore <T extends Comparable<T>>   {
    
                private Node<T> raiz;


                        //cria arvore vazia
                        Arvore(){
                                this.raiz = null;
                        }

                        //cria arvore nova (add nao raiz)
                        Arvore(Node<T> raiz){
                                this.raiz = raiz;
                        }

                        public Node<T> getRaiz() {
                                return raiz;
                        }

                        public Node<T> inserir(T valor){
                                Node<T> no = new Node<>(valor);

                                if(raiz == null){
                                        raiz = no;
                                        return no;
                                }else{
                                        //arvore que estiver vazia deve inserir o nao no local correto
                                        return inserir(no, raiz);
                                }
                        }


                        //metodo para localizar a posiÃƒÂ§ÃƒÂ£o que deverÃƒÂ¡ inserir o nÃƒÂ³ --> recursividade
                        private Node<T> inserir(Node<T> no, Node<T> raizDaSubArvore) {
                                if(raizDaSubArvore.compareTo(no.getValor()) >= 0){
                                        //menor que raiz, entÃƒÂ£o insere a esquerda dela
                                        Node<T> esquerda = raizDaSubArvore.getEsq();
                                        if(esquerda == null){
                                                raizDaSubArvore.setEsq(no);
                                                no.setPai(raizDaSubArvore);
                                        }else{
                                                return inserir(no, esquerda);//verifica mais ÃƒÂ  esquerda
                                        }
                                }else{
                                        //maior que raiz, entÃƒÂ£o insere a direita dela
                                        Node<T> direita = raizDaSubArvore.getDir();
                                        if(direita == null ){
                                                raizDaSubArvore.setDir(no);
                                                no.setPai(raizDaSubArvore);
                                        }else{
                                                return inserir(no, direita);//verifica mais ÃƒÂ  direita
                                        }
                                }
                                return no; //nÃƒÂ³ inserido
                        }

                        private ArrayList<T> retornaLista(Node<T> no){
                                if(no == null){
                                        return new ArrayList<T>(); //lista vazia
                                }else{
                                        //
                                        ArrayList<T> lista = retornaLista(no.getEsq());
                                        lista.add(no.getValor());
                                        lista.addAll(retornaLista(no.getDir()));
                                        return lista;
                                }
                        }

                        //pesquisa com recursividade
                        public String toString() {
                                ArrayList<T> lista = retornaLista(raiz);
                                String saida = "";
                                for(T item : lista) saida += item + "-";
                                return saida;
                        }

                        public Node<T> pesquisar(T valor){
                                if(raiz == null){
                                        return null;
                                }else{
                                        return pesquisar(valor, raiz);
                                }
                        }

                        private Node<T> pesquisar(T valor, Node<T> raizSubArvore){
                                int compara = raizSubArvore.compareTo(valor);
                                if(compara == 0){
                                        //valor encontrado
                                        return raizSubArvore;
                                }else if(compara > 0){
                                        return pesquisar(valor, raizSubArvore.getEsq());
                                }else{
                                        return pesquisar(valor, raizSubArvore.getDir());
                                }
                        }

                        public ArrayList<T> listaArvore(){
                                return retornaLista(raiz);
                        }
                }
