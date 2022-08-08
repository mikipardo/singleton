package SINGLETON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDController {
	
	private static Connection conexion = null;

	private BDController() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Connection getInstance() {
		
		try {
			if(conexion == null) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/fifa", "root", "");
					System.out.println("va bene");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error en Driver Manager");
				}
				// este comentario es para vver si funciona
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion;
	}

}
