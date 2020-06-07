package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Customer {
	public static void main(String[] args) {
		getConnection();
		createTable();
		
//		createCustomer("test", "12345678", "Female", "23", "zZzzZZZZZzZz");
//		ArrayList<String> list = getCustomers();
//		for(String item : list) {
//			System.out.println(item);
//		}
//		
//		createCustomer("bora", "12345678", "Female", "25", "important");
//		for(String item : list) {
//			System.out.println(item);
//		}
	}

	public static String[][] getCustomers(){
		try {
			Connection con =getConnection();
			PreparedStatement statement = con.prepareStatement("Select name, phone, gender,age,note FROM customer");
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("name"),
						results.getString("phone"),
						results.getString("gender"),
						results.getString("age"),
						results.getString("note")		
				});
				//list.add("Name: "+results.getString("name")+"Phone: "+results.getString("phone")+"Gender: "+results.getString("gender"));
				
			}
			System.out.println("The data has been fetched");
			String[][]arr = new String[list.size()][5];
			return list.toArray(arr);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
		}
	public static void createCustomer(String name, String phone, String gender, String age,String note) {
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement("INSERT INTO customer"
							+"(name,phone,gender,age,note)" 
							+ "VALUE" 
							+ "('"+name+"','"+phone+"','"+gender+"','"+age+"','"+note+"')");
			insert.executeUpdate();
			System.out.println("The data has been saved!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void createTable() {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
					+"customer(id int NOT NULL AUTO_INCREMENT,"
					+"name varChar(255),"
					+"phone varChar(255),"
					+"gender varChar(255),"
					+"age varChar(255),"
					+"note varChar(255),"
					+"PRIMARY KEY(id))");
			create.execute();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Table successfully created");
		}
	} 
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql9.freemysqlhosting.net:3306/sql9345420";
			String user = "sql9345420";
			String pass = "RSy7q2nKNT";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("The Connction Successful");
			return con;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
}
