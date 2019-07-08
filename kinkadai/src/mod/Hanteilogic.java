package mod;

import dao.HanteiDAO;

public class Hanteilogic {
	public boolean execute(Hantei hantei) {

		HanteiDAO dao = new HanteiDAO();
		Hantei hantei = dao.saveToDb(hantei);
		return null;
	}


}
