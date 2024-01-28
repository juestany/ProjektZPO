public class Produkt {
    private String kodProduktu;
    private String nazwaProduktu;
    private double cena;
    private boolean czyDostepny;
    private String kategoria;

    public Produkt(String kodProduktu,
                   String nazwaProduktu,
                   double cena,
                   boolean czyDostepny,
                   String kategoria) {
        /**
         * Konstruktor
         */
        this.kodProduktu = kodProduktu;
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
        this.czyDostepny = czyDostepny;
        this.kategoria = kategoria;
    }

    public void setKodProduktu(String kodProduktu) {
        this.kodProduktu = kodProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setCzyDostepny(boolean czyDostepny) {
        this.czyDostepny = czyDostepny;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public String getKodProduktu() {
        return this.kodProduktu;
    }

    public String getNazwaProduktu() {
        return this.nazwaProduktu;
    }

    public double getCena() {
        return this.cena;
    }

    public boolean getCzyDostepny() {
        return this.czyDostepny;
    }

    public String getKategoria() {
        return this.kategoria;
    }
}
