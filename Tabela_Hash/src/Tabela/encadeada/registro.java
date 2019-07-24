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
public class registro {
    

                           String chave_CPF;
	String nome;
	registro prox;
	
	
	public registro(String nome, String cpf){
		prox = null;
		this.chave_CPF = cpf;
		this.nome = nome;
	}
	public registro(){
		prox = null;
	}
	public String info() {
		return "Nome "+nome+" Cpf: "+this.chave_CPF;
	}
}

