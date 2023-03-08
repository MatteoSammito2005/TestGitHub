public class Articolo {
	private String descrizione;
	private double prezzo;
	
	public Articolo(String descrizione1, double prezzo1) {
		this.descrizione=descrizione1;
		this.prezzo=prezzo1;
	}
	
	public void setDescrizione (String descrizione1) {
		descrizione=descrizione1;
	}
	public String getDescrizione () {
		return descrizione;
	}
	
	public void setPrezzo (double prezzo1) {
		prezzo=prezzo1;
	}
	public double getPrezzo () {
		return prezzo;
	}
}
