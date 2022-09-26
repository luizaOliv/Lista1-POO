package questao8;

public class Grades {
	public double valor;
    public String Subject;

    public Grades(double valor, String subject) {
        this.valor = valor;
        this.Subject = subject;

        if(!IsNotaValid()) {
            System.out.println("Nota invalida");
            System.exit(1);
        }
        if(!isNomeDoAssuntoValid()) {
            System.out.println("Nome do assunto invalido");
            System.exit(1);
        }
    }

    public boolean IsNotaValid() {
        return valor >= 0 && valor <= 10;
    }

    public boolean isNomeDoAssuntoValid() {
        return Subject.length() != 0;
    }

    @Override
    public String toString() {
        return String.format("%s: %f", Subject, valor);
    }
}
