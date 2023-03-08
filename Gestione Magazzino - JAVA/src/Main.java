import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader t= new BufferedReader (input);
	    String dato="0", descrizione="0";
	    double prezzo=0;
	    int ntipi=0, sconto1=0, sconto2=0, sconto3=0, i=0, imax1=0, imax2=0, imax3=0, npezzi=0, npezzi1=0, npezzi2=0, npezzi3=0;
	    
	    try {
	    	System.out.print("Inserisci il numero di tipologie di prodotti trattati: ");
	    	dato=t.readLine();
	    	ntipi=Integer.valueOf(dato).intValue();
	    	System.out.print("Inserisci lo sconto per il prodotto più venduto: ");
	    	dato=t.readLine();
	    	sconto1=Integer.valueOf(dato).intValue();
	    	System.out.print("Inserisci lo sconto per secondo prodotto più venduto : ");
	    	dato=t.readLine();
	    	sconto2=Integer.valueOf(dato).intValue();
	    	System.out.print("Inserisci lo sconto per terzo prodotto più venduto : ");
	    	dato=t.readLine();
	    	sconto3=Integer.valueOf(dato).intValue();
	    } catch (Exception e) {System.out.print("Errore di inserimento!");}
	    
	    for (i=0; i<ntipi; i++) {
	    	try {
	    		System.out.print("Inserisci il numero prodotti venduti per la tipologia "+i+1+".");
	    		dato=t.readLine();
		    	npezzi=Integer.valueOf(dato).intValue();
		    	if(npezzi>npezzi1) {
		    		npezzi1=npezzi;
		    		imax1=i;
		    	} 
		    	if(npezzi<npezzi1 && npezzi>npezzi2) {
		    		npezzi2=npezzi;
		    		imax2=i;
		    	}
		    	if(npezzi<npezzi2 && npezzi>npezzi3) {
		    		npezzi3=npezzi;
		    		imax3=i;
		    	}
		    	
		    	System.out.print("Inserisci la descrizione del prodotto: ");
	    		descrizione=t.readLine();
	    		System.out.print("Inserisci il prezzo unitario del prodotto: ");
	    		dato=t.readLine();
	    		prezzo=Integer.valueOf(dato).intValue();
	    	} catch (Exception e) {System.out.print("Errore di inserimento!");}
	    	
	    	Prodotto prodotti = new Prodotto(descrizione, prezzo);
	    }
	    
	    for (i=0; i<ntipi; i++) {
	    	prodotti[i].calcPrezzo
	    	
	    }
	    
	    
	    
	    
		

	}
}
