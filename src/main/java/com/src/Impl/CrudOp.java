package com.src.Impl;

import java.sql.*;

import com.src.service.*;


public class CrudOp implements Operations{
	
	DBConnectImpl db;
	Connection con;
	Statement stmt;
	
	CrudOp(){
		db = new DBConnectImpl();
	}
	
	public void create(String query){
		
		con = db.dbConnect();
		if(con!=null){
			try {
				stmt=con.createStatement();
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void insert(String query){
		con = db.dbConnect();
		if(con!=null){
			try {
				stmt=con.createStatement();
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void delete(String query){
		con = db.dbConnect();
		if(con!=null){
			try {
				stmt=con.createStatement();
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void selectvalues() throws ClassNotFoundException {
		
		con = db.dbConnect();
		if(con!=null){
			try{
				stmt = con.createStatement();
			    
				String sql = "SELECT * FROM SOURAV" ;
				ResultSet rs = stmt.executeQuery(sql); 

				while(rs.next()){
			        //Retrieve by column name
			        int id  = rs.getInt("id");
			     
			        String name = rs.getString("name");
			        

			        //Display values
			        System.out.print("ID: " + id);
			       
			        System.out.print("Name: " + name);
			        
				}
			    
				}
				catch(SQLException se){
					   
				    se.printStackTrace();
				 }
			finally{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
