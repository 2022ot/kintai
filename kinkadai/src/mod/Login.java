package mod;

public class Login {

	private String userId;
	private static String name;
	private static String pass;

	public Login(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public static Login getInstance() {
		return new Login(name,pass);
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
