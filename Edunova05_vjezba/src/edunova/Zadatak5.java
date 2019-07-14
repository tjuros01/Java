package edunova;

public class Zadatak5 {
	//do while petljom zbrojite prvih 100 brojeva
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		do {
			
			sum+=i++;	
			
		}while(i<=100);
		System.out.println(sum);
	}
}
