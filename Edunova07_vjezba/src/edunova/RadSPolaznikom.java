package edunova;

public class RadSPolaznikom {

    public static void main(String[] args) {
        Polaznik p= new Polaznik();

        p.setIme("Perica");
        p.setPrezime("Ognjenović");
        p.setBrojUgovora("2019/02");
        p.setVisina(202);

        System.out.println(p.getIme()+ " "+p. getPrezime());

        //rezultat metode toString na klasi Object
        System.out.println(p);

        //kreireajte novu instancu klase Predavaca
        //postavite sva svojstva
        //ispišite predavaca

        Predavac predavac=new Predavac();
        predavac.setIme("Marinko");
        predavac.setPrezime("Barukčić");
        predavac.setIban("154864525564");
        System.out.println(predavac);
    }
}
