import java.io.File;
import java.util.Comparator;

public class FileDateComparator implements Comparator<File> {
	@Override
	public int compare(File f1, File f2) {
		if (f1.lastModified() - f2.lastModified() < 0) {
			return -1; 
		} else if (f1.lastModified() - f2.lastModified() > 0) {
			return 1; 
		} else {
			return 0;		
		}
	}
}
