import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
	int numDigits = 3; 
	
	public static void main(String[] args) throws FileNotFoundException {
//        PrintStream output = new PrintStream(new File("hello.txt"));
//        int count = 0; 
//        for (int i = 0; i < 10; i++) {
//        	output.println("00" + count);
//        	count++; 
//        }
//        for (int i = 10; i < 100; i++) {
//        	output.println("0" + count);
//        	count++; 
//        }
//        for (; count < 1000; count++) {
//        	output.println(count);
//        }
		
		// TODO 
		// CAN'T RENAME FILES TWICE IN A ROW ?? 
		
		File[] files = new File("C:/Users/Jung/Desktop/test").listFiles();

//		File f1 = new File("C:/Users/Jung/Desktop/test/00.png_.png_");
		// File f2 = new File("C:/Users/Jung/Desktop/test/00.png");
		System.out.println(files[0].getName());
		
		System.out.println(files[0].renameTo(new File("C:/Users/Jung/Desktop/test" + "/" + files[0].getName() + "_" + files[0].getName().substring(files[0].getName().lastIndexOf('.')))));
		System.out.println(files[1].renameTo(new File("C:/Users/Jung/Desktop/test/100.png")));
		// files = new File("C:/Users/Jung/Desktop/test").listFiles();
		System.out.println(files[1].renameTo(new File("C:/Users/Jung/Desktop/test/101.png")));

		// System.out.println(files[0].renameTo(new File("C:/Users/Jung/Desktop/test" + "/" + "00" + files[0].getName().substring(files[0].getName().lastIndexOf('.')))));
		// System.out.println(files[0].renameTo(new File("C:/Users/Jung/Desktop/test/00.png")));
		// System.out.println(files[0].renameTo(new File("C:/Users/Jung/Desktop/test/01.png")));
		System.out.println(files[0].getName());
		
		
//		for (File f : files) {
////	if (f.getName().equals("Pinyin2.jar")) {
////		f.renameTo(new File("C:/Users/Jung/Desktop/Pinyin.jar")); 
////	}
//	// System.out.println(f);
//	f.renameTo(new File(directory + num));
//	(Integer.parseInt(num) + 1).; 
//}
		
	}

}
