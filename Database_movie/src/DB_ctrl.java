import java.sql.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DB_ctrl {
	
	
	
	public static String[] getSearch(String table_name, DefaultTableModel model) {
		DB_connect db = new DB_connect();
		
		String [] row = new String[50];
		Statement stmt;
		stmt = db.db_connect(); //데이터베이스 연결하기
		int count = 0;
		
		try {
			// 쿼리문 
			ResultSet rs = stmt.executeQuery("select * from "+table_name);
			
			// 테이블의 row 수 얻어 오기 
			ResultSetMetaData rsmd = rs.getMetaData();
			count = rsmd.getColumnCount();
			
			
			System.out.println(count);
			while (rs.next()) 
			{
				// row 값읽기
				for (int i = 1; i <=count ; i++) 
				{ 
					row[i-1] = rs.getString(i); 
				}
				
				//System.out.println(); // JTable에출력 
				model.addRow(row); 
			}
		}
		catch( SQLException e) {
			System.out.println( "예외 발생 error\r\n" + e);
		}
		return row;
	}


}

