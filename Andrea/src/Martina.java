import java.lang.reflect.Array;

import java.util.Scanner;

import java.lang.String;

public class Martina {

	public static void main(String[] args) {

		int[] g = { 1, 2, 3, 4 };
		int[] g1 = { 1, 2, 4, 3 };
		int[] g2 = { 1, 2, 3, 5, 6, 6, 6 };
		int[] g3 = { 1, 2, 3, 4, 6, 7, 0, 44 };
		char[] g4 = { '1', '2', '3', '8', 'u' };

		int[] c = creaRandom(10);

		int[] b = creaProgressivo(10, 66);

		riempiCostante(g3, 6);

		String s = new String(convertiStringa(g4));

		int[] d = taglia(10, g);

		int[] e = inverti(g);

		boolean f = confronta(g, g1);

		int h = frequenza(6, g2);

		boolean l = confrontaFrequenza(g, g1);

		int[][] n = creaMatrice(g);

		for (int i = 0; i < c.length; i++)

			System.out.println(c[i]);

		System.out.println("\n");

		for (int j = 0; j < b.length; j++)

			System.out.println(b[j]);

		System.out.println("\n");

		for (int j = 0; j < d.length; j++)

			System.out.println(d[j]);
		System.out.println("\n");

		for (int j = 0; j < g.length; j++)
			System.out.println(g3[j]);

		System.out.println("\n");

		for (int j = 0; j < e.length; j++)

			System.out.println(e[j]);
		System.out.println("\n");
		System.out.println(f);
		System.out.println("\n");
		System.out.println(h);
		System.out.println("\n");
		System.out.println(l);
		System.out.println("\n");

		for (int j = 0; j < n.length; j++) {
			for (int i = 0; i < n.length; i++) {
				System.out.print(n[j][i] + " ");
			}
			System.out.print("\n");
		}

		System.out.println("\n");
		System.out.println(s);
	}

	public static int[] creaRandom(int n) {

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {

			a[i] = (int) (Math.random() * 10);

		}

		return a;

	}

	public static int[] creaProgressivo(int n, int first) {

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {

			a[i] = first + i;

		}

		return a;

	}

	public static void riempiCostante(int[] g3, int c) {

		for (int i = 0; i < g3.length; i++) {

			g3[i] = c;

		}

	}

	public static String convertiStringa(char[] a) {
		char b[];
		b = new char[2 * a.length];
		int j = 0;
		for (int i = 0; i < 2 * a.length; i++) {
			if (i % 2 == 1) {
				b[i] = a[j];
				j++;
			} else
				b[i] = ' ';
		}

		String str = new String(b);

		return str;

	}

	public static int[] taglia(int n, int[] a) {

		int[] b;

		b = new int[n];

		if (a.length < n) {

			for (int i = 0; i < n; i++) {
				if (a.length > i)

					b[i] = a[i];

				else

					b[i] = 0;
			}

		}

		else

			for (int i = 0; i < n; i++) {

				b[i] = a[i];

			}
		return b;

	}

	public static int[] inverti(int[] a) {

		int[] b;

		b = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			b[i] = a[a.length - 1 - i];

		}

		return b;

	}

	public static boolean confronta(int[] a, int[] b) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i])
				j++;
		}

		if (j == a.length)
			return true;
		else
			return false;

	}

	public static int frequenza(int n, int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n)
				j++;
		}
		return j;
	}

	public static boolean confrontaFrequenza(int[] a, int[] b) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			int c = frequenza(a[i], a);
			int d = frequenza(a[i], b);
			if (c == d)
				j++;
		}

		if (j == a.length)
			return true;
		else
			return false;
	}

	public static int[][] creaMatrice(int[] a) {
		int[][] b;
		b = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				b[i][j] = a[j];
		}
		return b;
	}

}