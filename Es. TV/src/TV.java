public class TV {
	private int page, volume;
	private boolean on;
	
	public TV() {
		page=0;
		volume=0;
		on=true;
	}
	
	public int incrementaVolume() {
		volume=volume+1;
		return (volume);
	}
	public int decrementaVolume() {
		volume=volume-1;
		return (volume);
	}
	
	public int incrementaCanale() {
		page=page+1;
		return (page);
	}
	public int decrementaCanale() {
		page=page-1;
		return (page);
	}
	public int impostaCanale(int cn) {
		page=cn;
		return (page);
	}
	
	public void on_off() {			
		if (on=true) {
			on=false;
		}
		if (on=false) {
			on=true;
		}
	} 
}
