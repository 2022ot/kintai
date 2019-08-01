package mod;

import dao.HanteiDAO;

public class Hanteilogic {
	public void execute(Hantei hantei){
		HanteiDAO dao = new HanteiDAO();
		try {
			hantei = dao.saveToDatabase(hantei);
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
