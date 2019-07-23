package edunova;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpajanjeNaMariaDB {
	
	private Connection veza;
	
	public Connection getVeza() {
		return veza;
	}


	public void setVeza(Connection veza) {
		this.veza = veza;
	}


	public SpajanjeNaMariaDB() {
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			veza = DriverManager.getConnection(
					"jdbc:mariadb://localhost/edunovaj20",
					"edunova","edunova");
			//System.out.println(veza.getMetaData().getCatalogTerm());
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		
		//citajIzBaze();
		
		
//		try {
//			veza.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
	
	
	private void citajIzBaze() {
		
		try {
			PreparedStatement izraz = veza.prepareStatement(
					"select * from smjer");
			
		 ResultSet rs =	izraz.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("naziv")
						+ " " + rs.getBigDecimal("cijena"));
			}
			rs.close();
			
			//izvu�i sumu svih cijena
			//1. na�in SQL
			izraz = veza.prepareStatement(
					"select sum(cijena) as ukupno from smjer");
			rs=izraz.executeQuery();
			rs.next();
			BigDecimal ukupno = rs.getBigDecimal("ukupno");
			rs.close();
			System.out.println(ukupno);
			
			//2. na�in java
			izraz=veza.prepareStatement("select cijena from smjer");
			rs = izraz.executeQuery();
			//BigDecimal uk = new BigDecimal(0);
			BigDecimal uk = BigDecimal.ZERO;
			while(rs.next()) {
				uk=uk.add(rs.getBigDecimal("cijena"));
			}
			rs.close();
			System.out.println(uk);
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}


	public static void main(String[] args) {
		new SpajanjeNaMariaDB();
	}

}
