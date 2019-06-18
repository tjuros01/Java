package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {

	// za 3 unesena cijeli broja, ispisi najveci

	public static void main(String[] args) {
		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treæi broj"));

		if (b >= a && b >= c) {
			System.out.println("b");
		} else if (c >= a && c >= b) {

			System.out.println("c");
		} else {
			System.out.println("a");
		}
	}

}
