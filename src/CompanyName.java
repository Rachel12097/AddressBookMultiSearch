import java.util.Comparator;
public class CompanyName implements Comparator<Object>{
	public int compare(Object c1, Object c2) {
		ABItem s1 = (ABItem) c1;
		ABItem s2 = (ABItem) c2;
		return s1.companyName.compareTo(s2.companyName);
	}
}