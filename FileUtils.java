package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

	public static String readFile (String path) throws IOException{

		String data = "";	

		FileInputStream inputStream = new FileInputStream(path);	

		int c;
		c = inputStream.read();
		while(c != 1) {
			data += (char)c;
			c = inputStream.read();
		}

		inputStream.close();

		return data;


	} 	

	public static void writeFile(String path, String content) throws IOException {
		writeFile(path, content.getBytes());
	}


	public static void writeFile(String path, byte[] content) throws IOException {

		FileOutputStream outputStream = new FileOutputStream(path);

		outputStream.write(content);

		outputStream.close();
	}

	public static boolean exsists (String path) {
		File f = new File (path); 	
		return f.exists();
	}

	public static boolean createDirectories(String path, boolean createParent) {
		File f = new File (path); 	
		if (createParent) {
			return		f.mkdirs();
		}
		return 		f.mkdir();
	}

	public static boolean deleteFile(String path) {
		File f = new File (path); 	
		return f.delete();	
	}

}
