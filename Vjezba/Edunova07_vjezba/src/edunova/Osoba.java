package edunova;

//POJO (Plain old java project) - sadrži privatna svojstva i javne metode

public class Osoba {

    private int sifra;
    private double placa;
    private String ime;
    private String prezime;

    // javne metode

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }


    @Override
    public String toString() {
        return this.ime + " " + this.prezime + " " + this.sifra;
    }
}


