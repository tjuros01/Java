package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	// Program unosi broj ve�i od 1000
	// program ispisuje sve parne brojeve
	// od broja 0 do unesenog broja jedno 
	// pokraj drugog u redu odvojeno zarezom 
	// po 10 u redu
	
	public static void main(String[] args) {
		int i;
		while(true) {
			 i=Integer.parseInt(JOptionPane.showInputDialog("B"));
			if(i>1000) {
				break;
			}
			JOptionPane.showConfirmDialog(null, ">1000 mora biti");
		}
		for(int k=1; k<= i; k++) {
			
		if(k%2==1) {
			continue;
		}	System.out.print(k + ", ");
		
		if(k%20==0) {
			System.out.println();
		}
		
		}
		
		
		
	}
}
