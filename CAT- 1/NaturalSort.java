import java.util.*;

public class NaturalSort
{
    static class NaturalSortOrder implements Comparator<String> {
        public int compare(String a, String b) {
            int i1 = 0, i2 = 0;
            int l1 = a.length(), l2 = b.length();
            while(i1 < l1 && i2 < l2) {
                char c1 = a.charAt(i1), c2 = b.charAt(i2);
                if(Character.isDigit(c1) && Character.isDigit(c2)) {
                    int sum1 = 0, sum2 = 0;
                    while(Character.isDigit(c1)) {
                        sum1 = sum1*10+(c1-'0');
                        i1+=1;
                        if(i1 < l1) {
                            c1 = a.charAt(i1);
                        } else break;
                    }
                    while(Character.isDigit(c2)) {
                        sum2 = sum2*10+(c2-'0');
                        i2+=1;
                        if(i2 < l2) {
                            c2 = b.charAt(i2);
                        } else break;
                    }
                    int res = Integer.compare(sum1, sum2);
                    if(res != 0) return res;
                }
                else {
                    int res = Character.compare(c1, c2);
                    if(res != 0) return res;
                    i1+=1;
                    i2+=1;
                }
            }
            return Integer.compare(l1, l2);
        }
    }
	public static void main(String[] args) {
		List<String> res = new ArrayList<>();
		res.add("file1");
		res.add("file10");
		res.add("file2");
		Collections.sort(res, new NaturalSortOrder());
		res.forEach(s -> System.out.print(s+" "));
	}
}