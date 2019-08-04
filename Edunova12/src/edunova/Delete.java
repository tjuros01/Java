package edunova;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	private Connection connection;
	private PreparedStatement preparedStatement;

	public Delete() {
		connection=Baza.getConnection();
		System.out.println(primjer1());
	}
	
	private int primjer1() {
		try {
			preparedStatement = connection.prepareStatement(
					"delete from smjer where sifra=?");
			preparedStatement.setInt(1, 100);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static void main(String[] args) {
		new Delete();
	}
	
}
