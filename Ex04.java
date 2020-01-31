import java.util.Scanner;
import java.util.Locale;

public class Ex04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		online(n);

		sc.close();
	}

	public static void online(int n) {

		for (int i = 0; i < n; i++) {

			System.out.println("Online ou offline?");
		}

	}

}
