package studio4;

import java.awt.Color;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		
		if (shape == "rectangle") {
			Color color = new Color(R, G, B);
			StdDraw.setPenColor(color);
			if (filled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}

		else if (shape == "ellipse") {
			Color color = new Color(R, G, B);
			StdDraw.setPenColor(color);
			if (filled) {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
		}
		
		else if (shape == "triangle") {
			Color color = new Color(R, G, B);
			StdDraw.setPenColor(color);
			double[] arr1 = {x, halfWidth, x3};
			double[] arr2 = {y, halfHeight, y3};
			if (filled) {
				StdDraw.filledPolygon(arr1, arr2);
			}
			else {
				StdDraw.polygon(arr1, arr2);
			}
		}
	}
}
