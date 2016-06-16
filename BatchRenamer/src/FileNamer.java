import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FileNamer {
	static String[] zeroes; 
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner IO = new Scanner(System.in); 
		System.out.println("Enter name of directory you want to change the file names");
		// String directory = IO.nextLine(); 
		String directory = "C:/Users/Jung/Desktop/test"; 
		System.out.println("Enter new file name"); 
		String name = IO.nextLine(); 
		System.out.println("Choose sorting order");
		System.out.println("(1) Sort by old name");
		System.out.println("(2) Sort by last modified");
		System.out.println("(3) Sort by file type");
		System.out.println("(4) Sort by file size");
		int choice = Integer.parseInt(IO.nextLine()); 
		
		while (choice < 0 && choice > 4) {
			System.out.println("Make valid choice"); 
			choice = Integer.parseInt(IO.nextLine());
		}
		
		// Fills name in alphabetical order 
		File[] unsortedFiles = new File(directory).listFiles();
		Set<File> files = null; 
		switch (choice) {
			case 1:
				files = new TreeSet<File>(new FileNameComparator());
				break; 
			case 2: 
				// Sorts by oldest to newest modified 
				files = new TreeSet<File>(new FileDateComparator());
				break; 
			case 3: 
				files = new TreeSet<File>(new FileTypeComparator());
				break; 
			case 4: 
				files = new TreeSet<File>(new FileSizeComparator());
				break; 
		}
		
		for (File f : unsortedFiles) {
			f.renameTo(new File(directory + "/" + f.getName() + "_" + f.getName().substring(f.getName().lastIndexOf('.'))));
		} 
		
		unsortedFiles = new File(directory).listFiles();
		for (File f : unsortedFiles) {
			files.add(f); 
		} 
		
		
		// Initializes array of 0s 
		int numDigits = (int) (Math.log10(files.size()) + 1);
		// System.out.println(numDigits);
		zeroes = new String[numDigits];
		zeroes[0] = ""; 
		for (int i = 1; i < zeroes.length; i++) {
			zeroes[i] = zeroes[i - 1] + "0"; 
		}
				
		// Renames each file 
		int count = 0; 
		int numDigCount = 1;
		for (File f : files) {
			// System.out.println(f);
			// Won't rename file already exists with that name 
			System.out.println(f.renameTo(new File(directory + "/" + name + zeroes[numDigits - numDigCount] + count + f.getName().substring(f.getName().lastIndexOf('.')))));
			// f.renameTo(new File(directory + "/" + name + zeroes[numDigits - numDigCount] + count + f.getName().substring(f.getName().lastIndexOf('.'))));
			
			count++; 
			numDigCount = (int) (Math.log10(count) + 1);
		}
		
		IO.close();
	}

}
