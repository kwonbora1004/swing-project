package practice;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;

public class Customer_App {

	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
	private JTextField name;
	private JTextField phone;
	private JTextField age;
	private JTextField birthday;
	private JTextField note;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
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
	public Customer_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Customer customer = new Customer();
		frame = new JFrame();
		frame.setSize(798,1355);
		frame.getContentPane().setLayout(null);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 0, 794, 1243);
		tablePanel.setVisible(true);
		String[][] data = customer.getCustomers();//new String [] [] {{"1,","2","3"},{"4","5","6"}};
		String[] header = new String[] {"Name","Phone","Gender","Age","Note"};
		JTable table = new JTable(data,header);
		table.setRowHeight(30);
		table.setFont(new Font("Sanserif",Font.BOLD,15));
		table.setAlignmentX(0);
		table.setSize(800,600);
		table.setPreferredScrollableViewportSize(new Dimension(800,600));
		tablePanel.add(new JScrollPane(table));
		frame.getContentPane().add(tablePanel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 794, 1288);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		
		JLabel lblWelcomeThisIs = new JLabel("welcome This is Main panel");
		lblWelcomeThisIs.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblWelcomeThisIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeThisIs.setBounds(89, 25, 585, 95);
		mainPanel.add(lblWelcomeThisIs);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(-51, 115, 242, 62);
		mainPanel.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setBounds(-51, 242, 242, 62);
		mainPanel.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setBounds(-41, 341, 242, 62);
		mainPanel.add(lblGender);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setBounds(348, 115, 242, 62);
		mainPanel.add(lblPhone);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthday.setBounds(360, 242, 242, 62);
		mainPanel.add(lblBirthday);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblNote.setBounds(348, 341, 242, 62);
		mainPanel.add(lblNote);
		
		name = new JTextField();
		name.setBounds(122, 126, 218, 41);
		mainPanel.add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(545, 126, 218, 41);
		mainPanel.add(phone);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(122, 253, 218, 41);
		mainPanel.add(age);
		
		birthday = new JTextField();
		birthday.setColumns(10);
		birthday.setBounds(545, 253, 218, 41);
		mainPanel.add(birthday);
		
		JComboBox gender = new JComboBox(new String[] {"Male","Female"});
		gender.setFont(new Font("±¼¸²", Font.PLAIN, 24));
		gender.setBackground(Color.WHITE);
		gender.setBounds(165, 352, 175, 41);
		mainPanel.add(gender);
		
		note = new JTextField();
		note.setBounds(534, 352, 204, 146);
		note.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		mainPanel.add(note);
		note.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nameTxt = name.getText();
				String ageTxt = age.getText();
				String phoneTxt =  phone.getText();
				//String bTxt = birthday.getText();
				String genderTxt = gender.getSelectedItem().toString();
				String noteTxt = note.getText();
				//Customer customer = new Customer(nameTxt,ageTxt,phoneTxt,bTxt);
				customer.createCustomer(nameTxt, phoneTxt, genderTxt, ageTxt, noteTxt);
				JOptionPane.showMessageDialog(null, "Your data has been saved successfully!");
				mainPanel.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(89, 544, 529, 121);
		mainPanel.add(btnNewButton);
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("C:/java_project/practice/image/welcome.jpg").getImage());
		welcomePanel.setBounds(0, 10, 755, 672);
		frame.getContentPane().add(welcomePanel);
		
		JLabel lblLogIn = new JLabel("LogIn");
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setFont(new Font("Arial", Font.PLAIN, 27));
		lblLogIn.setBounds(68, 10, 576, 100);
		welcomePanel.add(lblLogIn);
		
		id = new JTextField();
		id.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 26));
		id.setText("Enter ID");
		id.setToolTipText("Enter ID");
		id.setBounds(155, 121, 419, 48);
		welcomePanel.add(id);
		id.setColumns(10);
		
		JButton btnLogIn = new JButton("");
		btnLogIn.setIcon(new ImageIcon("C:\\java_project\\practice\\image\\icon1.jpg"));
		btnLogIn.setPressedIcon(new ImageIcon("C:\\java_project\\practice\\image\\icon2.jpg"));
		btnLogIn.setBounds(127, 387, 564, 139);
		btnLogIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("test")&& Arrays.equals(password.getPassword(),"1234".toCharArray())) {
					System.out.println("You Login");
					welcomePanel.setVisible(false);
					mainPanel.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		welcomePanel.add(btnLogIn);
		
		password = new JPasswordField();
		password.setBounds(155, 206, 419, 48);
		welcomePanel.add(password);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(78, 124, 92, 41);
		welcomePanel.add(lblId);
		
		JLabel lblPwd = new JLabel("PWD:");
		lblPwd.setBounds(63, 209, 92, 41);
		welcomePanel.add(lblPwd);
		frame.setJMenuBar(menuBar());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JMenuBar menuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu aboutMenu = new JMenu("About");
		
		bar.add(fileMenu);
		bar.add(aboutMenu);
		
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("exit");
		
		fileMenu.add(openFile);	
		fileMenu.addSeparator();
		fileMenu.add(exit);
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		return bar;
	}
}
class ImagePanel extends JPanel{
	private Image img;
	public ImagePanel(Image img) {
		this.img=img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	public int getWidth() {
		return img.getWidth(null);
	}
	public int getHeight() {
		return img.getHeight(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
