public class Vagone {
	private String codice;
	private double peso;
	private int anno_c;

	public Vagone(String codice, double peso, int anno_c) {
		this.codice=codice;
		this.peso=peso;
		this.anno_c=anno_c;
	}
   
   	public void setCodice(String c) {
		codice=c;
   	}
   	public String getCodice() {
		return codice;
   	}

   	public void setPeso(double p) {
		peso=p;
   	}
   	public double getPeso() {
	   	return peso;
   	}
   	
   	public void setAnno(int a) {
		anno_c=a;
   	}
   	public int getAnno() {
	   	return anno_c;
   	}	
}
