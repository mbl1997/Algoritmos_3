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
class Table {
    

     Cliente[] clientes;
	
	public Table(){
		clientes = new Cliente[100];
	}
	
	public int hash(String chave){
		int tam = chave.length();
		char penultimo = chave.charAt(tam -2);
		char ultimo = chave.charAt(tam -1);
		String retorno =""+penultimo + ultimo; 
		return Integer.parseInt((retorno));
	}
	
	public void adicionar(Cliente c){
		if(clientes [this.hash(c.cpf)] != null){
			throw new RuntimeException("PosiÃ§Ã£o jÃ¡ ocupada!!");
		}
		clientes [this.hash(c.cpf)] = c;
	}
	
	public int getPos(Cliente c){
		return this.hash(c.cpf);
	}
	
	public Cliente pesquisar(String chave){
		return this.clientes[this.hash(chave)];
	}
	
	public void remover(String chave){
		clientes[this.hash(chave)] = null;
	}
}

