package controller;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import model.models;


public class controllers {

public boolean save(models s) {

boolean result= false;

String url="jdbc:mysql://localhost/hotel";

try {

Connection conn = DriverManager.getConnection(url,"root","");

String sql = "SELECT * FROM customer WHERE Username=? and Password=?";

PreparedStatement stat = conn.prepareStatement(sql);


stat.setString(1, s.getUsername());

stat.setString(2, s.getPassword());

stat.executeQuery();

stat.close();

conn.close();

result = true;

}

catch(Exception e) {

System.out.println("Error: "+e.getMessage());
}

return result;

}
}