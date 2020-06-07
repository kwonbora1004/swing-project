package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//간단한 로그인 페이지 만들기
public class Login extends JFrame{
	public Login() {
		JPanel panel = new JPanel();
		JLabel lable = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		JButton logBtn = new JButton("Log In");
		
		panel.add(lable);
		
		
			
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id ="bora";
				String password = "1234";
				
				if(id.equals(txtID.getText() ) && password.equals(txtPass.getText() )) {
					JOptionPane.showMessageDialog(null, "You hava login");
				}else {
					JOptionPane.showMessageDialog(null, "You failed to login");
				}
				
			}
		});
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	public static void main(String[] args) {
		new Login();
	}

}
