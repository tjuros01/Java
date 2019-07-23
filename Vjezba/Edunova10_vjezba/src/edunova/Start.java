package edunova;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Start {

    private List<Osoba> osobe;

    public Start() {

        osobe = new ArrayList<>();
         int s=Pomocno.unosInteger("Unesi redni broj radnje:");
        glavna_petlja:
        while (true) {
            izbornik();
            switch (Pomocno.unosInteger("Unesi redni broj radnje:")) {

                case 5:
                    break glavna_petlja;
                case 1:
                    izlistajOsobe();
                    break;
                case 2:
                    osobe.add(unosOsobe());
                    break;
                case 3:
                    promjenaOsobe();
                    break;
                case 4:
                    // domaća zadaća: implementirati brisanje
                    brisanjeOsobe();
                    break;
                default:
                    break;
            }

}
        }
    }

    private void brisanjeOsobe(){
        izlistajOsobe();
        // pb - pomocni broj
       int pb=redniBrojOsobe()-1;
       osobe.remove(pb);
    }

    private void promjenaOsobe() {
        izlistajOsobe();
        Osoba o = osobe.get(redniBrojOsobe() - 1);
        o = postaviVrijednost(o);

    }

    private int redniBrojOsobe() {
        int rb;
        while (true) {
            rb = Pomocno.unosInteger("Unesite redni broj");
            if (rb > osobe.size()) {
                JOptionPane.showConfirmDialog(null,
                        "Obavezno odabir ponuđenih rednih brojeva");
                continue;
            }
            return rb;
        }
    }

    private void izbornik() {
        System.out.println("###### Konzolna aplikacija ######");
        System.out.println("1. Izlistaj sve osobe");
        System.out.println("2. Unos nove osobe");
        System.out.println("3. Promjena osobe");
        System.out.println("4. Brisanje osobe");
        System.out.println("5. Izlaz iz programa");
    }

    private void izlistajOsobe() {
        System.out.println("\nIspis osoba:");
        int i = 0;
        for (Osoba osoba : osobe) {
            System.out.println(++i + ". " + osoba);
        }
        System.out.println("");
    }

    private Osoba unosOsobe() {
        Osoba o = new Osoba();
        o = postaviVrijednost(o);
        return o;
    }

    private Osoba postaviVrijednost(Osoba o) {

        o.setIme(Pomocno.unosString("Unesi ime:"));
        o.setPrezime(Pomocno.unosString("Unesi prezime:"));
        o.setVisina(Pomocno.unosInteger("Unesi visinu"));
       // o.setDatumRodenja(Pomocno.unosDatum("Unesi datum rođenja:"));
        return o;
    }


    public static void main(String[] args) {
        new Start();
    }

}



