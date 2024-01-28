import java.util.*;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Magazyn {
    private static Set<Produkt> listaProduktow;

    public Magazyn() {
        /**
         * Konstruktor
         */
        listaProduktow = new HashSet<>();
    }

    public void dodajProdukt(Produkt produkt) {
        /**
         * Metoda pozwalająca na dodanie produktu do listy produktów.
         * @param produkt (Produkt)
         */
        listaProduktow.add(produkt);
    }

    public void usunProdukt(Produkt produkt) {
        /**
         * Metoda pozwalająca na usunięcie produktu z listy przedmiotów
         * z wykorzystaniem kodu przedmiotu.
         * @param kod_przedmiotu (String)
         */
        listaProduktow.remove(produkt);
    }


    public JSONObject MagazynDoJSON() {
        /**
         * Metoda pozwalająca na zapisanie listy produktów w formacie JSON.
         */
        JSONObject produktJSON = new JSONObject();
        for(Produkt produkt : listaProduktow) {
            produktJSON.put("kodProduktu", produkt.getKodProduktu());
            produktJSON.put("nazwaProduktu", produkt.getNazwaProduktu());
            produktJSON.put("cena", produkt.getCena());
            produktJSON.put("czyDostepny", produkt.getCzyDostepny());
        }
        return produktJSON;
    }

    public static void eksportJSON(JSONObject jsonObject, String nazwaPliku) {
        /**
         * Metoda pozwalająca zapisać obiekt JSON w formie pliku.
         * @param jsonObject (JSONObject)
         * @param nazwaPliku (String)
         */
        try {
            FileWriter file = new FileWriter(nazwaPliku);
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.getMessage();
        }
        System.out.println("Stworzono plik JSON: " + jsonObject);
    }

    public static Set<Produkt> importJSON(String path) throws IOException, ParseException {
        /**
         * Metoda pozwalająca na wczytanie pliku JSON z listą produktów i zwrócenie jej w postaci hashsetu listaProduktow.
         * @param path (String)
         * @returns listaProduktow (Produkty)
         * @throws IOException, ParseException
         */
        Set<Produkt> listaProduktow = new HashSet<>();
        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(path));

            for (Object key : jsonObject.keySet()) {
                String nazwaProduktu = (String) key;
                JSONObject produktJSON = (JSONObject) jsonObject.get(nazwaProduktu);

                String kodProduktu = (String) produktJSON.get("kodProduktu");
                double cena = (double) produktJSON.get("cena");
                boolean czyDostepny = (boolean) produktJSON.get("czyDostepny");
                String kategoria = (String) produktJSON.get("kategoria");
                String zastosowanie = (String) produktJSON.get("zastosowanie");
                char grupaAnatomiczna = (char) produktJSON.get("grupaAnatomiczna");

                if(kategoria == "Kosmetyk") {
                    Kosmetyk kosmetyk = new Kosmetyk(kodProduktu, nazwaProduktu, cena, czyDostepny, zastosowanie);
                    listaProduktow.add(kosmetyk);
                } else if(kategoria == "Lek") {
                    Lek lek = new Lek(kodProduktu, nazwaProduktu, cena, czyDostepny, grupaAnatomiczna);
                    listaProduktow.add(lek);
                }
            }

        } catch (IOException | ParseException e) {
            e.getMessage();
        }
        return listaProduktow;
    }

    public long podliczDostepne() {
        /**
         * Metoda podliczająca dostępne produkty w listaProduktow.
         */
        if (this.listaProduktow.isEmpty()) {
            System.out.println("Brak dostępnych produktów do podliczenia.");
        }

        long dostepneProdukty = listaProduktow
                .stream()
                .filter(Produkt::getCzyDostepny)
                .count();
        return dostepneProdukty;
    }

}
