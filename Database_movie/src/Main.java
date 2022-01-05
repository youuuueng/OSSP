import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;


//영화 정보 panel을 만드는 class
class moviePanel extends JPanel{
	moviePanel()
	{
		String col_movie[] = {"영화제목", "영화개봉일", "상영시간", "등급코드" }; 
		
		// 모델 생성
		DefaultTableModel model1 = new DefaultTableModel(col_movie, 0); 
	
		// 테이블 생성
		JTable table1 = new JTable(model1); 
		
		// 배치는 자유롭게 
		setLayout(null);
		String tname = "movie";
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl(); 
		
		//label 생성
		JLabel table_name = new JLabel("영화 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		//버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		// 버튼 누르면 액션 실행
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dc.getSearch(tname, model1);
			}
		});
		
	
		// 추가버튼 누르면 실행 ( 추가 메소드까지 연결되지는 않음) 
		insert.addActionListener(new insert_btn());
		
		// 버튼 추가
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		// 스크롤 생성 및 추가
		JScrollPane jp = new JScrollPane(table1);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
	}
}

//추가 버튼을 누르면 실행되는 액션리스너
class insert_btn implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		M_insert m = new M_insert();
		m.setVisible(true);
	}
}



//배우 정보 panel을 만드는 class
class actorPanel extends JPanel{
	actorPanel()
	{
		String col_actor[] = { "배우이름", "성별", "생년월일", "국적"}; 
		
		// 모델 생성
		DefaultTableModel model2 = new DefaultTableModel(col_actor, 0); 
		
		// 테이블 생성
		JTable table2 = new JTable(model2); 
		String row2[];
		
		// 배치는 자유롭게
		setLayout(null);
		String tname = "actor";
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl(); 
		
		
		JLabel table_name = new JLabel("배우 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// 버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		
		// 버튼 폰트 설정
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		// 버튼 위치 설정
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		
		// 검색 버튼 액션 리스너 
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model2);
			}
		});
		
		// 추가 버튼 액션 리스너
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
			}
		});
		
		// 버튼 추가
		add(search);
		add(insert);
		add(delete);
		add(alter);
		

		// 스크롤 생성 및 추가
		JScrollPane jp = new JScrollPane(table2);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
		

	}
}



//감독 정보 panel을 만드는 class
class directorPanel extends JPanel{
	directorPanel()
	{
		
		String col_director[] = { "감독코드", "감독이름", "생년월일", "국적"}; 	
		
		//모델 생성
		DefaultTableModel model3 = new DefaultTableModel(col_director, 0); 		
		// Create Table
		JTable table3 = new JTable(model3); 
		String row3[];
		
		// 배치는 자유롭게
		setLayout(null);
		String tname = "director";
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl(); 		

		
		JLabel table_name = new JLabel("감독 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// 버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		// 버튼 폰트 설정 
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		// 검색 버튼 액션 리스너
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model3);
			}
		});
		
		
		// 버튼 위치 설정
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		// 버튼 추가
		add(search);
		add(insert);
		add(delete);
		add(alter);

		// 스크롤 생성 및 추가
		JScrollPane jp = new JScrollPane(table3);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		

	}

}


//제작사 정보 panel을 만드는 class
class producerPanel extends JPanel{
	producerPanel()
	{

		String col_producer[] = { "제작사코드", "제작사이름", "주소"}; 
		
		//모델 생성 
		DefaultTableModel model4 = new DefaultTableModel(col_producer, 0); 
		
		//테이블 생성
		JTable table4 = new JTable(model4);	
		String row4[];
		
		// 배치는 자유롭게 
		setLayout(null);
		String tname = "producer";
		
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl(); 		
		
		JLabel table_name = new JLabel("제작사 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// 버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		// 버튼 폰트 설정
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		// 검색 버튼 액션 리스너 
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model4);
			}
		});
		
		
		// 버튼 위치 설정
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		
		// 버튼 추가 
		add(search);
		add(insert);
		add(delete);
		add(alter);


		// 스크롤 생성 및 추가
		JScrollPane jp = new JScrollPane(table4);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		

	}
}



//장르 정보 panel을 만드는 class
class genrePanel extends JPanel{
	genrePanel()
	{

		String col_genre[] = { "장르코드", "장르명"}; 
		
		// 모델 생성
		DefaultTableModel model5 = new DefaultTableModel(col_genre, 0); 
		
		// 테이블 생성
		JTable table5 = new JTable(model5); 
		String row5[];
	
		// 배치는 자유롭게 
		setLayout(null);
		String tname = "GENRE";
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl(); 	

		
		JLabel table_name = new JLabel("장르 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// 버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		// 버튼 폰트 설정 
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		// 버튼 위치 설정
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		// 검색 버튼 액션 리스너
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model5);
			}
		});
		
		// 버튼 추가
		add(search);
		add(insert);
		add(delete);
		add(alter);
		

		// 스크롤 생성 및 추가
		JScrollPane jp = new JScrollPane(table5);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
	}
}



//등급 정보 panel을 만드는 class
class gradePanel extends JPanel{
	gradePanel()
	{

		String col_grade[] = { "등급코드", "등급명"}; 
		
		// 모델 생성
		DefaultTableModel model6 = new DefaultTableModel(col_grade, 0); 

		// 테이블 생성 
		JTable table6 = new JTable(model6); 	
		String row6[];
	
		// 배치는 자유롭게 
		setLayout(null);
		String tname = "GRADE";
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl(); 

		
		JLabel table_name = new JLabel("등급 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// 버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		// 버튼 폰트 설정 
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		// 버튼 위치 설정
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		// 검색 버튼 액션 리스너 
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model6);
			}
		});
		
		
		// 버튼 추가 
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		
		// 스크롤 생성 및 추가
		JScrollPane jp = new JScrollPane(table6);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
	}
}




//영화-장르 정보 panel을 만드는 class
class Movie_Genre_Panel extends JPanel{
	Movie_Genre_Panel()
	{

		String col_movie_genre[] = { "영화이름","영화개봉일", "장르코드"}; 
		// 모델 생성
		DefaultTableModel model5 = new DefaultTableModel(col_movie_genre, 0); 
		
		// 테이블 생성
		JTable table5 = new JTable(model5); 
		String row5[];
		
		// 배치는 자유롭게 
		setLayout(null);
		String tname = "movie_genre";
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl();

		
		JLabel table_name = new JLabel("영화-장르 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		//버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		// 버튼 폰트 설정
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		//버튼 위치 설정
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		//검색버튼 액션리스너
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model5);
			}
		});
		
		//버튼 추가
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		//스크롤 생성 및 추가
		JScrollPane jp = new JScrollPane(table5);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		


	}
}


//영화-감독 정보 panel을 만드는 class
class Movie_dir_Panel extends JPanel{
	Movie_dir_Panel()
	{

		String col_movie_dir[] = { "영화이름","영화개봉일", "감독코드"}; 
		// 모델 생성
		DefaultTableModel model5 = new DefaultTableModel(col_movie_dir, 0); 
		
		// 테이블 생성
		JTable table5 = new JTable(model5); 
		
		String row5[];
		
		// 배치는 자유롭게 
		setLayout(null);
		String tname = "movie_director";
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl();

		
		JLabel table_name = new JLabel("영화-감독 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// 버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		//버튼 폰트 설정
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		//버튼 위치 설정
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		//검색 버튼 액션리스너
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model5);
			}
		});
		
		// 버튼 추가
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		 
		//스크롤 추가
		JScrollPane jp = new JScrollPane(table5);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		

	}
}


//영화-배우 정보 panel을 만드는 class
class Movie_act_Panel extends JPanel{
	Movie_act_Panel()
	{

		String col_movie_act[] = { "영화이름","영화개봉일", "배우이름"}; 
		//모델생성
		DefaultTableModel model5 = new DefaultTableModel(col_movie_act, 0); 
		//테이블 생성
		JTable table5 = new JTable(model5); 
		// row 배열 생성
		String row5[];
		
		// 레이아웃은 자유롭게 
		setLayout(null);
		String tname = "movie_actor";
		
		//seach 버튼을 누르면, db와 연결 후, 쿼리문을 보내 출력해주는 메소드를 가지고 있는 클래스 
		DB_ctrl dc = new DB_ctrl(); 

		
		JLabel table_name = new JLabel("영화-배우 정보");
		table_name.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// 버튼 생성
		JButton search = new JButton("검색");
		JButton insert = new JButton("추가");
		JButton delete = new JButton("삭제");
		JButton alter = new JButton("변경");
		
		//버튼 폰트 설정
		search.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		insert.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		alter.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		
		// 버튼 위치 설정 
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		//검색 버튼 액션 리스너 
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model5);
			}
		});
		
		
		// 버튼 추가
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		
		//스크롤 추가 
		JScrollPane jp = new JScrollPane(table5);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
		//dc.getSearch(tname, model5);

	}
}






public class Main extends JFrame {
	
	DB_connect db; // = new DB_connect();

	
	public Main() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("영화 정보창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		
		
		moviePanel mp = new moviePanel();
		actorPanel ap = new actorPanel();
		directorPanel dp = new directorPanel();
		producerPanel pp = new producerPanel();
		genrePanel gp = new genrePanel();
		gradePanel Gp = new gradePanel();
		Movie_Genre_Panel mgp = new Movie_Genre_Panel();
		Movie_dir_Panel mdp = new  Movie_dir_Panel();
		Movie_act_Panel map = new Movie_act_Panel();

		c.add(mp);
		c.add(ap);
		c.add(dp);
		c.add(pp);
		c.add(gp);
		c.add(Gp);
		c.add(mgp);
		c.add(mdp);
		c.add(map);
		
		// GridLayout을활용해 3*3으로 위치 
		c.setLayout(new GridLayout(3,3,1,1)); 
		
		setSize(1000,1200);
		setVisible(true);
	}
	
	
	public static void main(String args[])
	{
		new Main();
	}
	
	
	


}
