import static org.junit.jupiter.api.Assertions.*;

class MagazynTest {

    @org.junit.jupiter.api.Test
    void podliczDostepne1() {
        /**
         * Test jednostkowy sprawdzający sytuację, w której nie ma żadnych produktów w magazynie.
         */
        Magazyn magazyn = new Magazyn();
        long iloscDostepnych = magazyn.podliczDostepne();
        assertEquals(0, iloscDostepnych);
    }

    @org.junit.jupiter.api.Test
    void podliczDostepne2() {
        /**
         * Test jednostkowy sprawdzający sytuację, w której jest jeden dostępny produkt
         * w magazynie.
         */
        Magazyn magazyn = new Magazyn();
        Produkt produkt = new Produkt("123", "Testowy produkt", 10.0, true, "Lek");
        magazyn.dodajProdukt(produkt);
        long iloscDostepnych = magazyn.podliczDostepne();
        assertEquals(1, iloscDostepnych);
    }

    @org.junit.jupiter.api.Test
    void podliczDostepne3() {
        /**
         * Test jednostkowy sprawdzający sytuację, w której jest jeden (niedostępny) produkt w magazynie.
         */
        Magazyn magazyn = new Magazyn();
        Produkt produkt = new Produkt("123", "Testowy produkt", 10.0, false, "Lek");
        magazyn.dodajProdukt(produkt);
        long iloscDostepnych = magazyn.podliczDostepne();
        assertEquals(0, iloscDostepnych);
    }
}