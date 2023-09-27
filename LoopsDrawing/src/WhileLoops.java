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
		g.drawRect(10, 10, 763, 540);
		
		//2) Draw a horizontal line to bisect the Rectangle
		g.drawLine(10, 270, 773, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g.drawLine(381, 10, 381, 550);
		
		//4) Draw small rectangle on top left
		g.drawLine(381/2, 10, 381/2, 540/2);
		
		/* int var = 0; // control var
		 * while(var < 10){ <---- condition to run loop
		 * 
		 *     //any repeating code
		 *     
		 *     //CONTROL VARIABLE UPDATE
		 *     var++;
		 * }
		 */
		
		int var = 0;
		while(var<10) {
			System.out.println("Hello World");
			var++;
		}
		//cool triangular line shape top left quadrant
		int x1 = 10, y1 = 10;
		int x2 = 381/2, y2 = 10;
		while(y2 < 270/2) {
			g.drawLine(x1, y1, x2, y2);
			y2 += 2;
		}
		//horizontal lines descending in top left quadrant
		int y3 = 270/2, y4 = 270/2;
		while(y3 < 270) {
			g.drawLine(x1, y3, x2, y4);
			y3 += 4;
			y4 += 4;
		}
		//top left quadrant cirlce with many rings
		int x3 = 290, y5 = 70;
		int radius = 0;
		while(radius < 50) {
			g.drawOval(x3, y5, radius*2, radius*2);
			x3 -= 2;
			y5 -= 2;
			radius += 2;
		}
		//drawing the chain of squares going down a corner, increasing in size top left quadrant
		int xsquare = 381/2 + 5, ysquare = 270/2;
		int xsize = 20, ysize = 20;
		while(ysquare < 270-ysize || xsquare < 381-xsize) {
			g.drawRect(xsquare, ysquare, xsize, ysize);
			xsquare += 15;
			ysquare += 10;
			xsize += 2;
			ysize += 2;
		}
		//top right square sigma add 2-31
		int sigma = 2;
		int start = 1;
		while (sigma <= 31) {
			start += sigma;
			sigma++;
		}
		Font biggerFont = new Font("serif", Font.PLAIN, 30);
		g.setFont(biggerFont);
		g.drawString("2+3+4...+31 = "+start, 480, 160);
		
		//factorial bottom left square
		int n = 5;
		int factorial = 1;
		while(n>0) {
			factorial *= n;
			n--;
		}
		g.drawString("5*4*3*2*1 = "+factorial, 90, 430);
		
		//random circles bottom right square
		int xLeft = 381, yTop = 270;
		int xRight = 773, yBottom = 550;
		int circles = 0;
		while(circles < 100) {
			int radius2 = (int)(Math.random()*(100-70+1)+70);
			int radius3 = (int)(Math.random()*(50-30+1)+30);
			g.drawOval((int)(Math.random()*(673-381+1)+381), (int)(Math.random()*(450-270+1)+270), radius2, radius2);
			g.drawOval((int)(Math.random()*(723-381+1)+381), (int)(Math.random()*(500-270+1)+270), radius3, radius3);
			circles++;
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
