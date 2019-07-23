package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	// Napi�i metodu koja prima cijeli pozitivni broj
	// vra�a nazada zbroj svih 
	// brojeva od 1 do primljenog broja
	
	public static void main(String[] args) {
		
		while(true) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
		System.out.println(zbroj(a));
		break; // prekid poslije izvođenja jedanput
		
	}}
	private static int zbroj (int a) {
		
		int suma=0;
		for(int i=0; i<=a; i++) {
			suma+=i;
		}
		return suma;
	}

}
