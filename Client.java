
public class Client {
	private String id;
	private String phone;
	
	public Client(String id, String phone) {
		this.id = id;
		this.phone = phone;
	}
	public String getId() {
		return this.id;	
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		if(phone.length() < 5) {
			this.phone = phone;
		} else {
			System.out.println("Falure : número do fone deve conter 4 dígitos.");
		}
	}
}
