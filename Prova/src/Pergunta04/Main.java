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
public class Main {
      public static void main(String[]args){
           Arvore<Integer> a = new Arvore<>();
		
		
		a.inserir(6);
		a.inserir(7);
		a.inserir(3);
		a.inserir(8);
		a.inserir(2);
		a.inserir(9);
                                    a.inserir(1);
                                    a.inserir(4);
           
		
		
		BuscaEmLargura<Integer> busca = new BuscaEmLargura();
		busca.executar(a, 7);
	}

}
