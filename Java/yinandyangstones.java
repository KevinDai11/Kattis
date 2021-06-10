import java.util.*;
public class yinandyangstones {
	public static void main(String args[]) {
		Scanner f = new Scanner(System.in);
		String[] s = f.nextLine().split("");
		Arrays.sort(s);
		String b = s[s.length/2-1];
		String w = s[s.length/2];
		if(b.equals("B") && w.equals("W")) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		
	}
}
