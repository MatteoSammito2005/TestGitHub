public class Abbigliamento extends Articolo {
	public String descrizione;
	public double prezzo;
	public String taglia;

 	public Abbigliamento (String descrizione1, double prezzo1, String taglia1) {
 		super (descrizione1 ,prezzo1);
 		this.taglia=taglia1;
 	}
 	
	public String getTaglia () {
		return taglia;
	}
}