package edunova;

public class StartOsoba {

    public static void main(String[] args) {

        Osoba s =new Osoba();
        //korištenje objekta

        s.setSifra(1);
        s.setPlaca(8700.99);
        s.setIme("Marija");
        s.setPrezime("Sabolski");
        //ovo ne raditi
        //s.grad="Osijek";

        System.out.println(s.getIme() + " "+s.getPrezime()+" "+s.getPlaca()+" "+s.getSifra());


    }

}
