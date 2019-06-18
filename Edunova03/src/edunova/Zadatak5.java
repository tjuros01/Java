package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
	
	
	//za 2 decimalna broja ispisati razliku podijeljenu s PI
	public static void main(String[] args) {
		 Double a=Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi broj:"));
		 Double b=Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi broj:"));
		
		
			System.out.println((a-b)/ Math.PI);
	
	}

}
