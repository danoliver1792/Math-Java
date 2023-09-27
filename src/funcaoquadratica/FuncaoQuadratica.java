package funcaoquadratica;

import java.util.Scanner;

public class FuncaoQuadratica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		double a = input.nextDouble();
		
		System.out.print("Digite o valor de b: ");
		double b = input.nextDouble();
		
		System.out.print("Digite o valor de c: ");
		double c = input.nextDouble();
		
		double delta = calcularDelta(a, b, c);
		
		if (delta < 0) {
			System.out.println("A equacao nao possui raizes reais.");
		} else if (delta == 0){
			double x1 = calcularRaizUnica(a, b);
			System.out.println("A equacao possui uma raiz real: x = " + x1);
		} else {
			double x1 = calcularRaiz1(a, b, delta);
			double x2 = calcularRaiz2(a, b, delta);
			System.out.println("A equacao possui duas raizes reais: x1 = " + x1 + " e x2 = " + x2);
		}
		
		double Xv = calcularXVertice(a, b);
		double Yv = calcularYVertice(a, delta);
		
		System.out.println("As coordenadas do vertice sao: Xv = " + Xv + " e Yv " + Yv);
		
		input.close();

	}
	
	public static double calcularDelta(double a, double b, double c) {
		return b * b - 4 * a * c;
	}
	
	public static double calcularRaizUnica(double a, double b) {
		return -b / (2 * a);
	}
	
	public static double calcularRaiz1(double a, double b, double delta) {
		return (-b + Math.sqrt(delta)) / (2 * a);
	}
	
	public static double calcularRaiz2(double a, double b, double delta) {
		return (-b - Math.sqrt(delta)) / (2 * a);
	}
	
	public static double calcularXVertice(double a, double b) {
		return -b / (2 * a);
	}
	
	public static double calcularYVertice(double a, double delta) {
		return -delta / (4 * a);
	}

}
