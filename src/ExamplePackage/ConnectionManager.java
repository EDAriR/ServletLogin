package ExamplePackage;

import java.sql.*;
import java.util.*;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionManager {
	
	/*
	 * Replace
	 * "DataSource" with your Data Source name
	 * "username" with your SQL Server username
	 * "password" with your SQL Server password	
	 */
	
	   static Connection con;
	      static String url;
	            
	      public static Connection getConnection()
	      {
	  		try {
				Context ctx = new javax.naming.InitialContext();
				DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB");

				con = ds.getConnection();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}

}
