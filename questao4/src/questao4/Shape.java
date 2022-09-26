package questao4;

import questao4.Color;

public abstract class Shape {
	private Color color;


	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public double area() {
		return -1;
	}
}
