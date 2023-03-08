import java.io.*;

public class Main {
 	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
  		BufferedReader tastiera= new BufferedReader (input);
    		String dato, descrizione="0", descrizione2="0";
    		double price=0, price2=0;
    		String taglia="0"; 
    		int tipologia=0;

  		try {
   			System.out.print("Inserisci la descrizione dell'abito: ");
   			descrizione=tastiera.readLine();
   			System.out.print("Inserisci il prezzo dell'abito: ");
   			dato=tastiera.readLine();
   			price=Integer.valueOf(dato).intValue();
   			System.out.print("Inserisci la taglia dell'abito: ");
   			taglia=tastiera.readLine();
  		} catch(Exception e) {System.out.println("Errore di inserimento!");}
  
 		Abbigliamento abito=new Abbigliamento(descrizione, price, taglia);
  
 		try {
   			System.out.print("Inserisci la descrizione della valigia: ");
   			descrizione2=tastiera.readLine();
   			System.out.print("Inserisci il prezzo della valigia: ");
   			dato=tastiera.readLine();
   			price2=Integer.valueOf(dato).intValue();
   			System.out.print("Inserisci la tipologia della valigia: ");
  			dato=tastiera.readLine();
   			tipologia=Integer.valueOf(dato).intValue();
  			} catch(Exception e) {System.out.println("errore");}
	
 			Valigeria valigia = new Valigeria(descrizione2, price2, tipologia);

	
	
	}
}