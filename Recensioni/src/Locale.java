public class Locale {
	public String denominazione;
	public String indirizzo;
	public Recensioni recensioni[];
	public int nrecensioni;
	
	public Locale (String denominazione1, String indirizzo1) {
		denominazione=denominazione1;
		indirizzo=indirizzo1;
		nrecensioni=0;
		recensioni = new Recensioni[nrecensioni];
	}
	
	public double calcMedia() {
		int media=0, somma=0, i;	
	}
}
