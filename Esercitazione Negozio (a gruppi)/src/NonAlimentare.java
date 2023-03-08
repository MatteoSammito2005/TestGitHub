public class NonAlimentare extends Prodotto {
private String materiale;
	
	public NonAlimentare(String codice, String descrizione, double prezzo, String materiale) {
		super(codice, descrizione, prezzo);
		this.materiale=materiale;
	}
	
	public void setMateriale(String materiale1) {
		materiale=materiale1;
	}
	public String getMateriale() {
		return materiale;
	}
}
