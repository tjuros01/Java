package edunova;

public class UvjetnoGrananjeIf {

	public static void main(String[] args) {

		int i = 0;

		boolean uvjet1 = i >= 1;

		boolean uvjet2 = i <= 5;

		// unbind skip all...
		System.out.println(uvjet1);
		System.out.println(uvjet2);

		if (uvjet1) {
			// kad nema viticastih zagrada, if se primjenjuje samo na prvu liniju
			System.out.println("vece je od 0");
		}

		if (i >= 1) {
			// true grana
			System.out.println("Veæe je od nule");
		} else {
			// false grana
			System.out.println("Nije vece od nule");
		}

		// operator & - booleov operator provjerava oba uvjeta
		if (uvjet1 & uvjet2) {
			System.out.println("Ocjena je");

		}

		// operator &&-uvjetovani and, uu sluèaju ne zadovoljavanja prvoga, drugi se ne
		// provjerava
		if (uvjet1 && uvjet2) {
			System.out.println("Ocjena je");

		}

		// operator | -> booleov operator ili
		if (uvjet1 | uvjet2) {
			System.out.println("Jedan je zadovoljen");
		}

		// operator || -> u slucaju zadovoljenja prvog uvjeta, drugi se ne provjerava
		if (uvjet1 || uvjet2) {
			System.out.println("Jedan je zadovoljen");
		}

		if (!uvjet1) {
			System.out.println("Prvi uvjet nije zadovoljen");

		}
		
		int p = 4;
		if(p%2==0) {
			System.out.println("Paran");
		}else {
			System.out.println("Neparan");
		}
		
		
		//nakon upitnika ide true, nakon : false
		System.out.println(p%2==0 ? "Paran" : "Neparan");
		
		
		
	}

}
