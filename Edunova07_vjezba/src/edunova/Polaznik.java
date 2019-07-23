package edunova;

public class Polaznik  extends Osoba   {

    private String brojUgovora;
    private int Visina;

    public int getVisina() {
        return Visina;
    }

    public void setVisina(int visina) {
        Visina = visina;
    }



    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    @Override
    public String toString() {
        return super.toString()+ " "+this.brojUgovora +" "+this.Visina;
    }
}
