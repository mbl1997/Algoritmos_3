/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDuplamenteEncdeada;
import java.util.List;      
/**
 *
 * @author marib
 */
public class BubbleSort {
    
public static void ordenacaoBubbleSort(List<Integer> lista){
        System.out.println(" ----------------------- Bubble Sort------------------------");
        for(int i = 0; i< lista.size(); i++){
            for (int j=0; j< (lista.size()-1-i);j++){
                if(lista.get(j) > lista.get(j+1)){
                    Integer aux = lista.get(j);
                    lista.set(j, lista.get(j +1));
                    lista.set(j+1, aux);
                }
                System.out.println(lista);
            }
        }
        System.out.println(lista);
    }
}

