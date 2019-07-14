package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak2 {
	//program unosi broj ocjena
	//nakon toga u niz unosi vrijednost za svaku ocjenu
	//ispisuje prosjek ocjena
	public static void main(String[] args) {
		
		int BrojPredmeta=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj predmeta"));
		
		int [] niz= new int[BrojPredmeta];
		
		for(int i=0; i<BrojPredmeta; i++) {
			while(true) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Ocjena:"));
			
		
				if(niz[i]<6 && niz[i]>0) {
					break;
				}
				
				JOptionPane.showConfirmDialog(null, "nije u rasponu");
			}
		}
		System.out.println(Arrays.toString(niz));
		
		int zbroj=0;
		for(int i=0; i<niz.length; i++) {
		
			zbroj+=niz[i];
		}
		
		
		System.out.println((float)zbroj/BrojPredmeta);
	}
}
