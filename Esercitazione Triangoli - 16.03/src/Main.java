import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader t= new BufferedReader (input);
		String dato="0";
		int scelta=0, a=0, b=0, c=0;
		boolean loop=true, errore=true;
		
		while (errore=true) {
			errore=false;
			while (loop==true) {
			try {
				System.out.print("\nScegli cosa fare: \n1. Calcolare perimetro di un triangolo qualsiasi \n2. Calcolare perimetro di un triangolo isoscele \n3. Calcolare perimetro di un triangolo equilatero");
				dato=t.readLine();
	        	scelta=Integer.valueOf(dato).intValue();
	        	
	        	if (scelta==1) {
	        		System.out.print("\nInserisci i lati del triangolo qualsiasi: ");
	        		dato=t.readLine();
	            	a=Integer.valueOf(dato).intValue();
	            	dato=t.readLine();
	            	b=Integer.valueOf(dato).intValue();
	            	dato=t.readLine();
	            	c=Integer.valueOf(dato).intValue();
	            	
	            	Triangolo tr = new Triangolo(a, b, c);
	            	
	            	System.out.print("\nIl perimetro del triangolo qualsiasi è: "+tr.calcPerim());
	        	}
	        	
	        	if (scelta==2) {
	        		System.out.print("\nInserisci i lati del triangolo isoscele: ");
	        		dato=t.readLine();
	            	a=Integer.valueOf(dato).intValue();
	            	dato=t.readLine();
	            	b=Integer.valueOf(dato).intValue();
	            	
	            	TriangoloIsoscele tri = new TriangoloIsoscele(a, b);
	            	
	            	System.out.print("\nIl perimetro del triangolo isoscele è: "+tri.calcPerim());
	        	}
	        	
	        	if (scelta==3) {
	        		System.out.print("\nInserisci il lato del triangolo equilatero: ");
	        		dato=t.readLine();
	            	a=Integer.valueOf(dato).intValue();
	            	
	            	TriangoloEquilatero tre = new TriangoloEquilatero(a);
	            	
	            	System.out.print("\nIl perimetro del triangolo equilatero è: "+tre.calcPerim());
	        	}
			
			} catch(Exception e) {
				System.out.print("\nErrore di inserimento!");
				errore=true;
			}
		}
		}
	}
}
