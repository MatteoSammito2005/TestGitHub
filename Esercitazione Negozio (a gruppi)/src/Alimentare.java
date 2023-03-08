public class Alimentare extends Prodotto {
	private String data;
	
	public Alimentare(String codice, String descrizione, double prezzo, String data1) {
		super(codice, descrizione, prezzo);
		this.data=data1;
	}
	
	public void setData(String data1) {
		data=data1;
	}
	public String getData() {
		return data;
	}
}
