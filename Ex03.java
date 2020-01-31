import java.util.Scanner;
import java.util.Locale; 

public class Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	   double vi,ve;
	   int p;
		
	   vi = sc.nextDouble();
	   ve = sc.nextDouble();
	   p = sc.nextInt();
		mostrarValorDaPrestacao(vi, ve, p);
		
		
		sc.close();
		
		
	}
	
	
	/**
	* Imprime na tela o valor de cada prestação do financiamento, sem considerar juros
	* @param va Valor do imóvel

	* @param ve Valor da entrada
	* @param p Quantidade de prestações
	*/
	public static void mostrarValorDaPrestacao(double vi, double ve, int p) {
		
		double total;
		
		total = vi - ve;
		total = total / p;
		System.out.printf("%.2f", total);
		
	}
	
}
