public class Lek extends Produkt {
    private char grupaAnatomiczna;
    public Lek(String kodProduktu,
               String nazwaProduktu,
               double cena,
               boolean czyDostepny,
               char grupaAnatomiczna) {
        super(kodProduktu, nazwaProduktu, cena, czyDostepny, "Lek");
        this.grupaAnatomiczna = grupaAnatomiczna;
    }

    public void setGrupaAnatomiczna(char grupaAnatomiczna) {
        this.grupaAnatomiczna = grupaAnatomiczna;
    }

    public char getGrupaAnatomiczna() {
        return this.grupaAnatomiczna;
    }
}
