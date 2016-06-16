import java.io.File;
import java.util.Comparator;

public class FileSizeComparator implements Comparator<File>{
	@Override
	public int compare(File f1, File f2) {
		if (f1.length() - f2.length() < 0) {
			return -1; 
		} else if (f1.length() - f2.length() > 0) {
			return 1; 
		} else {
			return f1.getName().compareTo(f2.getName());		
		}
	}
}
