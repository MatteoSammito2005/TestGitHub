public class ListaLibri {
	int nv=0;
	Libro[] libri = new Libro[100];
	
	public void AggiungiLibro(String codice, String titolo, String autore, String ediz, boolean prestito) {
		libri[nv] = new Libro (codice, titolo, autore, ediz, prestito);
		nv++;
	}
	public int ControllaCodice(String codice) {
		int j=0;
		for (int i=0; i<nv; i++) {
			if(libri[i].cod_scaff.equals(codice)) {
				j=i;
			}
		}
		return j;
	}
	public void setPrestito(int posizione) {
		libri[posizione].prestito=true;
	}
	
	public void setPrestito1(int posizione) {
		libri[posizione].prestito=false;
	}
	public boolean getPrestito1(int posizione) {
		return libri[posizione].prestito;
	}
	public void stampaLibri() {
		for (int i=0; i<nv; i++) {
			System.out.println(libri[i].titolo);
			if (libri[i].prestito==true) {
				System.out.println("In Prestito");
				System.out.println("");
			}
			else {
				System.out.println("In Biblioteca");
				System.out.println("");
			}	
		}
	}
}
