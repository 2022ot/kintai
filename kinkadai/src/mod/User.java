package mod;

import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String name;
	private String password;

	public int id() {return id;}
	public String getName() {return name;}
	public String getPass() {return password;}

}
