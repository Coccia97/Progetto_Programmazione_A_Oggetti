
public class Compito {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("STAMPA ESERCIZIO 1b");
		System.out.println(enigma(8));
		System.out.println(enigma(12));
		System.out.println(enigma(25));
		System.out.println ("STAMPA ESERCIZIO 1a");
		int conto=0;
		int[] a = {9, 3, 5, 6, 4, 5};
		int n=20, i;
		for (i=a.length-1; i>0 && conto <=2; i--) {
		for (int j=0; j<i; j++) {
		if (a[i]*a[j]<=n){
		conto++;
		System.out.println(i + " e " +j);
		}
		}
		System.out.println(conto);
	}
	}

	static int enigma(int x) {
		if (x <= 0 || x >= 20)
			return x;
		if (x <= 10)
			return enigma(-x);
		return x + enigma(x + 5);
	}
}
