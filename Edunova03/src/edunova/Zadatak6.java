package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {

	//unijeti cijeli broj, ispisat apsolutrnu vrijednost
	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
		
		System.out.println(Math.abs(i));
		
	}
}
