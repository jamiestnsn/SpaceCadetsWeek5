package spirograph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spirograph extends JPanel{
	
	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
		});
		
		f.setContentPane(new Spirograph());
		f.setSize(WIDTH, HEIGHT);
		f.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Hypocycloid h = new Hypocycloid(50, 40, 10);
		
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.white);
		h.paint(g);
	}
	
}
