package compunereAgregare_Smartphone;

import java.util.ArrayList;

public class Screen {
	
	private ArrayList<Pixel> pixels;
	private Dimensions dimensions;
	
	public Screen (int pixels, int width, int length, int depth) {
		this.dimensions = new Dimensions(width,length,depth);
		
		for (int i = 0; i < pixels; ++i) {
			Pixel newObject = new Pixel();
			this.pixels.add(newObject);
		}
	}
	
	public void setPixel (int pixel, String colorOfPixel) {
		Pixel thePixel;
		thePixel = pixels.get(pixel);
		thePixel.setPixel(colorOfPixel);
	}
	
	public void colorScreen(String colorOfScreen) {
		for (int i = 0; i < pixels.size(); ++i) {
			pixels.get(i).setPixel(colorOfScreen);
		}
	}

	
}
