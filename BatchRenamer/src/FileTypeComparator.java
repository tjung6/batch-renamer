import java.io.File;
import java.util.Comparator;

public class FileTypeComparator implements Comparator<File> {
	@Override
	public int compare(File f1, File f2) {
		String s1 = f1.getName().substring(f1.getName().lastIndexOf('.'));
		String s2 = f2.getName().substring(f2.getName().lastIndexOf('.'));
		if (s1.compareTo(s2) == 0) { 
			return f1.getName().compareTo(f2.getName());  
		} else {
			return s1.compareTo(s2); 
		}			
	}
}
