# Magazyn

## Produkt

Klasa `Produkt` reprezentuje ogólny produkt w magazynie. Posiada następujące pola:

- `kodProduktu` - unikalny kod identyfikacyjny produktu.
- `nazwaProduktu` - nazwa produktu.
- `cena` - cena produktu.
- `czyDostepny` - informacja o dostępności produktu.
- `kategoria` - kategoria produktu (np. "Lek" lub "Kosmetyk").

### Metody

- `setKodProduktu(String kodProduktu)`: Ustawia nowy kod produktu.
- `setNazwaProduktu(String nazwaProduktu)`: Ustawia nową nazwę produktu.
- `setCena(double cena)`: Ustawia nową cenę produktu.
- `setCzyDostepny(boolean czyDostepny)`: Ustawia dostępność produktu.
- `setKategoria(String kategoria)`: Ustawia kategorię produktu.
- `getKodProduktu()`: Zwraca kod produktu.
- `getNazwaProduktu()`: Zwraca nazwę produktu.
- `getCena()`: Zwraca cenę produktu.
- `getCzyDostepny()`: Zwraca informację o dostępności produktu.
- `getKategoria()`: Zwraca kategorię produktu.

## Lek

Klasa `Lek` rozszerza klasę `Produkt` i reprezentuje lek. Dodatkowo posiada pole:

- `grupaAnatomiczna` - grupa anatomiczna leku.

### Metody

- `setGrupaAnatomiczna(char grupaAnatomiczna)`: Ustawia nową grupę anatomiczną leku.
- `getGrupaAnatomiczna()`: Zwraca grupę anatomiczną leku.

## Kosmetyk

Klasa `Kosmetyk` rozszerza klasę `Produkt` i reprezentuje kosmetyk. Dodatkowo posiada pole:

- `zastosowanie` - zastosowanie kosmetyku.

### Metody

- `setZastosowanie(String zastosowanie)`: Ustawia nowe zastosowanie kosmetyku.
- `getZastosowanie()`: Zwraca zastosowanie kosmetyku.

## Magazyn

Klasa `Magazyn` zarządza listą produktów w magazynie. Posiada pole:

- `listaProduktow` - lista produktów w magazynie.

### Metody

- `dodajProdukt(Produkt produkt)`: Dodaje produkt do listy produktów.
- `usunProdukt(Produkt produkt)`: Usuwa produkt z listy produktów.
- `MagazynDoJSON()`: Zapisuje listę produktów w formacie JSON.
- `eksportJSON(JSONObject jsonObject, String nazwaPliku)`: Zapisuje obiekt JSON do pliku.
- `importJSON(String path)`: Wczytuje listę produktów z pliku JSON.
- `podliczDostepne()`: Podlicza ilość dostępnych produktów.

## MagazynTest

Klasa `MagazynTest` zawiera testy jednostkowe dla klasy `Magazyn`, sprawdzające różne scenariusze, takie jak pusty magazyn, dostępny i niedostępny produkt.
