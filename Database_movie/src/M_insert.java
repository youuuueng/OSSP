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
		setTitle("��ȭ �߰��ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(null);
		
		// ���̺� 1
		JLabel lblNewLabel = new JLabel("��ȭ ����");
		lblNewLabel.setFont(new Font("���� ���", Font.BOLD, 14));
		lblNewLabel.setBounds(51, 49, 75, 20);
		getContentPane().add(lblNewLabel);
		
		
		// ���̺� 2
		JLabel lblNewLabel_1 = new JLabel("��ȭ ������");
		lblNewLabel_1.setFont(new Font("���� ���", Font.BOLD, 14));
		lblNewLabel_1.setBounds(51, 79, 75, 20);
		getContentPane().add(lblNewLabel_1);
		
		// ���̺� 3
		JLabel lblNewLabel_1_1 = new JLabel("�� �ð�");
		lblNewLabel_1_1.setFont(new Font("���� ���", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(51, 109, 75, 20);
		getContentPane().add(lblNewLabel_1_1);
		
		// ���̺� 4
		JLabel lblNewLabel_1_1_1 = new JLabel("��� �ڵ�");
		lblNewLabel_1_1_1.setFont(new Font("���� ���", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(51, 139, 75, 20);
		getContentPane().add(lblNewLabel_1_1_1);
		
		// �ؽ�Ʈ �ʵ� 1 : ��ȭ ���� ���� ĭ
		m_title = new JTextField("�� �����־�� �մϴ�.");
		m_title.setFont(new Font("���� ���", Font.PLAIN, 10));
		m_title.setBounds(180, 49, 209, 21);
		getContentPane().add(m_title);
		m_title.setColumns(10);

		// �ؽ�Ʈ �ʵ� 2 : ��ȭ ������ ���� ĭ
		m_playdate = new JTextField("2021-12-12 �������� �����ּ���");
		m_playdate.setFont(new Font("���� ���", Font.PLAIN, 10));
		m_playdate.setColumns(10);
		m_playdate.setBounds(180, 81, 209, 21);
		getContentPane().add(m_playdate);
		
		// �ؽ�Ʈ �ʵ� 3 : ��ȭ �󿵽ð� ���� ĭ
		m_runs = new JTextField("�� ������ �����ּ���");
		m_runs.setFont(new Font("���� ���", Font.PLAIN, 10));
		m_runs.setColumns(10);
		m_runs.setBounds(180, 111, 209, 21);
		getContentPane().add(m_runs);
		
		// �ؽ�Ʈ �ʵ� 1 : ��ȭ ��� ���� ĭ
		grade_code = new JTextField("01, 02, 03, 04 �߿� �ϳ� �����ּ���");
		grade_code.setFont(new Font("���� ���", Font.PLAIN, 10));
		grade_code.setColumns(10);
		grade_code.setBounds(180, 141, 209, 21);
		getContentPane().add(grade_code);
		
		//�߰� ��ư
		JButton btnNewButton = new JButton("�߰�");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("���� ���", Font.BOLD, 14));
		btnNewButton.setBounds(80, 207, 97, 23);
		getContentPane().add(btnNewButton);
		
		// ��� ��ư 
		JButton btnNewButton_1 = new JButton("���");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("���� ���", Font.BOLD, 14));
		btnNewButton_1.setBounds(241, 207, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		
		setSize(450,300);
		
	}

	
	
}
