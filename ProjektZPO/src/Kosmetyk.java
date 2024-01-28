public class Kosmetyk extends Produkt {
    private String zastosowanie;
    public Kosmetyk(String kodProduktu,
               String nazwaProduktu,
               double cena,
               boolean czyDostepny,
               String zastosowanie) {
        super(kodProduktu, nazwaProduktu, cena, czyDostepny, "Kosmetyk");
        this.zastosowanie = zastosowanie;
    }

    public void setZastosowanie(String zastosowanie) {
        this.zastosowanie = zastosowanie;
    }

    public String getZastosowanie() {
        return this.zastosowanie;
    }
}
