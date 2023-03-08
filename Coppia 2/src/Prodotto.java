public class Prodotto {
public String descrizione;
public double prezzo;
public int npezzi;

public Prodotto(String descrizione1, double prezzo1, int npez) {
descrizione=descrizione1;
prezzo=prezzo1;
npezzi = npez;
}

public double calcPrezzo (double prezzo, int npezzi, int sconto) {
double calcolo = (prezzo-sconto)*npezzi;
  return calcolo;
 }
}