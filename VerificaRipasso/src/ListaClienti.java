public class ListaClienti {
	int nv=0;
	Cliente[] clienti = new Cliente[100];
	
	public void AggiungiCliente(String nome, String indirizzo, String numero, double saldo) {
		clienti[nv] = new Cliente (nome,indirizzo,numero, saldo);
		nv++;
	}
	
	public int ControllaPosizione(String numero) {
		int j=0;
		for (int i=0; i<nv; i++) {
			if(clienti[i].numero.equals(numero)) {
				j=i;
			}
		}
		return j;
	}
	
	public double getConto(int posizione) {
		return clienti[posizione].saldo;
	}
}