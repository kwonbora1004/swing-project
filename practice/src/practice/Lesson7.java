package practice;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//JTable을 이용해 표만들기
public class Lesson7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table Prac.");
		JPanel panel = new JPanel();
		String[] headings = new String[] { "Id", "Name", "Country" };
		Object[][] data = new Object[][] { 
			{ "1", "Daniel", "Korea" }, 
			{ "2", "John", "France" },
			{ "3", "Thomas", "Korea" }, };

		JTable table = new JTable(data, headings);// 데이터,설명
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		table.setFillsViewportHeight(true);

		panel.add(table);
		
		panel.add(new JScrollPane(table));

		frame.add(panel);

		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
