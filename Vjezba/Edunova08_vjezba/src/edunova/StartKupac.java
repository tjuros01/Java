package edunova;

public class StartKupac {

    public StartKupac() {

        //kreirati varijablu tipa Kupac i dodjeliti
        // šifru 1 te ime Pero

        Kupac kupac=new Kupac();
        kupac.setSifra(1);
        kupac.setIme("Pero");

        System.out.println(kupac.getIme());

        kupac=new Kupac(1,"Marko");
        System.out.println(kupac.getIme()+" "+kupac.getSifra());

    }

    public static void main(String[] args) {
        new StartKupac();
    }
}
