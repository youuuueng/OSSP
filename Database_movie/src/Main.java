import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;


//��ȭ ���� panel�� ����� class
class moviePanel extends JPanel{
	moviePanel()
	{
		String col_movie[] = {"��ȭ����", "��ȭ������", "�󿵽ð�", "����ڵ�" }; 
		
		// �� ����
		DefaultTableModel model1 = new DefaultTableModel(col_movie, 0); 
	
		// ���̺� ����
		JTable table1 = new JTable(model1); 
		
		// ��ġ�� �����Ӱ� 
		setLayout(null);
		String tname = "movie";
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl(); 
		
		//label ����
		JLabel table_name = new JLabel("��ȭ ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		//��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		// ��ư ������ �׼� ����
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dc.getSearch(tname, model1);
			}
		});
		
	
		// �߰���ư ������ ���� ( �߰� �޼ҵ���� ��������� ����) 
		insert.addActionListener(new insert_btn());
		
		// ��ư �߰�
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		// ��ũ�� ���� �� �߰�
		JScrollPane jp = new JScrollPane(table1);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
	}
}

//�߰� ��ư�� ������ ����Ǵ� �׼Ǹ�����
class insert_btn implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		M_insert m = new M_insert();
		m.setVisible(true);
	}
}



//��� ���� panel�� ����� class
class actorPanel extends JPanel{
	actorPanel()
	{
		String col_actor[] = { "����̸�", "����", "�������", "����"}; 
		
		// �� ����
		DefaultTableModel model2 = new DefaultTableModel(col_actor, 0); 
		
		// ���̺� ����
		JTable table2 = new JTable(model2); 
		String row2[];
		
		// ��ġ�� �����Ӱ�
		setLayout(null);
		String tname = "actor";
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl(); 
		
		
		JLabel table_name = new JLabel("��� ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// ��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		
		// ��ư ��Ʈ ����
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		// ��ư ��ġ ����
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		
		// �˻� ��ư �׼� ������ 
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model2);
			}
		});
		
		// �߰� ��ư �׼� ������
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
			}
		});
		
		// ��ư �߰�
		add(search);
		add(insert);
		add(delete);
		add(alter);
		

		// ��ũ�� ���� �� �߰�
		JScrollPane jp = new JScrollPane(table2);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
		

	}
}



//���� ���� panel�� ����� class
class directorPanel extends JPanel{
	directorPanel()
	{
		
		String col_director[] = { "�����ڵ�", "�����̸�", "�������", "����"}; 	
		
		//�� ����
		DefaultTableModel model3 = new DefaultTableModel(col_director, 0); 		
		// Create Table
		JTable table3 = new JTable(model3); 
		String row3[];
		
		// ��ġ�� �����Ӱ�
		setLayout(null);
		String tname = "director";
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl(); 		

		
		JLabel table_name = new JLabel("���� ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// ��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		// ��ư ��Ʈ ���� 
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		// �˻� ��ư �׼� ������
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model3);
			}
		});
		
		
		// ��ư ��ġ ����
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		// ��ư �߰�
		add(search);
		add(insert);
		add(delete);
		add(alter);

		// ��ũ�� ���� �� �߰�
		JScrollPane jp = new JScrollPane(table3);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		

	}

}


//���ۻ� ���� panel�� ����� class
class producerPanel extends JPanel{
	producerPanel()
	{

		String col_producer[] = { "���ۻ��ڵ�", "���ۻ��̸�", "�ּ�"}; 
		
		//�� ���� 
		DefaultTableModel model4 = new DefaultTableModel(col_producer, 0); 
		
		//���̺� ����
		JTable table4 = new JTable(model4);	
		String row4[];
		
		// ��ġ�� �����Ӱ� 
		setLayout(null);
		String tname = "producer";
		
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl(); 		
		
		JLabel table_name = new JLabel("���ۻ� ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// ��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		// ��ư ��Ʈ ����
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		// �˻� ��ư �׼� ������ 
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model4);
			}
		});
		
		
		// ��ư ��ġ ����
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		
		// ��ư �߰� 
		add(search);
		add(insert);
		add(delete);
		add(alter);


		// ��ũ�� ���� �� �߰�
		JScrollPane jp = new JScrollPane(table4);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		

	}
}



//�帣 ���� panel�� ����� class
class genrePanel extends JPanel{
	genrePanel()
	{

		String col_genre[] = { "�帣�ڵ�", "�帣��"}; 
		
		// �� ����
		DefaultTableModel model5 = new DefaultTableModel(col_genre, 0); 
		
		// ���̺� ����
		JTable table5 = new JTable(model5); 
		String row5[];
	
		// ��ġ�� �����Ӱ� 
		setLayout(null);
		String tname = "GENRE";
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl(); 	

		
		JLabel table_name = new JLabel("�帣 ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// ��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		// ��ư ��Ʈ ���� 
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		// ��ư ��ġ ����
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		// �˻� ��ư �׼� ������
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model5);
			}
		});
		
		// ��ư �߰�
		add(search);
		add(insert);
		add(delete);
		add(alter);
		

		// ��ũ�� ���� �� �߰�
		JScrollPane jp = new JScrollPane(table5);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
	}
}



//��� ���� panel�� ����� class
class gradePanel extends JPanel{
	gradePanel()
	{

		String col_grade[] = { "����ڵ�", "��޸�"}; 
		
		// �� ����
		DefaultTableModel model6 = new DefaultTableModel(col_grade, 0); 

		// ���̺� ���� 
		JTable table6 = new JTable(model6); 	
		String row6[];
	
		// ��ġ�� �����Ӱ� 
		setLayout(null);
		String tname = "GRADE";
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl(); 

		
		JLabel table_name = new JLabel("��� ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// ��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		// ��ư ��Ʈ ���� 
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		// ��ư ��ġ ����
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		// �˻� ��ư �׼� ������ 
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model6);
			}
		});
		
		
		// ��ư �߰� 
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		
		// ��ũ�� ���� �� �߰�
		JScrollPane jp = new JScrollPane(table6);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		
	}
}




//��ȭ-�帣 ���� panel�� ����� class
class Movie_Genre_Panel extends JPanel{
	Movie_Genre_Panel()
	{

		String col_movie_genre[] = { "��ȭ�̸�","��ȭ������", "�帣�ڵ�"}; 
		// �� ����
		DefaultTableModel model5 = new DefaultTableModel(col_movie_genre, 0); 
		
		// ���̺� ����
		JTable table5 = new JTable(model5); 
		String row5[];
		
		// ��ġ�� �����Ӱ� 
		setLayout(null);
		String tname = "movie_genre";
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl();

		
		JLabel table_name = new JLabel("��ȭ-�帣 ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		//��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		// ��ư ��Ʈ ����
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		//��ư ��ġ ����
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		//�˻���ư �׼Ǹ�����
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model5);
			}
		});
		
		//��ư �߰�
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		//��ũ�� ���� �� �߰�
		JScrollPane jp = new JScrollPane(table5);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		


	}
}


//��ȭ-���� ���� panel�� ����� class
class Movie_dir_Panel extends JPanel{
	Movie_dir_Panel()
	{

		String col_movie_dir[] = { "��ȭ�̸�","��ȭ������", "�����ڵ�"}; 
		// �� ����
		DefaultTableModel model5 = new DefaultTableModel(col_movie_dir, 0); 
		
		// ���̺� ����
		JTable table5 = new JTable(model5); 
		
		String row5[];
		
		// ��ġ�� �����Ӱ� 
		setLayout(null);
		String tname = "movie_director";
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl();

		
		JLabel table_name = new JLabel("��ȭ-���� ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// ��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		//��ư ��Ʈ ����
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		//��ư ��ġ ����
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		//�˻� ��ư �׼Ǹ�����
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model5);
			}
		});
		
		// ��ư �߰�
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		 
		//��ũ�� �߰�
		JScrollPane jp = new JScrollPane(table5);
		jp.setBounds(12, 36, 300, 255);
		add(jp);
		

	}
}


//��ȭ-��� ���� panel�� ����� class
class Movie_act_Panel extends JPanel{
	Movie_act_Panel()
	{

		String col_movie_act[] = { "��ȭ�̸�","��ȭ������", "����̸�"}; 
		//�𵨻���
		DefaultTableModel model5 = new DefaultTableModel(col_movie_act, 0); 
		//���̺� ����
		JTable table5 = new JTable(model5); 
		// row �迭 ����
		String row5[];
		
		// ���̾ƿ��� �����Ӱ� 
		setLayout(null);
		String tname = "movie_actor";
		
		//seach ��ư�� ������, db�� ���� ��, �������� ���� ������ִ� �޼ҵ带 ������ �ִ� Ŭ���� 
		DB_ctrl dc = new DB_ctrl(); 

		
		JLabel table_name = new JLabel("��ȭ-��� ����");
		table_name.setFont(new Font("���� ���", Font.BOLD, 18));
		table_name.setBounds(12, 10, 194, 25);
		add(table_name);
		
		// ��ư ����
		JButton search = new JButton("�˻�");
		JButton insert = new JButton("�߰�");
		JButton delete = new JButton("����");
		JButton alter = new JButton("����");
		
		//��ư ��Ʈ ����
		search.setFont(new Font("���� ���", Font.BOLD, 14));
		insert.setFont(new Font("���� ���", Font.BOLD, 14));
		delete.setFont(new Font("���� ���", Font.BOLD, 14));
		alter.setFont(new Font("���� ���", Font.BOLD, 14));
		
		// ��ư ��ġ ���� 
		search.setBounds(24, 295, 63, 23);
		insert.setBounds(92, 295, 63, 23);
		delete.setBounds(160, 295, 63, 23);
		alter.setBounds(228, 295, 63, 23);
		
		//�˻� ��ư �׼� ������ 
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				dc.getSearch(tname, model5);
			}
		});
		
		
		// ��ư �߰�
		add(search);
		add(insert);
		add(delete);
		add(alter);
		
		
		//��ũ�� �߰� 
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
		setTitle("��ȭ ����â");
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
		
		// GridLayout��Ȱ���� 3*3���� ��ġ 
		c.setLayout(new GridLayout(3,3,1,1)); 
		
		setSize(1000,1200);
		setVisible(true);
	}
	
	
	public static void main(String args[])
	{
		new Main();
	}
	
	
	


}
