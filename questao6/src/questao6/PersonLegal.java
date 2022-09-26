package questao6;


public class PersonLegal extends Person {
	 	private String CNPJ;

	    public PersonLegal(String CNPJ) {
	        this.CNPJ = CNPJ;
	    }

	    @Override
	    public String toString() {
	        return String.format("{Legal}, CNPJ: %s", CNPJ);
	    }

	    
	    public boolean isValid() {
	    	if (ValidatorCnpj.isCNPJ(CNPJ) == true)
	    		System.out.printf("%s\n", ValidatorCnpj.printCNPJ(CNPJ));
	    	else System.out.printf("Erro, CNPJ inválido !!!\n");
	    }
}
