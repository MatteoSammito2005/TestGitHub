public class Prodotto {
	private String codice;
	private String descrizione;
	private double prezzo;
	
	public Prodotto() {
		this.codice="0";
		this.descrizione="0";
		this.prezzo=0;
	}

	public Prodotto(String codice1, String descrizione1, double prezzo1) {
		this.codice=codice1;
		this.descrizione=descrizione1;
		this.prezzo=prezzo1;
	}
	
	public void setCodice(String codice1) {
		codice=codice1;
	}
	public String getCodice() {
		return codice;
	}
	
	public void setDescrizione(String descrizione1) {
		descrizione=descrizione1;
	}
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setPrezzo(double prezzo1) {
		prezzo=prezzo1;
	}
	public double getPrezzo() {
		return prezzo;
	}
}
