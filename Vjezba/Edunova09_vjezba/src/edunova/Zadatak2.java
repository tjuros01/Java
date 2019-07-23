package edunova;

import javax.swing.*;

public class Zadatak2 {
    public Zadatak2() {

        int b;
        while(true){

            try {
               b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
           break;
            }catch (Exception e){
                System.out.println("Niste unijeli broj:");
            }

        }

    }

    public static void main(String[] args) {
        new Zadatak2();
    }
}
