package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mod.Loginlogic;

public class LoginDAO {

	private final String DRIVER_NAME=("com.mysql.jdbc.Driver");
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/kintai";
	private final String DB_USER = "root";
	private final String DB_PASS = "1234";

	public List<Loginlogic>findAll(){
	Connection conn=null;
	List<Loginlogic> login=new ArrayList<Loginlogic>();
	try {
		Class.forName(DRIVER_NAME);
		conn=DriverManager.getConnection(
				JDBC_URL,DB_USER,DB_PASS);

		String sql="SELECT*FROM";
		PreparedStatement pStmt=conn.prepareStatement(sql);

		ResultSet rs=pStmt.executeQuery();

		while(rs.next()) {
			int id=rs.getInt("ID");
			String userName=rs.getString("NAME");
			String pass=rs.getString("PASS");
			Loginlogic loginlogic=new Loginlogic(id,userName,pass);
			login.add(loginlogic);
		}
	}catch(SQLException e) {
		e.printStackTrace();
		return null;
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
		return null;
	}finally {
		if(conn!=null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
	return login;
}

	public boolean create(Loginlogic loginlogic) {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(
					JDBC_URL,DB_USER,DB_PASS);

			String sql="INSERT INTO Logiclogic(NAME,PASS)VALUES(?,?)";
			PreparedStatement pStmt=conn.prepareStatement(sql);

			pStmt.setString(1, loginlogic.getUserName());
			pStmt.setString(2, loginlogic.getPass());

			int result=pStmt.executeUpdate();

			if(result!=1) {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}
}
