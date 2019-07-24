/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pergunta04;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author marib
 */
public class BuscaEmLargura <T extends Comparable<T>>  {
    
private ArrayList<Node> fila = new ArrayList<Node>();

	public void executar(Arvore<T> arvore, T valor) {
		Node<T> noRaiz = arvore.getRaiz(); //pega valor da raiz
		Node<T> noRaizEsquerda = noRaiz.getEsq();
		Node<T> noRaizDireita = noRaiz.getDir();
		fila.add(noRaizEsquerda);
		fila.add(noRaizDireita);
				
		for (int i = 0; i <= arvore.listaArvore().size(); i++) {
			Node noAtual = fila.get(i);
			//se o nÃƒÂ³ atual for o valor procurado **VISITA**
			//fila.remove(i);
			if(noAtual.getValor() == valor){				
				//retornar caminho para raÃƒÂ­z
				System.out.println("Valor encontrado. O pai dele e: " + noAtual.getPai().getValor());
				Stack pilha = new Stack<>();
				String caminho = "";
				i = 0;
				while(noAtual.getPai() != null){
					pilha.push(noAtual.getValor());
					noAtual = noAtual.getPai();
					i++;//iterador para desempilhar
				}
				System.out.println(caminho);
				for (int j = i; j > 0 ; j--) {
					System.out.println(pilha.pop());
				}
				break;
			}
			if(noAtual.getEsq() != null){
				fila.add(noAtual.getEsq());
			}
			if(noAtual.getDir() != null){
				fila.add(noAtual.getDir());
			}
		}
	}
	
}

