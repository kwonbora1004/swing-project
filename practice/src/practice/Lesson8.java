package practice;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
//패널에 배경사진 넣기
class ImagePanel extends JPanel{
	private Image img;
	public ImagePanel(Image img) {
		this.img=img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
public class Lesson8 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lesson8");
		frame.setSize(640,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		ImagePanel panel = new ImagePanel(new ImageIcon("./image/img1.jpg").getImage());
		
//		File f = new File("./image/img1.jpg");
//		System.out.println(f.exists()?"Exists":"Dosn't");
		
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
