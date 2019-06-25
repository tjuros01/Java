package edunova;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		int[] niz = {1,2,3,4,5};
		
		//for petljom ispi�ite sve elemente niza
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		// nije svjestan indeksa
		// ide od po�etka do kraja
		// ne mo�e se mjenjati vrijednost indeksa
		for(int element : niz) {
			System.out.println(element);
		}
		
		//kasnije u�iti
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(22);
		lista.add(23);
		
		for(int e: lista) {
			System.out.println(e);
		}
		
		lista.forEach(
				(e)->{System.out.println(e);
				});
		
		
		
		
	}

}
