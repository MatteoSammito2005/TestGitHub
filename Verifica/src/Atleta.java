public class Atleta {
	public String nominativo;
	public String nazionalitÓ;
	private double punteggio;
	
	public Atleta(String nominativo1, String nazionalitÓ1) {
		nominativo=nominativo1;
		nazionalitÓ=nazionalitÓ1;
		punteggio=0;
	}
	
	public void Punti(double puntiplus) {
		punteggio=punteggio+puntiplus;
	}
	
	public void PenalitÓ(double puntiminus) {
		punteggio=punteggio-puntiminus;
	}
	
	public double getPunteggio() {
		return punteggio;
	}
}
