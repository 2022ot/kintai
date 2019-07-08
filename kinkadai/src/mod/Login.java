package mod;

public class Login {

	private String userId;
	private String name;
	private String pass;

	public Login(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}


	public String getUserId() {
		return userId;
	}

	public String getPass() {
		return pass;
	}

}
