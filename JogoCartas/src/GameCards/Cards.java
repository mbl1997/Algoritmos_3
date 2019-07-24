/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameCards;

/**
 *
 * @author marib
 */
public class Cards {
    
      public static void main(String[] args) {
        // Criacao dos dois Arrays
        String [] nipes = {"Ouros","Espadas","Copas","Paus"};
      String [] faces = {"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
      
// As linhas abaixo recuperam da forma aleatoria o conteudo dos arrays
 // Criacao de duas variaveis que se atribuem no sorteio
   
      String nipe = nipes[(int)(Math.random()*4)];  //De quatro numeros contra do 0.
     String face = faces [(int)(Math.random()*faces.length)];

       // O tamanho total do array - 13 cartas.
       // A linha abaixo exibe a carta sorteada
       
       System.out.println(face + " de " + nipe);
  //Exibicao da variavel concatenando com o texto e com o conteudo da outra variavel.  
    }
}
