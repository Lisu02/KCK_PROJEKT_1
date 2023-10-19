public class Paszport {

    private int wiek = 99;
    private String imie = "Janusz";
    private String nazwisko = "Kowalski";

    private String plec = "M";
    private String kodPaszportu = "ABCDE-12345";

    private String regionWydania = "Est-grestin";

    private String krajPochodzenia = "Arztocka";
    private boolean poprawnyDokument = true; //POTENCJALNIE DO ZMIANY ZE WZGLEDU NA KOD BLEDU DOUMENTU

    //LISTA KODÓW BŁĘDU DOKUMENTU
    /*0-BRAK BŁĘDU || 1-BŁĄD REGIONU || 2-BŁĄD KRAJU POCHODZENIA */
    private int kodBleduDokumentu = 0;

    public Paszport(){
        //Decyzja

        /*Losowanie imienia i nazwiska razem z kodem paszportu*/
        /*Losowanie kraju pochodzenia i regionu wydania*/
    }

    //Konstruktor do testów z konkretnymi danymi
    public Paszport(int kodBleduDokumentu,boolean poprawnyDokument){
        this.kodBleduDokumentu = kodBleduDokumentu;
        this.poprawnyDokument = poprawnyDokument;
    }

    public Paszport(int wiek,String imie,String nazwisko,String plec,String kodPaszportu,String regionWydania,String krajPochodzenia,int kodBleduDokumentu,boolean poprawnyDokument){
        this.wiek = wiek;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.kodPaszportu = kodPaszportu;
        this.regionWydania = regionWydania;
        this.krajPochodzenia = krajPochodzenia;
        this.kodBleduDokumentu = kodBleduDokumentu;
        this.poprawnyDokument = poprawnyDokument;
    }
}
