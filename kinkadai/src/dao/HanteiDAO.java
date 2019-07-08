package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import mod.Hantei;

public class HanteiDAO {

	public Hantei saveToDb(Hantei hantei) {

	Connection conn=null;
	Hantei hantei=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/kintai", "root", "1234");

		String sql="INSERT INTO TIMEMANAGEMENT(userID,hantei)VALUES(?,?)"
				PreparedStatement pStmt=conn.prepareStatement(sql);

				pStmt.setString(1,hantei.getUserId());
				pStmt.setboolean(2,hantei.getHantei());

				int result=pStmt.executeUpdate();

	}

		return null;
	}

}
