package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream inputStream = null;	

		try {
			String data = FileUtils.readFile("C:\\Temp\\input.txt");	

			byte[] bytes = {65, 66, 67, 68};

			FileUtils.writeFile("C:\\Temp\\input.txt", bytes );

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}


}

