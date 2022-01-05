import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class M_insert extends JFrame{
	private JTextField m_title;
	private JTextField m_playdate;
	private JTextField m_runs;
	private JTextField grade_code;

	M_insert()
	{
		setTitle("영화 추가하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(null);
		
		// 레이블 1
		JLabel lblNewLabel = new JLabel("영화 제목");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel.setBounds(51, 49, 75, 20);
		getContentPane().add(lblNewLabel);
		
		
		// 레이블 2
		JLabel lblNewLabel_1 = new JLabel("영화 개봉일");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_1.setBounds(51, 79, 75, 20);
		getContentPane().add(lblNewLabel_1);
		
		// 레이블 3
		JLabel lblNewLabel_1_1 = new JLabel("상영 시간");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(51, 109, 75, 20);
		getContentPane().add(lblNewLabel_1_1);
		
		// 레이블 4
		JLabel lblNewLabel_1_1_1 = new JLabel("등급 코드");
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(51, 139, 75, 20);
		getContentPane().add(lblNewLabel_1_1_1);
		
		// 텍스트 필드 1 : 영화 제목 적는 칸
		m_title = new JTextField("꼭 적어주어야 합니다.");
		m_title.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		m_title.setBounds(180, 49, 209, 21);
		getContentPane().add(m_title);
		m_title.setColumns(10);

		// 텍스트 필드 2 : 영화 개봉일 적는 칸
		m_playdate = new JTextField("2021-12-12 형식으로 적어주세요");
		m_playdate.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		m_playdate.setColumns(10);
		m_playdate.setBounds(180, 81, 209, 21);
		getContentPane().add(m_playdate);
		
		// 텍스트 필드 3 : 영화 상영시간 적는 칸
		m_runs = new JTextField("분 단위로 적어주세요");
		m_runs.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		m_runs.setColumns(10);
		m_runs.setBounds(180, 111, 209, 21);
		getContentPane().add(m_runs);
		
		// 텍스트 필드 1 : 영화 등급 적는 칸
		grade_code = new JTextField("01, 02, 03, 04 중에 하나 택해주세요");
		grade_code.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		grade_code.setColumns(10);
		grade_code.setBounds(180, 141, 209, 21);
		getContentPane().add(grade_code);
		
		//추가 버튼
		JButton btnNewButton = new JButton("추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton.setBounds(80, 207, 97, 23);
		getContentPane().add(btnNewButton);
		
		// 취소 버튼 
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton_1.setBounds(241, 207, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		
		setSize(450,300);
		
	}

	
	
}
