package test;
import java.sql.*;


public class testjava {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test_java?user=root&password=cocito2022");

			System.out.println("connessione aperta");

			Statement stmt = connection.createStatement();

			String script="INSERT INTO categorie(codice, descrizione) VALUES (3,'Prova J connessione')";

			stmt.executeUpdate(script);

			stmt.close();

			connection.close();

			}

			catch(SQLException ex) {

			ex.printStackTrace();

			}

		try {

		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test_java?user=root&password=cocito2022");

		System.out.println("connessione aperta");

		Statement stmt = connection.createStatement();

		String script="SELECT * FROM test_java";

		ResultSet item=stmt.executeQuery(script);

		while(item.next()) {

		System.out.println(item.getInt("id")+" "+item.getString("DESCRIZIONE"));

		System.out.println(item.getInt(1)+" "+item.getString(2));

		}

		stmt.close();

		connection.close();

		}

		catch(SQLException ex) {

		ex.printStackTrace();

		}
	}

}
