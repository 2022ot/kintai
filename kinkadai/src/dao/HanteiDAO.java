package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mod.Hantei;

public class HanteiDAO {

	public boolean saveToDatabase(Hantei hantei) throws ClassNotFoundException {

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kintai", "root", "1234");

			String sql = "INSERT INTO TIMEMANAGEMENT(userID,hantei)VALUES(?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setString(1, hantei.getUserId());
			pStmt.setString(2, hantei.getHantei());

			int result=pStmt.executeUpdate();

			if(result !=1){
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}

}
