package questao6;

public class Person implements IEntityValidator {
	
	@Override
    public String toString() {
        return "Type: Person";
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
