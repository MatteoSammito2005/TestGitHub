import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader t=new BufferedReader (input);
		int nv=0, np=0, anno=0, posti=0, n=0;
		String dato="0", codice="0";
		double peso=0;
		boolean loop=true, errore=true;
		
		while (errore=true) {
			errore=false;
			while (loop==true) {
				try {
					System.out.println("\nInserisci il numero di vagoni merci da memorizzare: ");
					dato = t.readLine();
					nv = Integer.valueOf(dato).intValue();
					System.out.println("Inserisci il numero di vagoni passeggeri da memorizzare: ");
					dato = t.readLine();
					np = Integer.valueOf(dato).intValue();
					
					Treno treno=new Treno();
					
					for (int i=0; i<nv; i++) {
						n=i+1;
						System.out.println("Inserisci il codice del "+n+"° vagone merci: ");
						codice = t.readLine();
						System.out.println("Inserisci il peso del "+n+"° vagone merci in kg: ");
						dato = t.readLine();
						peso = Integer.valueOf(dato).doubleValue();
						System.out.println("Inserisci l'anno di costruzione del "+n+"° vagone merci: ");
						dato = t.readLine();
						anno = Integer.valueOf(dato).intValue();
						treno.AggiungiVagone(codice, peso, anno);
					}
					
					for (int i=0; i<np; i++) {
						n=i+1;
						System.out.println("Inserisci il codice del "+n+"° vagone passeggeri: ");
						codice = t.readLine();
						System.out.println("Inserisci il peso del "+n+"° vagone passeggeri in kg: ");
						dato = t.readLine();
						peso = Integer.valueOf(dato).doubleValue();
						System.out.println("Inserisci l'anno di costruzione "+n+"° del vagone passeggeri: ");
						dato = t.readLine();
						anno = Integer.valueOf(dato).intValue();
						System.out.println("Inserisci il numero di posti del "+n+"° vagone passeggeri: ");
						dato = t.readLine();
						posti = Integer.valueOf(dato).intValue();
						treno.AggiungiVagone_p(codice, peso, anno, posti);
					}
					
					System.out.println("Il treno è composto così: ");
					treno.stampaTreno();
						
					System.out.println("Il peso totale del treno è: "+treno.pesoComplessivo());
					
					System.out.println("\nIl numero di posti totale del treno è: "+treno.capienza());
				} catch(Exception e) {System.out.println("Errore di inserimento!"); errore=true;}
			}
		}
	}
}
