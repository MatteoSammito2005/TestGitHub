public class Atleta {
	public String nominativo;
	public String nazionalità;
	private double punteggio;
	
	public Atleta(String nominativo1, String nazionalità1) {
		nominativo=nominativo1;
		nazionalità=nazionalità1;
		punteggio=0;
	}
	
	public void Punti(double puntiplus) {
		punteggio=punteggio+puntiplus;
	}
	
	public void Penalità(double puntiminus) {
		punteggio=punteggio-puntiminus;
	}
	
	public double getPunteggio() {
		return punteggio;
	}
}
