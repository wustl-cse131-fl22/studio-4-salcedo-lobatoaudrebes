package studio4;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color skyBlue = new Color(78, 86, 128);
		StdDraw.setPenColor(skyBlue);
		StdDraw.filledRectangle(0.5, 0.5, 0.4,0.25);
		
		Color green = new Color(78, 128, 91);
		StdDraw.setPenColor(green);
		StdDraw.filledRectangle(0.5, 0.25, 0.4,0.075);
		
		Color darkBlue = new Color(25, 43, 68);
		StdDraw.setPenColor(darkBlue);
		double[] x = { .1, 0.3, 0.7};
		double[] y = { 0.325, 0.6, 0.325};
		StdDraw.filledPolygon(x,y);
		
		StdDraw.setPenColor(darkBlue);
		double[] x1 = { .5, 0.65, 0.9};
		double[] y2 = { 0.325, 0.45, 0.325};
		StdDraw.filledPolygon(x1,y2);
		
		Color yellow = new Color(245, 236, 196);
		StdDraw.setPenColor(yellow);
		StdDraw.filledCircle(0.75,0.6,0.05);
		
		StdDraw.setPenColor(skyBlue);
		StdDraw.filledCircle(0.725,0.625,0.05);
		
		
		//smileyface
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.25,0.3,0.05);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.2325,0.317,0.01);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.2675,0.317,0.01);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.25,0.285,0.019);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.25,0.29,0.019);
		
		
		
	}
}