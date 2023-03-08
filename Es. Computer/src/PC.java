public class PC {
	private int ram, hd, cpu, punteggio;
	private String marca, modello;

	public PC() {
		marca="0";
	    modello="0";
	    ram=0;
	    hd=0;
	    cpu=0;
	}
	
	public PC (String marca1, String modello1, int ram1, int hd1, int cpu1) {
		marca=marca1;
		modello=modello1;
		ram=ram1;
		hd=hd1;
		punteggio=0;
		cpu=cpu1;
	}
	
	
	 //marca
	  public String getMarca () {
	    return marca;
	  }
	  public void setMarca (String marca1) {
	    marca=marca1;
	  }

	  //modello
	  public String getModello () {
	    return modello;
	  }
	  public void setModello (String modello1) {
	    modello=modello1;
	  }

	  //ram
	  public int getRam () {
	    return ram;
	  }
	  public void setRam (int ram1) {
	    ram=ram1;
	  }

	  //hd
	  public int getHD () {
	    return hd;
	  }
	  public void setHD (int hd1) {
	    hd=hd1;
	  }

	  //cpu
	  public int getCPU() {
	    return cpu;
	  }
	  public void setCPU(int cpu1) {
	    cpu=cpu1;
	  }
	  
	  public int calcPunteggio () {
		  int punt=0;
		  punt = ram+(200*hd)+(500*cpu);
		  return punt;
	  }
}
