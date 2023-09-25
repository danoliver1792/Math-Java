package combination;

import java.util.Scanner;

public class SimpleCombination {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero de elementos do conjunto (n): ");
		int n = scanner.nextInt();
		
		System.out.print("Digite o numero do subconjunto (r): ");
		int r = scanner.nextInt();
		
		scanner.close();
		
		long resultado = calcularCombinacao(n, r);
		
		System.out.println("C(" + n + ", " + r + ") = " + resultado);

	}
	
	public static long calcularCombinacao(int n, int r) {
		// se r for negativo ou maior que n, vai retornar 0
		if (r < 0 || r > n) {
			return 0;
		}
		
		return fatorial(n) / (fatorial(r) * fatorial(n - r));
	}
	
	public static long fatorial(int num) {
		// quando num é igual a 0 ou 1, sabemos que o fatorial de 0 e 1 é 1
		if (num <= 1) {
			return 1;
		} else {
			// calculando o fatorial recursivamente para num maior que 1
			return num * fatorial(num - 1);
		}
	}

}
