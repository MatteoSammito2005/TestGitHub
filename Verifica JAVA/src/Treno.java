public class Treno {
	public Vagone[] vagone=new Vagone[100];
	public VagonePasseggeri[] vagone_p=new VagonePasseggeri[100];
	public int nv=0;
	public int np=0;
	public double somma=0;
	public int cap=0;
	public int n=0;
	
	public void AggiungiVagone(String codice, double peso, int anno) {
		if(nv<100) {
		vagone[nv]=new Vagone(codice, peso, anno);
		nv++;
		}
		else {System.out.print("Impossibile aggiungere nuovi vagoni");}
	}
	
	public void AggiungiVagone_p(String codice, double peso, int anno, int posti) {
		if (np<100) {
		vagone_p[np]=new VagonePasseggeri(codice, peso, anno, posti);
		np++;
		}
		else {System.out.print("Impossibile aggiungere nuovi vagoni");}
	}
	
	public double pesoComplessivo() {
		for (int i=0; i<nv; i++) {
			somma=somma+vagone[i].getPeso();
		}
		for (int i=0; i<np; i++) {
			somma=somma+vagone_p[i].getPeso();
		}
		return somma;
	}
	
	public int capienza() {
		for (int i=0; i<np; i++) {
			cap=cap+vagone_p[i].getPosti();
		}
		return cap;
	}
	
	public void stampaTreno() {
		for (int i=0; i<nv; i++) {
			n=n+1;
			System.out.println("Vagone merci numero "+n);
			System.out.println("Codice: "+vagone[i].getCodice());
			System.out.println("Peso in kg: "+vagone[i].getPeso());
			System.out.println("Anno di costruzione: "+vagone[i].getAnno());
			System.out.println(" ");
		}
		for (int i=0; i<np; i++) {
			n=n+1;
			System.out.println("Vagone passeggeri numero "+n);
			System.out.println("Codice: "+vagone_p[i].getCodice());
			System.out.println("Peso in kg: "+vagone_p[i].getPeso());
			System.out.println("Anno di costruzione: "+vagone_p[i].getAnno());
			System.out.println("Numero posti: "+vagone_p[i].getPosti());
			System.out.println(" ");
		}
	}
}
