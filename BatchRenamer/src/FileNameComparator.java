import java.io.File;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class FileNameComparator implements Comparator<File>{
	@Override
	public int compare(File f1, File f2) {
		return f1.getName().compareTo(f2.getName()); 
	}
	
	public static void main(String[] args) {
		Set<File> s = new TreeSet<File>(new FileNameComparator()); 
		File f1 = new File("99993"); 
		File f2 = new File("bye"); 
		File f3 = new File("ciao"); 
		s.add(f1); 
		s.add(f2);
		s.add(f3); 
		for (File f : s) {
			System.out.println(f);
		}
	}
}
