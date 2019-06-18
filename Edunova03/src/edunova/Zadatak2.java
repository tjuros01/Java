package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	//u slucaju da je zbroj 3 unesena broja veci od 100, ispisi OK, inaèe, nemoj nist ispisati
	public static void main(String[] args) {
		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Unesi treæi broj"));
		
		if(a+b+c>=100) {
			System.out.println("OK");
		}
		//ne treba else
		else {
			System.out.println("");
		}
	}

}
