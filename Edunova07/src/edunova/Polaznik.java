package edunova;

// 2. OOP princip: naslje�ivanje
public class Polaznik extends Osoba {

	private String brojUgovora;

	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.brojUgovora;
	}
}
