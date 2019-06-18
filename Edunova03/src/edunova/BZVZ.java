package edunova;

import javax.swing.JOptionPane;

public class BZVZ {
	// program unosi redni broj mjeseca u godini, ispisuje naziv mjeseca

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi redni broj mjeseca:"));
		
		if(i>0 && i<13) {
		switch (i) {
		case 1:
			System.out.println("Sijeèanj");
			break;
		case 2:
			System.out.println("Veljaèa");
			break;
		case 3:
			System.out.println("Ožujak");
			break;
		case 4:
			System.out.println("Travanj");
			break;
		case 5:
			System.out.println("Svibanj");
			break;
		case 6:
			System.out.println("Lipanj");
			break;
		case 7:
			System.out.println("Srpanj");
			break;
		case 8:
			System.out.println("Kolovoz");
			break;
		case 9:
			System.out.println("Rujan");
			break;
		case 10:
			System.out.println("Listopad");
			break;
		case 11:
			System.out.println("Studeni");
			break;
		case 12:
			System.out.println("Prosinac");
			break;

		}}else System.out.println("Nepostojeæi mjesec");

	}
}
