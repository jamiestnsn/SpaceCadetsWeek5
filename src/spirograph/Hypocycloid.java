package spirograph;

import java.awt.Graphics;

public class Hypocycloid {
	private double R;
	private double r;
	private double offset;
	
	private final double T_INCREMENT = 0.1;
	private final int DRAW_OFFSET_X = 320;
	private final int DRAW_OFFSET_Y = 240;
	
	public Hypocycloid(double R, double r, double offset) {
		this.R = R;
		this.r = r;
		this.offset = offset;
	}
	
	public void paint(Graphics g) {
		double t = 0;
		double x;
		double y;
		double oldX;
		double oldY;
		
		oldX = (R + r) * Math.cos(t) - (r + offset) * Math.cos(((R + r) / r) * t);
		oldY = (R + r) * Math.sin(t) - (r + offset) * Math.sin(((R + r) / r) * t);
		
		for(int i = 0; i < 1000; i++) {
			t += T_INCREMENT;
			
			x = (R + r) * Math.cos(t) - (r + offset) * Math.cos(((R + r) / r) * t);
			y = (R + r) * Math.sin(t) - (r + offset) * Math.sin(((R + r) / r) * t);
			
			g.drawLine((int) oldX + DRAW_OFFSET_X, (int) oldY + DRAW_OFFSET_Y, (int) x + DRAW_OFFSET_X, (int) y + DRAW_OFFSET_Y);
			
			oldX = x;
			oldY = y;
		}
	}
}
