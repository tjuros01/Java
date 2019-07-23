package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
	//Za uneseni broj provjeriti da li je prosti ili ne
	
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
		
		boolean prosti=true;
				for(int i=2; i<a; i++) {
					if(a%i==0) {
						System.out.println(a+" nije prost broj!");
						prosti=false;
						break;
						
					}
				}	
					if(prosti) {
						
						System.out.println(a+ "  je prost broj!");
					}
				
	}
	
}
