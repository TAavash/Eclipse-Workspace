package controllers;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import models.model;

public class controller {

public boolean save(model student) {

boolean result= false;

String url="jdbc:mysql://localhost/jdvc demo";

try {

Connection conn = DriverManager.getConnection(url,"root","");

String sql = "INSERT INTO student VALUES(?,?,?)";

PreparedStatement stat = conn.prepareStatement(sql);

stat.setInt(1, student.getSid());


stat.setString(2, student.getName());

stat.setString(3, student.getCourse());

stat.executeUpdate();

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