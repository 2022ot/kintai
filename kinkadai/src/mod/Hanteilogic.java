package mod;

import dao.HanteiDAO;

public class Hanteilogic {
	public boolean execute(Hantei hantei) {

		HanteiDAO dao = new HanteiDAO();
		Hantei hantei1 = dao.saveToDb(hantei1);
		return null;
	}


}
