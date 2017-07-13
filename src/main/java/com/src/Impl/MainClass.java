package com.src.Impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	static{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static void main(String args[]){
		CrudOp db = new CrudOp();
		String insertQuery;
		
		String dropQuery="DROP TABLE SWAPNA IF EXISTS;";
		db.insert(dropQuery);
		
		String createQuery;
				createQuery = "CREATE TABLE SWAPNA " +
                "(id INTEGER not NULL, " +
                " name VARCHAR(255), " + 
                " PRIMARY KEY ( id ));";
		db.create(createQuery);
		
		insertQuery = "INSERT INTO SWAPNA " +
          		"VALUES (1, 'SWAPNA');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO SWAPNA " +
                "VALUES (2, 'Samith');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO SWAPNA " +
                "VALUES (3, 'Shrey');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO SWAPNA " +
                "VALUES (4, 'Prakhar');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO SWAPNA " +
                "VALUES (5, 'Praveen');";
		db.insert(insertQuery);
		try {
			db.selectvalues();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
