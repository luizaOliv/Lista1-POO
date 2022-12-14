package questao5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String name;
	private String email;
	private java.util.Date birthDate;
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String toString() {
		return String.format("Client: %s (" + dateFormat.format(getBirthDate()) + ") - %s", getName(),getEmail());
	}
}
