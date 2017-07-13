package com.src.Impl;

import java.sql.*;

import com.src.service.DBConnection;

public class DBConnectImpl implements DBConnection {
	   String JDBC_DRIVER;  
	   String DB_URL;
	   String USER;
	   String PASS;
	   Connection conn;
	   
	   DBConnectImpl()
	   {
		   JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   DB_URL = "jdbc:mysql://trainingdb.c4hhsbxtkfor.ap-south-1.rds.amazonaws.com:3306/trainingTable";
		   USER = "root";
		   PASS = "mypassword";
		   try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	   }
	   
	   public Connection dbConnect()
	   {
		   conn = null;
		   try{
			   conn = DriverManager.getConnection(DB_URL, USER, PASS);
		   }catch(SQLException se){
			    return null;
		   }catch(Exception e){
			    return null;
		   }
		   return conn;
	   }
	   
	   
	   
	   
}
