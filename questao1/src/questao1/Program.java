package questao1;

import java.util.Locale;
import java.util.Scanner;

import questao1.conversor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price, dollars;

		System.out.print("What is the dollar price? ");
		price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		dollars = sc.nextDouble();

		conversor.quotation(price, dollars);
		conversor.total(price, dollars);

		System.out.println(conversor.inReais());

		sc.close();
	}
}
