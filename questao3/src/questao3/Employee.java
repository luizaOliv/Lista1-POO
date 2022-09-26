package questao3;

public class Employee {
		public String name;
		public double grossSalary;
		public double tax;
		
		public double netSalary() {
			return grossSalary - tax;
		}
		
		public double increaseSalary(double percentage) {
			return grossSalary + (grossSalary * percentage/100.0);
			
		}
		
	

}
