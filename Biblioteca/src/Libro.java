public class Libro {
	public String cod_scaff = "0";
	public String titolo = "0";
	public String autore = "0";
	public String ediz = "0";
	public boolean prestito = false;
	
	public Libro() {
		this.cod_scaff="0";
		this.titolo="0";
		this.autore="0";
		this.ediz="0";
		this.prestito=false;
	}
	public Libro(String codice, String titolo, String autore, String ediz, boolean prestito) {
		this.cod_scaff=codice;
		this.titolo=titolo;
		this.autore=autore;
		this.ediz=ediz;
		this.prestito=prestito;
	}
}
