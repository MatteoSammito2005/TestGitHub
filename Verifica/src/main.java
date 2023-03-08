import java.io.*;

public class main {
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader t= new BufferedReader (input);
	    
	    String dato="0", nome="0", nazione="0";
	    double punt=0, puntiatleta=0;
	    int scelta=0;
	    
	    try {
			System.out.print("Inserisci il nome dell'atleta: ");
			nome=t.readLine();
			System.out.print("\nInserisci la nazionalità dell'atleta: ");
			nazione=t.readLine();
		} catch (Exception e) {System.out.print("Errore di inserimento!");}

	    Atleta at=new Atleta(nome, nazione);
	    
	    while(true) {
	    	try {
	    		System.out.print("\nScegli cosa fare: ");
		    	System.out.print("\n1. Registra punti; \n2. Registra penalità; \n3. Stampa punteggio; \n4. Esci\n");
		    	dato=t.readLine();
		    	scelta=Integer.valueOf(dato).intValue();
			} catch (Exception e) {System.out.print("Errore di inserimento!");}
	    	
	    	if (scelta==1) {
	    		try {
			    	System.out.print("\nQuanti punti vuoi sommare? ");
			    	dato=t.readLine();
			    	punt=Integer.valueOf(dato).doubleValue();
				} catch (Exception e) {System.out.print("Errore di inserimento!");}
	    		
	    		at.Punti(punt);
	    		
	    		at.getPunteggio();
	    	}
	    	
	    	if (scelta==2) {
	    		try {
			    	System.out.print("\nQuanti punti vuoi sottrarre? ");
			    	dato=t.readLine();
			    	punt=Integer.valueOf(dato).doubleValue();
				} catch (Exception e) {System.out.print("Errore di inserimento!");}
	    		
	    		at.Penalità(punt);
	    		
	    		at.getPunteggio();
	    	}
	    	
	    	if (scelta==3) {
	    		at.getPunteggio();
	    	}
	    	
	    	if (scelta==4) {
	    		break;
	    	}	
	    }
	}
}
