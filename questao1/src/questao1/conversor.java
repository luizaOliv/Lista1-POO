package questao1;

public class conversor {
	public static final double IOF = 0.06;
	public static double price;
	public static double dollars;
	public static double i;
	public static double absolute;

	public static double quotation(double price, double dollars) {
		return i = price * dollars * IOF;

	}

	public static double total(double price, double dollars) {
		return absolute = price * dollars;

	}

	public static String inReais() {
		return "Amount to be paid in reais = " + String.format("%.2f", i + absolute);
	}

}
