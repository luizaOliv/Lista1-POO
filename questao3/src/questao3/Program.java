package questao3;

import java.util.Locale;

import java.util.Scanner;

import questao3.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " +  emp.name + ", $" + String.format("%.2f", emp.netSalary()));
        System.out.println();
        System.out.print("Em quantos % o salário irá aumentar?");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        
        System.out.println();
        
        System.out.println("Informações: " + emp.name + ", $" + String.format("%.2f", emp.increaseSalary(percentage)));
        
        }
}
