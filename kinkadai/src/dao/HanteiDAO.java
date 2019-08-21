package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mod.Hantei;

public class HanteiDAO {

	public Hantei saveToDatabase(Hantei hantei) throws ClassNotFoundException {

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kintai", "root", "1234");

			String sql = "INSERT INTO TIMEMANAGEMENT(userId,hantei)VALUES(?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setInt(1, hantei.getUserId());
			pStmt.setString(2, hantei.getHantei());

			//System.out.println(hantei.getUserId() + hantei.getHantei());

			if(pStmt.executeUpdate() != 0) {
				//System.out.println("データベースに保存かんりょおおおお");
			}


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return hantei;
	}
}
