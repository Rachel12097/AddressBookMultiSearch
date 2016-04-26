import java.util.Comparator;
public class FirstName  implements Comparator<Object>{
	public int compare(Object c1, Object c2) {
		ABItem s1 = (ABItem) c1;
		ABItem s2 = (ABItem) c2;
		return s1.firstName.compareTo(s2.firstName);
	}
}
