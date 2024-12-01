package controller;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.loginmodel;
public class managercontroller {

	public boolean save(loginmodel log) {

		boolean result= false;
		String url = "jdbc:mysql://localhost:/luton";
		try {
		Connection conn = DriverManager.getConnection(url, "root", "");
		String sql = "select * from manager where username=? and password=?;";
		PreparedStatement pstat = conn.prepareStatement(sql);

		pstat.setString(1, log.getUsername());
		pstat.setString(2, log.getPassword());
		ResultSet rs=pstat.executeQuery();//Save
		if (rs.next()) {
		  rs.close();
		pstat.close();
		conn.close();
		result=true;
		}
		pstat.close();
		conn.close();
		}
		catch(Exception ex) {
		System.out.println("Error : "+ex.getMessage());
		}
		return result;

		}

		}

