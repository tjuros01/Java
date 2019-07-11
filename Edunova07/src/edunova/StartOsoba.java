package edunova;

public class StartOsoba {
	
	//pro�itati
	//https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
	//https://www.javatpoint.com/java-oops-concepts
	//https://www.guru99.com/java-oops-concept.html

	public static void main(String[] args) {
		
		//kreiranje nove instance klase osoba - objekt
		// instance variable, varijabla, objekt
		//deklariranje instance varijable s tipa Osoba
		//objekt je instanca klase
		Osoba s;
		
		//konstruiranje objekta
		s=new Osoba();
		
		//kori�tenje objekta
		s.setSifra(1);
		s.setPlaca(8700.99);
		s.setIme("Marija");
		s.setPrezime("Zimska");
		//ovo ne raditi
		//s.grad="Osijek";
		System.out.println(s.getPlaca());
		
		//uni�tavanje objekta
		// odra�uje GC - garbage collector
		if(Osoba.provjeraOib("15256585455")) {
			System.out.println("OIB je OK");
		}
		
		System.out.println(Osoba.GRAD);
		System.err.println(Integer.MAX_VALUE);
		
	}
}
