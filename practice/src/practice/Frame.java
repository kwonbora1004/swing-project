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
		JTextArea txtArea = new JTextArea();				//글씨 넣을때 filed는 한줄
		JTextField txtFiled = new JTextField(200);		//200글자
		JPanel btnPanel =  new JPanel();
		panel.setLayout(new BorderLayout()); 		//원하는 곳에 배치

	
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label,BorderLayout.NORTH); //위쪽
		panel.add(txtArea,BorderLayout.CENTER);
		panel.add(btnPanel,BorderLayout.WEST);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {		//버튼기능 추가
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
		frame.add(panel); //패널을 프레임 안에 넣어줌
		
		frame.setResizable(false);			//화면 크기조정 불가능
		frame.setVisible(true);		//프레임 보이게 하기
		frame.setPreferredSize (new Dimension(840,840/12*9));		//주로원하는 사이즈 ,두개의 값 dimension 
		frame.setSize(840,840/12*9);	//프레임 사이즈
		frame.setLocationRelativeTo(null);		//컴퓨터 가운데에 나와라
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		//프로그램 
		
		
	}
}
