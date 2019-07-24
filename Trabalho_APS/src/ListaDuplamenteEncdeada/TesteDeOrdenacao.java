/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDuplamenteEncdeada;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author marib
 */
public class TesteDeOrdenacao {
    
public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		Collections.addAll(lista, 3, 7, 9, 1, 6, 5, 0);
		SelectionSort.selectionSort(lista);
		System.out.println("----------------------------Selection Sort --------------------");
		System.out.println(lista);
		System.out.println("*************************************************************");
		
		List<Integer> lista2 = new LinkedList<Integer>();
		Collections.addAll(lista2, 0, 10, 11, 4, 8);
		BubbleSort.ordenacaoBubbleSort(lista2);
		System.out.println("------------------- Bubble Sort----------------------");
		System.out.println(lista2);
		System.out.println("********************************************************");

	}

}

