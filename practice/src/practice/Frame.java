package practice;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("some text");
		JButton btn1 = new JButton("click");
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea();				//�۾� ������ filed�� ����
		JTextField txtFiled = new JTextField(200);		//200����
		JPanel btnPanel =  new JPanel();
		panel.setLayout(new BorderLayout()); 		//���ϴ� ���� ��ġ

	
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label,BorderLayout.NORTH); //����
		panel.add(txtArea,BorderLayout.CENTER);
		panel.add(btnPanel,BorderLayout.WEST);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {		//��ư��� �߰�
				//txtArea.append("You are amazing\n");
				label.setText(txtArea.getText());
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.add(panel); //�г��� ������ �ȿ� �־���
		
		frame.setResizable(false);			//ȭ�� ũ������ �Ұ���
		frame.setVisible(true);		//������ ���̰� �ϱ�
		frame.setPreferredSize (new Dimension(840,840/12*9));		//�ַο��ϴ� ������ ,�ΰ��� �� dimension 
		frame.setSize(840,840/12*9);	//������ ������
		frame.setLocationRelativeTo(null);		//��ǻ�� ����� ���Ͷ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		//���α׷� 
		
		
	}
}
