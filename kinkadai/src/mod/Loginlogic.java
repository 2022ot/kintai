package mod;

import java.io.Serializable;

public class Loginlogic implements Serializable {
		private int id;
		private String userName;
		private String pass;

		public Loginlogic() {}
		public Loginlogic(String userName,String pass) {
			this.userName=userName;
			this.pass=pass;
		}
		public Loginlogic(int id,String userName,String pass) {
			this.id=id;
			this.userName=userName;
			this.pass=pass;
		}
		public int getId() {return id;}
		public String getUserName() {return userName;}
		public String getPass() {return pass;}

}
