package questao2;

import java.util.Locale;

import java.util.Scanner;

import questao2.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Retangulo rectangle = new Retangulo();
		System.out.println("Digite a largura e a altura do retângulo:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
	
		System.out.println("Área = " + String.format("%.2f", rectangle.area()));
		System.out.println("Perímetro = " + String.format("%.2f", rectangle.perimeter()));
		System.out.printf("Diagonal = " + String.format("%.2f", rectangle.diagonal()));
		sc.close();
	}
}