import java.sql.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DB_ctrl {
	
	
	
	public static String[] getSearch(String table_name, DefaultTableModel model) {
		DB_connect db = new DB_connect();
		
		String [] row = new String[50];
		Statement stmt;
		stmt = db.db_connect(); //�����ͺ��̽� �����ϱ�
		int count = 0;
		
		try {
			// ������ 
			ResultSet rs = stmt.executeQuery("select * from "+table_name);
			
			// ���̺��� row �� ��� ���� 
			ResultSetMetaData rsmd = rs.getMetaData();
			count = rsmd.getColumnCount();
			
			
			System.out.println(count);
			while (rs.next()) 
			{
				// row ���б�
				for (int i = 1; i <=count ; i++) 
				{ 
					row[i-1] = rs.getString(i); 
				}
				
				//System.out.println(); // JTable����� 
				model.addRow(row); 
			}
		}
		catch( SQLException e) {
			System.out.println( "���� �߻� error\r\n" + e);
		}
		return row;
	}


}

