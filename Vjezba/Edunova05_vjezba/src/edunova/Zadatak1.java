package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	// Program nakon unosa broja izme�u 5 i 10
	// upisani broj ispisuje
	
	public static void main(String[] args) {
		 int a;
		 
		while (true) {
			
			a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
			
			if(a>=5 && a<=10) {
				break;
			}
			JOptionPane.showConfirmDialog(null, "Broj nije u rasponu!");
		}
		System.out.println("Upisani broj je : "+a);
		
	}
}
