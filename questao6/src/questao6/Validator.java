package questao6;

import java.util.Scanner;

import questao6.PersonIndividual;
import questao6.PersonLegal;

public class Validator {
	public static void runValidation(IEntityValidator e) {
        if(e.isValid()) {
            System.out.println("VALID");
        } 
        else {
            System.out.println("INVALID");
        }
        
	  }

}
