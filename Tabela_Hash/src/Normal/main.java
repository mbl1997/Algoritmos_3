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
public class main {
    

     public static void main(String[] args) {
		Table tabela = new Table();
		Cliente c = new Cliente("Mariana","509.319.947-98");
		tabela.adicionar(c);
		//System.out.println(tabela.getPos(c));
		
//		try{
//			tabela.adicionar(c);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
		
		Cliente c1 =  tabela.pesquisar("98");
		System.out.println(c1.info());
	}
}

