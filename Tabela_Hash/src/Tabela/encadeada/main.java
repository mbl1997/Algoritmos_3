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
public class main {
    

     public static void main(String[] args) {
		tableHash  tabela = new tableHash();
		tabela.inserir(new registro("Everson ","096.757.495-97"));
		tabela.inserir(new registro("Mariana","509.319.947-98"));
		tabela.inserir(new registro("Patricia","968.868.777-15"));
	//	tabela.imprimir();
		
		String result = tabela.buscar("096.757.495-97");
		System.out.println(result);
	}
	
	
}

