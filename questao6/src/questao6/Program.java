package questao6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	  
       
	    System.out.printf("Digite o CPF: ");
	    PersonIndividual personIndividual = new PersonIndividual(sc.nextLine());
	    System.out.printf("Digite o CNPJ: ");
	    PersonLegal personLegal = new PersonLegal(sc.nextLine());
	    

	    System.out.println(personIndividual.isValid());
        System.out.println(personLegal.isValid());
        sc.close(); 

	}

}
