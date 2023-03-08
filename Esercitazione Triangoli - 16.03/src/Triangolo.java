public class Triangolo {
	public int lato1, lato2, lato3;
	
	public Triangolo(int a, int b, int c) {
		lato1=a;
		lato2=b;
		lato3=c;
	}
	
	public int calcPerim() {
		return lato1+lato2+lato3;
	}
}
