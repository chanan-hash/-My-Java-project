package IO;

public class FileIO34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exsists? " + FileUtils.exsists("C:\\Users\\User\\Desktop\\Worms Armageddon"));		

		System.out.println("Create? "  + FileUtils.createDirectories ("C:\\Users\\User\\3D Objects\\a", true));

		System.out.println("Delete? "  + FileUtils.deleteFile("C:\\Users\\User\\3D Objects\\a"));

	}

}
