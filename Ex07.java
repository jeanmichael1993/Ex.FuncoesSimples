import java.util.Scanner;
import java.util.Locale;

public class Ex07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double peso, altura;
		System.out.println("Digite seu peso:");
		peso = sc.nextDouble();
		System.out.println("Digite sua altura:");
		altura = sc.nextDouble();

		IMC(peso, altura);

		sc.close();
	}

	public static void IMC(double peso, double altura) {

		double total = 0;

		total = (peso / Math.pow(altura, 2));
		teste(total);

	}

	public static void teste(double total) {

		if (total < 20) {
			System.out.println("Classificação: abaixo do peso");

		}

		else if (total >= 20 && total < 25) {

			System.out.println("Classificação: peso normal");

		} else if (total >= 25 && total < 30) {

			System.out.println("Classificação: sobre peso");

		}

		else {

			System.out.println("Classificação: obeso");
		}

	}

}
