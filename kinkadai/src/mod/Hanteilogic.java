package mod;


public class Hanteilogic {
	public boolean execute(Hantei hantei) {//booleanからvoidへ変更

		String syu="syu";//文字型のsyu
		String ki="ki";//文字型のki


		if(syu.equals(syu)) {//もしsyuがloginOkと同じsyuなら
			hantei="syu";//データベースhanteiカラムに入れる
			}else {//違ったら
				hantei="ki";//データベースのhanteiカラムに入れる
			}
		/**HanteiDAO dao = new HanteiDAO();
		Handan handan = dao.saveToDb(handan);
		return handan!=null;*/
		return false;

	}
}
