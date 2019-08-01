package mod;

import java.util.Date;

public class Hantei {

	private int userId;
	private String hantei;
	private Date time = new Date();

	public Hantei(int userId,String hantei,Date time) {
		this.setUserId(userId);
		this.setHantei(hantei);
		this.setTime(time);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getHantei() {
		return hantei;
	}

	public void setHantei(String hantei) {
		this.hantei = hantei;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
