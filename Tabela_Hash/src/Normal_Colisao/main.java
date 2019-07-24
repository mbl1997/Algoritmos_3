/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Normal_Colisao;



/**
 *
 * @author marib
 */
public class main {
    
	public static void main(String[] args) {
		Hash tabela = new Hash();
		Cliente c = new Cliente("Silvana","12345678");
		Cliente c1 = new Cliente("Arthur","87654321");
		Cliente c2 = new Cliente("Sophia","09876523");
		
		tabela.adicionar(c);
		tabela.adicionar(c1);
		tabela.adicionar(c2);

		Cliente result = tabela.pesquisar(c2.cpf);
		
		System.out.println(result.info());
		
		
		
		
	}
}

