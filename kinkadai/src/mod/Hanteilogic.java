package mod;

import dao.HanteiDAO;

public class Hanteilogic {
	public void execute(Hantei hantei) {
		HanteiDAO dao = new HanteiDAO();
		Hantei hantei= dao.saveToDatabase(hantei);
		return;
	}
}
