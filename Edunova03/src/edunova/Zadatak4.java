package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
//program unosi redni broj mjeseca u godini, ispisuje naziv mjeseca
	
	public static void main(String[] args) {
		
		//moze ici i var = i, sama java 11 odlucuje o tipu podatka
		int i =Integer.parseInt(JOptionPane.showInputDialog("Unesi redni broj mjeseca:"));
				
				if(i==1) {System.out.println("Sije�anj");}
				else if(i==2) {System.out.println("Velja�a");}
				else if(i==3) {System.out.println("O�ujak");}
				else if(i==4) {System.out.println("Travanj");}
				else if(i==5) {System.out.println("Svibanj");}
				else if(i==6) {System.out.println("Lipanj");}
				else if(i==7) {System.out.println("Srpanj");}
				else if(i==8) {System.out.println("Kolovoz");}
				else if(i==9) {System.out.println("Rujan");}
				else if(i==10) {System.out.println("Listopad");}
				else if(i==11) {System.out.println("Studeni");}
				else if(i==12) {System.out.println("Prosinac");}
				else {System.out.println("Unijeli ste nepostoje�i mjesec!");}
	}
}
