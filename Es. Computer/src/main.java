import java.io.*;

public class main {
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader t= new BufferedReader (input);
	    String dato="0", marca="0", modello="0";
		int i, ram=0, hd=0, cpu=0, max=0, imax=0;
		PC computer[] = new PC[5];
		
		for (i=0; i<5; i++) {
			try {
			System.out.println("\nInserisci la marca: ");
			marca=t.readLine();
			System.out.println("Inserisci il modello: ");
			modello=t.readLine();
			System.out.println("Inserisci la RAM in MB: ");
			dato=t.readLine();
			ram=Integer.valueOf(dato).intValue();
			System.out.println("Inserisci la capacità dell'hard disk in GB: ");
			dato=t.readLine();
			hd=Integer.valueOf(dato).intValue();
			System.out.println("Inserisci la frequenza della CPU in GHz: ");
			dato=t.readLine();
			cpu=Integer.valueOf(dato).intValue();
			} catch(Exception e) {System.out.println("Errore di inserimento!");}
			computer[i] = new PC(marca, modello, ram, hd, cpu);
			System.out.println("Il punteggio è: "+computer[i].calcPunteggio());
			if (computer[i].calcPunteggio()>max) {
				max=computer[i].calcPunteggio();
				imax=i;	
			}	
			
		}
		System.out.println("La marca del PC migliore è: "+computer[imax].getMarca());
		System.out.println("Il modello del PC migliore è: "+computer[imax].getModello());
		System.out.println("La RAM del PC migliore è: "+computer[imax].getRam());
		System.out.println("L'hard disk del PC migliore è: "+computer[imax].getHD());
		System.out.println("La della CPU del PC migliore è: "+computer[imax].getCPU());
	}
}
