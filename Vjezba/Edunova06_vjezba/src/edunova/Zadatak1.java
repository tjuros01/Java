package edunova;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int prvi=2, drugi=1;
		prvi+=drugi-1; //prvi=3 drugi=0
		drugi=prvi++; //prvi=3, drugi=4
		prvi-=1; //prvi=2
		drugi=1;//drugi=1
		prvi=1;//prvi=1
		System.out.println(drugi);
		prvi=--drugi + 3;//prvi=3
		
	    System.out.println(drugi);
		System.out.println(++prvi+drugi);
		

	
	}

}
