package mod;

import dao.NewAccountDAO;

public class Accountlogic {
	public static void execute(User user) {
		NewAccountDAO dao = new NewAccountDAO();
		try {
			user = dao.saveToDatabase(user);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
