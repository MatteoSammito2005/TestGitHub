import java.io.*;

public class Main {
public static void main(String[] args) {
InputStreamReader input = new InputStreamReader(System.in);
   BufferedReader t= new BufferedReader (input);
   String dato="";
   int ntipi=0;
   String nome="";
   double prezzo=0;
   int sconto1=0, sconto2=0, sconto3=0, sconto4=0, i=0;
   int npezzi=0;
   int n;
   int tmp;
   
   try {
   System.out.println("inserisci il numero di tipologie di prodotti trattati: ");
   dato = t.readLine();
   ntipi = Integer.valueOf(dato).intValue();
   
   System.out.println("inserisci lo sconto per il prodotto più venduto: ");
   dato = t.readLine();
      sconto1 = Integer.valueOf(dato).intValue();
      
      System.out.println("inserisci lo sconto per il secondo prodotto più venduto: ");
   dato = t.readLine();
      sconto2 = Integer.valueOf(dato).intValue();
      
      System.out.println("inserisci lo sconto per il terzo prodotto più venduto: ");
   dato = t.readLine();
      sconto3 = Integer.valueOf(dato).intValue();
      System.out.println("--------------------------------------------------");
   }catch(Exception e) {
    System.out.println("errore");
   }
   
  Prodotto prodotti[] = new Prodotto[ntipi];
  
   for (i=0; i<ntipi; i++) {
    try {
     System.out.println("inserisci il numero di pezzi venduti per la tipologia "+i+":" );
     dato = t.readLine();
     npezzi= Integer.valueOf(dato).intValue();
	
     System.out.println("inserisci la descrizione del prodotto: ");
     nome = t.readLine();

     System.out.println("inserisci il prezzo del prodotto: ");
     dato = t.readLine();
           prezzo=Integer.valueOf(dato).intValue();
          
    }catch (Exception e) {
     System.out.println("errore");
    }
    prodotti[i] = new Prodotto(nome, prezzo, npezzi);   
       System.out.println("-----------------------------------------------");
   }  
   
   for (i=0; i<ntipi-1; i++) {
       for(n=0; n<ntipi-2-i; n++) {
           if(prodotti[n].npezzi>prodotti[n+1].npezzi) {
            tmp = prodotti[n].npezzi;
            prodotti[n].npezzi = prodotti[n+1].npezzi;
            prodotti[n+1].npezzi = tmp;
           }
       }
   }
   System.out.println("ecco l'incasso del prodotto più venduto: "+prodotti[0].calcPrezzo(prezzo, npezzi, sconto1));
   System.out.println("ecco l'incasso del secondo prodotto più venduto: "+prodotti[1].calcPrezzo(prezzo, npezzi, sconto2));
   System.out.println("ecco l'incasso del terzo prodotto più venduto: "+prodotti[2].calcPrezzo(prezzo, npezzi, sconto3));
   
   if(ntipi>3) {
   for(i=3; i<ntipi; i++) {
    System.out.println("ecco l'incasso: "+prodotti[i].calcPrezzo(prezzo, npezzi, sconto4));
    }
   }
   
   
   }
 }