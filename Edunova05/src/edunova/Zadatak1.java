package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	// Program nakon unosa broja izme�u 5 i 10
	// upisani broj ispisuje
	
	public static void main(String[] args) {
		
		int i;
		
		//beskona�na petlja osigura unos
		while(true) {
			//ovo nikada ne raditi
			//int i;
			
			i=Integer.parseInt(JOptionPane.showInputDialog("B"));
			if(i>=5 && i<=10) {
				break;
			}
			
			JOptionPane.showConfirmDialog(null, "nije u rasponu");
		}
		
		System.out.println(i);
		
	}

}
