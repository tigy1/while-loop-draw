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
		int rX = 0; //setting variable representing height of x axis of pattern drawn, starting at 0
		int rY = 0; //setting variable representing length of y axis of pattern drawn, starting at 0
		int n = 4; //variable int n is set at 4 which is used in the mult variable later on 
		double mult = 0.0;/*creates variable mult that is set as placeholder & represents how much is multiplied with 
		 					variable for x & y length of shape (Rx & Ry) used later on at bottom
		 					of code and subtracted from actual length & height drawn*/
		double series = 0.0; //creates double variable called series that is originally set as a placeholder, and uses mult variable later on
		
		for(int i = 0; i < 4; i++, n += 4) {//for loop that has 4 iterations, also increasing n by 4 each iteration
			
			for(int x1 = 0 + rX, y1 = 649 - rY, x2 = 0 + rX, y2 = 0 + rY; x1 < (999 - rX); x1 += (15 - i), y2 += (10 - i)) { //code creating bottom left corner of pattern in each iteration
				if(y2 > (639 - rY)) { //prevents bottom left pattern from going to low/over what is expected of the rectangle shape
					break;
				}
				g.drawLine(x1, y1, x2, y2);
			}
			for(int x1 = 0 + rX, y1 = 0 + rY, x2 = 0 + rX, y2 = 649 - rY; x1 < (999 - rX); y2 -= (10 - i), x1 += (15 - i)) { //code creating top left corner of pattern in each iteration
				if(y2 < (0 + rY)) { //prevents top left pattern from going higher than what is expected of rectangle shape
					break;
				}
				g.drawLine(x1, y1, x2, y2);
			}
			for(int x1 = 999 - rX, y1 = 0 + rY, x2 = 999 - rX, y2 = 649 - rY; x1 > (0 + rX); x1 -= (15 - i), y2 -= (10 - i)) { //code creating top right corner of pattern in each iteration
				if(y2 < (0 + rY)) { // same thing as above but for top right corner going too high
					break;
				}
				g.drawLine(x1, y1, x2, y2);
			}
			for(int x1 = 999 - rX, y1 = 0 + rY, x2 = 999 - rX, y2 = 649 - rY; x2 > (0 + rX); x2 -= (15 - i), y1 += (10 - i)) { //code creating bottom right corner of pattern in each iteration
				if(y1 > (639 - rY)) { //same thing as above but for bottom right corner going too low
					break;
				}
				g.drawLine(x1, y1, x2, y2);
			}
			if(i >= 0) { //sets height & length of pattern to original size (999x & 649y) after originally shape is drawn
				rX = 999;
				rY = 649;
			}
			mult = 1.0/n; //mult variable equals 1/the value of n, increasing by 4 for every iteration
			series += mult; //series variable increases by mult variable for each iteration
			
			rX = (int)((series)*(rX)); //rX & rY variables are subtracted from actual dimensions (x & y or length & height) to determine
			rY = (int)((series)*(rY)); //sizes of next shape in iteration, rX & rY are calculated by multiplying series variable by original size of shape (999 & 649)
		}							   //only changing factor is mult variable which makes series variable bigger each iteration so that shape drawn is smaller
		
		
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
