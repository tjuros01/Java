package edunova;

public class Kupac {
	
	private int sifra;
	private String ime;
	
	public Kupac() {
		
	}
	
	
	
	
	public Kupac(int sifra, String ime) {
		this.sifra = sifra;
		this.ime = ime;
	}




	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	

}
