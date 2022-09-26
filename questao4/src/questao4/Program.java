package questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import questao4.Shape;
import questao4.Rectangle;
import questao4.Circle;
import questao4.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();
		List<Shape> shapes = new ArrayList<>();
		for(int i = 0; i < numberOfShapes; i++) {
			System.out.printf("Shape %d data: %n",i + 1);
			System.out.print("Rectangle or circle (r/c)? ");
			sc.nextLine(); 
            String ShapeType = sc.nextLine();
			System.out.print("Color(Black/Blue/Red): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			if(ShapeType.equals("c")) {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
			} 
			else {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle(color,width, height));
			}
		}
		System.out.println();
		System.out.println("Shape areas:");
		for(Shape shape: shapes) {
			System.out.printf("Area: %.2f%n", shape.area());
		}
		sc.close();
	}


	}

