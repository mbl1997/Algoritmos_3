/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabela.encadeada;

/**
 *
 * @author marib
 */

    
public class tableHash {
    registro head = null;
    
    public tableHash(){
		
	}
	
	public void inserir(registro r){
		
		if(head == null){
			head = r;
		}else{
			registro aux = head;
			
			while(aux.prox != null){
				aux = aux.prox;
			}
			aux.prox = r;
		}
		
	}

	public void imprimir() {
		
		registro aux = head;
		
		while(aux.prox != null){
			System.out.println(aux.info());
			aux = aux.prox;
		}
		System.out.println(aux.info());
	}

	public String buscar(String id) {
		if(this.head == null){
			throw new RuntimeException("ERRO!!!!");
		}
		registro aux = this.head;
		while(aux.prox != null){
			if(aux.chave_CPF.equals(id)){
				return aux.info();
			}
			aux = aux.prox;
		}
		return null;
	}
	
}

