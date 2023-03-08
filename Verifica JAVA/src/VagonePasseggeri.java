public class VagonePasseggeri extends Vagone{
	private int n_posti;

	public VagonePasseggeri(String codice, double peso, int anno, int n_posti) {
		super(codice, peso, anno);
		this.n_posti=n_posti;
	}
	
	public void setPosti(int p) {
		n_posti=p;
	}
	public int getPosti() {
		return n_posti;
	}
}
