package studio4;

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
		
		StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
		boolean isFilled=true;
		if (in.nextBoolean()==true) {
			isFilled=true;
		}
		else {
			isFilled=false;
		}
		String shape = in.nextLine();
		
		
		stdDraw.(in.nextDouble(),in.nextDouble(),in.nextDouble());
	}
}
