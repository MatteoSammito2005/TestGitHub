public class Atleta {
	public String nominativo;
	public String nazionalit�;
	private double punteggio;
	
	public Atleta(String nominativo1, String nazionalit�1) {
		nominativo=nominativo1;
		nazionalit�=nazionalit�1;
		punteggio=0;
	}
	
	public void Punti(double puntiplus) {
		punteggio=punteggio+puntiplus;
	}
	
	public void Penalit�(double puntiminus) {
		punteggio=punteggio-puntiminus;
	}
	
	public double getPunteggio() {
		return punteggio;
	}
}
