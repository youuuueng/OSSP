import java.io.*;
import java.lang.*;
import java.sql.*;



public class DB_connect {
	
	final String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	 // DB 계정 - 비밀 번호 
	final String db_id = "youeng";
	final String db_password = "1234";
	Connection conn = null;
	Statement stmt = null; 
	
	public Statement db_connect() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn = DriverManager.getConnection(jdbc_url, db_id, db_password); //DB 연결
			System.out.println( "DB연결완료. " );	
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); 
			
			
		} catch( ClassNotFoundException e ) {
			System.out.println( "해당드라이버를찾을수없습니다.\n" + e);
		} catch( SQLException e) {
			System.out.println( "해당드라이버를찾을수없습니다.\n" + e);
		}
		
		return stmt;
	}


}