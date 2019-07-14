package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
	//program unosi dva cijela broja
	//ispisuje sve parne brojeve između njih
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj:"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj:"));
		int poc,kraj;
		

		
		
		if(a<=b) {
			poc=a;
			kraj=b;
		}
		else {
			poc=b;
			kraj=a;
		}
		
		for(int i=poc; i<=kraj; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
		
	}
	
	
}
