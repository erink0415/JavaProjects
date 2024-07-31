//ERIN
import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.JFrame;
public class TriangleFE extends Canvas{
	public static void main(String[] args) {
		//draw triangle
		JFrame frame =  new JFrame("Triangles");
		//set frame sizes
		frame.setSize(900,900);
		//create new triangle
		TriangleFE triangle = new TriangleFE();
		frame.add(triangle);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		//make big background triangle
		int[] x = {0, 450, 900};
		int[] y = {900, 0, 900};
		g.fillPolygon(x, y, 3);
		//call recursion
		drawTriangle(0,900,900, g);
	}
	public void drawTriangle(int x, int y, int height, Graphics g)
	{
		int sub = height/2;
		//make arrays to fill more triangles
		int[] x1 = {x, x+sub, x+height};
		int[] y1 = {y, y+height, y};
		//new color so triangles show up
		g.setColor(new Color(255, 255, 255));
		g.fillPolygon(x1, y1, 3);
		//pixel limit of 4
		if(sub >=4)
		{
			//top
			drawTriangle(x+sub/2, y-sub, sub, g);
			//bottom left
			drawTriangle(x, y, sub, g);
			//bottom right
			drawTriangle(x+sub, y, sub, g);
		}
	}
}
