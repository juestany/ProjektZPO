public class Main {
    public static void main(String[] args) {
        Kosmetyk kosmetyk1 = new Kosmetyk("ABC", "kosmetyk1", 19.99,
                true, "twarz");
        Lek lek1 = new Lek("DEF", "DEF", 20.99,
                true, 'A');
        Kosmetyk kosmetyk2 = new Kosmetyk("GHA", "GHA", 49.99, false, "twarz");

        Magazyn magazynApteki = new Magazyn();
        magazynApteki.dodajProdukt(kosmetyk1);
        magazynApteki.dodajProdukt(kosmetyk2);
        magazynApteki.dodajProdukt(lek1);

        System.out.println("Liczba dostępnych produktów w aptece: " + magazynApteki.podliczDostepne());

        magazynApteki.MagazynDoJSON();
    }
}