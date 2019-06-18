package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//u slucaju da je upisani broj parni, ispisite Osijek, inaèe Vinkovci
	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		if (( i%2==0))
		{
			System.out.println("Osijek");
			
		}
		else {
			System.out.println("Vinkovci");
		}
	}
}
