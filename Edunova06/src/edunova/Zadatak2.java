package edunova;

public class Zadatak2 {
	
	// Napi�i metodu koja prima cijeli pozitivni broj
	// vra�a nazada zbroj svih 
	// brojeva od 1 do primljenog broja
	
	public static void main(String[] args) {
		System.out.println(zbroj(5));
		int z = zbrojParnih(23);
		System.out.println(z);
	}

	
	private static int zbrojParnih(int x) {
		int suma=0;
		for(int i=0;i<x;i++) {
			if(i%2==0) {
				suma+=i;
			}
		}
		
		
		return suma;
	}


	private static int zbroj(int b) {
		int suma=0;
		
		for(int i=0;i<=b;i++) {
			suma+=i;
		}
		
		return suma;
	}
	
	
	// metoda prima broj 
	// vra�a sumu svih parnih brojeva do primljenog broja
	

}
