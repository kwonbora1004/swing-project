package practice;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//window builder,페이지 이동 ,absolutelayout
public class Lesson6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson6 window = new Lesson6();
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
	public Lesson6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Lesson6");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel endPage = new JPanel();
		endPage.setBounds(0, 0, 794, 538);
		frame.getContentPane().add(endPage);
		
		JButton btnBefore = new JButton("go to last");
		btnBefore.setBounds(580, 133, 165, 205);
	
		endPage.setLayout(null);
		endPage.add(btnBefore);
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		JButton btnNext = new JButton("go to next");
		btnNext.setBounds(70, 100, 191, 218);
		startPage.add(btnNext);
		
		endPage.setVisible(false);		
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(true);
				startPage.setVisible(false);
			}
		});
		
		btnBefore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(false);
				startPage.setVisible(true);
			}
		});
	}
}
