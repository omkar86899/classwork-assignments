package com.techlab.test;

//Java program to demonstrate get and set pixel
//values of an image
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class HalfImage
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("rabbit.jpg");
		BufferedImage img = ImageIO.read(f);
		int width = img.getWidth();
		int height = img.getHeight();
		int p,r,g,b;

		for (int i = 0; i < width; i++) {
			for (int j = height/2; j < height; j++) {
				p = img.getRGB(0,0);
				r=g=b=127;
				p = (b<<24) | (r<<16) | (g<<8) | b;
				img.setRGB(i, j, p);
			}
		}

		//write image
		try
		{
			f = new File("Out.jpg");
			ImageIO.write(img, "jpg", f);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
