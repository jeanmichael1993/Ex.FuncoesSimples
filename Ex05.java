import java.util.Scanner;
import java.util.Locale;

public class Ex05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		tabuada(n);

		sc.close();

	}

	public static void tabuada(int n) {

		int[] soma = new int[11];
		for (int i = 1; i < 11; i++) {

			soma[i] = n + i;
		}

		for (int i = 1; i <= 10; i++) {

			System.out.printf("%d + %d = %d%n", n, i, soma[i]);

		}

	}

}
