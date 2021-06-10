import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class synchronizing {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(true) {
			int n = file.nextInt();
			if(n==0) {
				break;
			}
			ArrayList<Integer> a = new ArrayList<>();
			int[] ab = new int[n];
			ArrayList<Integer> b= new ArrayList<>();
			for(int x=0;x<n;x++) {
				a.add(file.nextInt());
				ab[x]=a.get(x);
			}
			for(int x=0;x<n;x++) {
				b.add(file.nextInt());
				
			}
			Collections.sort(a);
			Collections.sort(b);
			HashMap<Integer, Integer> m = new HashMap<>();
			for(int x=0;x<n;x++) {
				m.put(a.get(x), b.get(x));
			}
			for(int i : ab) {
				System.out.println(m.get(i));
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) throws Exception {
		new synchronizing().run();
	}

}