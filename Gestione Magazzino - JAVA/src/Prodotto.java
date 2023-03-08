public class Prodotto {
	public String descrizione;
	public double prezzo;
	
	public Prodotto(String descrizione1, double prezzo1) {
		descrizione=descrizione1;
		prezzo=prezzo1;
	}
	
	public double calcPrezzo() {
		double prezzo=0, sconto=0, somma=0;
		int npezzi=0;
		somma=(prezzo-sconto)*npezzi;
		return somma;
	}
}