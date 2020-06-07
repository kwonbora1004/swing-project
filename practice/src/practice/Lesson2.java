package practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
//버튼, 라벨, 텍스트에리아,레이아웃
public class Lesson2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson2 window = new Lesson2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 685, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Sitka Small", Font.PLAIN, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setBounds(457, 43, 191, 107);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblLoginForm = new JLabel("Login form");
		lblLoginForm.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblLoginForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginForm.setBounds(41, 25, 340, 50);
		frame.getContentPane().add(lblLoginForm);
		
		textField = new JTextField();
		textField.setBounds(160, 100, 266, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Constantia", Font.PLAIN, 18));
		lblNewLabel.setBounds(41, 100, 116, 41);
		frame.getContentPane().add(lblNewLabel);
	}
}
