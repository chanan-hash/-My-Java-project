	package A;
	
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;
	
	import javax.imageio.ImageIO;
	
	public class Shiur30 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			Scanner s = new Scanner(System.in);	
	
			BufferedImage image  = null;
			try {
				image = getImage();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				image = new BufferedImage(255, 255, 255);
				e.printStackTrace();
			}
	
	
			s.close();
		}
		public static BufferedImage getImage () throws IOException{
			return ImageIO.read(new File(""));
		} 
	}
