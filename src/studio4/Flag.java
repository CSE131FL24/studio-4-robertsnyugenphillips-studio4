package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledRectangle(0.3, 0.6, 0.2, 0.1);
		StdDraw.setPenColor(194, 178, 128);
		StdDraw.filledCircle(0.3, 0.575, 0.063);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(0.27, 0.58, 0.0085);
		StdDraw.filledCircle(0.33, 0.58, 0.0085);
		StdDraw.filledCircle(0.3, 0.56, 0.0045);
		
		StdDraw.setPenColor(194, 178, 128);
		double[] x = {0.275, 0.25, 0.255};
		double[] y = {0.6, 0.59, 0.7};
		StdDraw.filledPolygon(x, y);
		double[] i = {0.325, 0.35, 0.3475};
		double[] j = {0.6, 0.59, 0.7};
		StdDraw.filledPolygon(i, j);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(0.85, 0.5, 0.015, 0.2);
		StdDraw.filledRectangle(0.785, 0.5, 0.015, 0.2);
		StdDraw.filledRectangle(0.72, 0.5, 0.015, 0.2);
		StdDraw.filledRectangle(0.655, 0.5, 0.015, 0.2);
		StdDraw.filledRectangle(0.59, 0.5, 0.015, 0.2);
		StdDraw.filledRectangle(0.525, 0.5, 0.015, 0.2);
		
		StdDraw.filledRectangle(0.46, 0.4, 0.015, 0.1);
		StdDraw.filledRectangle(0.395, 0.4, 0.015, 0.1);
		StdDraw.filledRectangle(0.33, 0.4, 0.015, 0.1);
		StdDraw.filledRectangle(0.265, 0.4, 0.015, 0.1);
		StdDraw.filledRectangle(0.2, 0.4, 0.015, 0.1);
		StdDraw.filledRectangle(0.135, 0.4, 0.015, 0.1);
		StdDraw.setPenColor(StdDraw.BLACK);
		
	}
}