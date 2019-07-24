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
public class SelectionSort {
    
public static void selectionSort(List<Integer> vetor) {
		System.out.println("---------------------Selection Sort --------------------------");
		for (int i = 0; i < vetor.size(); i++) {
			int posicaoMenor = i;
			for (int j = (i + 1); j < vetor.size(); j++) {
				if (vetor.get(j) < vetor.get(posicaoMenor)) {
					posicaoMenor = j;
				}
				System.out.println(vetor);
			}
			if (vetor.get(i) != vetor.get(posicaoMenor)) {
				int temp = vetor.get(i);
				vetor.set(i, vetor.get(posicaoMenor));
				vetor.set(posicaoMenor, temp);
			}
		}
		System.out.println("***********************************");
		System.out.println(" Foi ordenado pelo Selection Sort");
	}

}

