public class Osoba {

    private Paszport paszport = null;
    private PozwolenieNaWejscie  pozwolenieNaWejscie = null;
    private PozwolenieNaPrace pozwolenieNaPrace = null;

    private boolean legalny = true;
    public Osoba(){
       paszport = new Paszport();
       pozwolenieNaWejscie = new PozwolenieNaWejscie();
       pozwolenieNaPrace = new PozwolenieNaPrace();
    }

    public void zmienLegalnoscOsobyNa(boolean legalnosc){
        this.legalny = legalnosc;
    }

}
