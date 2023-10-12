import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WhileLoops extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g.drawRect(0, 0, 999, 649);
		int rX = 0;
		int rY = 0;
		for(int i = 0; i < 5; i++) {
			for(int x1 = 0 + rX, y1 = 649 - rY, x2 = 0 + rX, y2 = 0 + rY; x1 < (999 - rX); x1 += 15, y2 += 10) {
				if(y2 > (639 - rY)) {
					break;
				}
				g.drawLine(x1, y1, x2, y2);
			}
			for(int x1 = 0 + rX, y1 = 0 + rY, x2 = 0 + rX, y2 = 649 - rY; x1 < (999 - rX); y2 -= 10, x1 += 15) {
				if(y2 < (0 + rY)) {
					break;
				}
				g.drawLine(x1, y1, x2, y2);
			}
			for(int x1 = 999 - rX, y1 = 0 + rY, x2 = 999 - rX, y2 = 649 - rY; x1 > (0 + rX); x1 -= 15, y2 -= 10) {
				if(y2 < (0 + rY)) {
					break;
				}
				g.drawLine(x1, y1, x2, y2);
			}
			for(int x1 = 999 - rX, y1 = 0 + rY, x2 = 999 - rX, y2 = 649 - rY; x2 > (0 + rX); x2 -= 15, y1 += 10) {
				if(y1 > (639 - rY)) {
					break;
				}
				g.drawLine(x1, y1, x2, y2);
			}
			if(i == 0) {
				rX = 999;
				rY = 649;
			}
				rX = (int)((3/4.0)*(rX));
				rY = (int)((3/4.0)*(rY));
		}	
		
		
	}
	
	public static void main(String[] arg) {
		WhileLoops m = new WhileLoops();
	}
	
	public WhileLoops() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
