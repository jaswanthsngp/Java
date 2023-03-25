import java.sql.*;

// requires to include class path "C:\Program Files\Java\mysql-connector-j-8.0.32\mysql-connector-j-8.0.32.jar"
// while execution on terminal
// java -cp "C:\Program Files\Java\mysql-connector-j-8.0.32\mysql-connector-j-8.0.32.jar" mysqlConnector.java
class Main {
	public static void main(String arg[])
	{
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/alltables",
				"root", "1234");

			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery("select * from car");
            // result of excecuted query is stored in resultSet
			while (resultSet.next()) {
                // Data can be extracted using column name
				String regNo= resultSet.getString("regNo");
				String man= resultSet.getString("manufacturer");
				String model= resultSet.getString("model");
				int seats= resultSet.getInt("seats");
				System.out.println(regNo+" "+man+" "+model+" "+seats);
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
