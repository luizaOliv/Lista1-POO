package questao6;


public class PersonIndividual extends Person {
	private String CPF;

    public PersonIndividual(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return String.format("{Individual}, CPF: %s", CPF);
    }

    public boolean isValid() {
    	if (ValidatorCpf.isCPF(CPF) == true)
            System.out.printf("%s\n", ValidatorCpf.printCPF(CPF));
        else System.out.printf("Erro, CPF invalido !!!\n"); 
    }
}
