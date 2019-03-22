import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

import sun.security.x509.X400Address;

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public void chromakey() {
		Pixel[][] p1 = this.getPixels2D(); // We convert the Picture object of the picture to a 2D pixel array
		// We then make a new Picture object so we can work with the background as a 2D
		// pixel array
		Picture two = new Picture("tower.jpg");
		Pixel[][] p2 = two.getPixels2D();

		for (int row = 0; row < p1.length; row++) {
			for (int col = 0; col < p1[0].length; col++) {
				if ((p1[row][col].getGreen() < 250 && p1[row][col].getGreen() > 143)
						&& (p1[row][col].getBlue() < 195 && p1[row][col].getBlue() > 65)
						&& (p1[row][col].getRed() < 210 && p1[row][col].getRed() > 90)) {
					p1[row][col].setColor(p2[row + 100][col + 100].getColor());
				}
			}
		}
	}

	public void encode(Picture toBeEncoded) {
		Pixel[][] p1 = this.getPixels2D();
		Pixel[][] p2 = toBeEncoded.getPixels2D();

		// Below we make every Red pixel even
		for (int row = 0; row < p1.length; row++) {
			for (int col = 0; col < p1[0].length; col++) {
				// If a Red pixel has an odd int value then we make it even
				if (p1[row][col].getGreen() % 2 == 1) {
					// If it currently has a value of 255, we can't just add one as that may lead to
					// us trying to set a value of 256 which is outside the range of valid RGB
					// values
					if (p1[row][col].getGreen() == 255) {
						p1[row][col].setGreen(254);
					} else {
						// Otherwise, if it can be incremented to a valid value, we do so
						p1[row][col].setGreen(p1[row][col].getGreen() + 1);
					}
				}
			}
		}

		for (int row = 0; row < p1.length; row++) {
			for (int col = 0; col < p1[0].length; col++) {
				if (p2[row][col].getGreen() < 255) {
					p1[row][col].setGreen(p1[row][col].getGreen() + 1);
				}
			}
		}

	}

	public void decode() {
		Pixel[][] p1 = this.getPixels2D();

		// Below we make every Red pixel even
		for (int row = 0; row < p1.length; row++) {
			for (int col = 0; col < p1[0].length; col++) {
				if (p1[row][col].getGreen() % 2 == 0) {
					p1[row][col].setColor(new Color(255, 255, 255));
				} else {
					p1[row][col].setColor(new Color(0, 0, 0));
				}
			}
		}

		this.explore();

	}

	public void blur() {
		Pixel[][] p1 = this.getPixels2D(); // We convert the Picture object of the picture to a 2D pixel array
		// We then make a new Picture object so we can work with the background as a 2D
		// pixel array
		Picture two = new Picture("tower.jpg");
		Pixel[][] p2 = two.getPixels2D();

		for (int row = 1; row < p1.length-1; row++) {
			for (int col = 1; col < p1[0].length-1; col++) {
				double r = p1[row + 1][col].getRed()
						+ p1[row + 1][col + 1].getRed()
						+ p1[row + 1][col - 1].getRed()
						+ p1[row - 1][col + 1].getRed()
						+ p1[row - 1][col - 1].getRed()
						+ p1[row - 1][col].getRed()
						+ p1[row][col].getRed()
						+ p1[row][col - 1].getRed()
						+ p1[row][col + 1].getRed();
				double b = p1[row + 1][col].getBlue()
						+ p1[row + 1][col + 1].getBlue()
						+ p1[row + 1][col - 1].getBlue()
						+ p1[row - 1][col + 1].getBlue()
						+ p1[row - 1][col - 1].getBlue()
						+ p1[row - 1][col].getBlue()
						+ p1[row][col].getBlue()
						+ p1[row][col - 1].getBlue()
						+ p1[row][col + 1].getBlue();
				double g = p1[row + 1][col].getGreen()
						+ p1[row + 1][col + 1].getGreen()
						+ p1[row + 1][col - 1].getGreen()
						+ p1[row - 1][col + 1].getGreen()
						+ p1[row - 1][col - 1].getGreen()
						+ p1[row - 1][col].getGreen()
						+ p1[row][col].getGreen()
						+ p1[row][col - 1].getGreen()
						+ p1[row][col + 1].getGreen();
				r /= 9.0;
				b /= 9.0;
				g /= 9.0;
				p1[row][col].setColor(new Color((int) r, (int) g, (int) b));
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture one = new Picture("whiteFlower.jpg");
		//one.explore();
		//one.encode(new Picture("hello.png"));
		//one.explore();
		//one.decode();
		one.blur();
		one.blur();
		one.blur();
		one.explore();
	}

} // this } is the end of class Picture, put all new methods before this
