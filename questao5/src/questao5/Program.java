package questao5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import questao5.Client;
import questao5.Order;
import questao5.OrderItem;
import questao5.Product;
import questao5.OrderStatus;

public class Program {

	public static void main(String[] args)throws ParseException {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (dd/mm/yyyy): ");
		java.util.Date birthDate = dateFormat.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		Date momment = new Date();;
		
		Order order = new Order(momment, OrderStatus.valueOf(status.toUpperCase()),client);
		
	
		System.out.print("How many items to this order?");
		int numberOfItems = sc.nextInt();
		for(int i = 1; i <= numberOfItems; i++) {
			System.out.printf("Enter the product #%d data %n", i);
			System.out.print(" Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			Product product = new Product(productName, price);
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, price, product);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER :");
		System.out.println(order);
		sc.close();

	}

}
