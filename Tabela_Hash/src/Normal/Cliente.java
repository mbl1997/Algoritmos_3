/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Normal;

/**
 *
 * @author marib
 */
public class Cliente {
    
                   String nome;
	String cpf;
	
	public Cliente(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	public String info() {
		return "Nome - "+this.nome+" Cpf - "+this.cpf;
	}
}

