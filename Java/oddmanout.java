import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class oddmanout {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 1; asdf <= times; asdf++) {
			int n = file.nextInt();
			HashMap<Integer, Integer> a = new HashMap<>();
			for(int x=0;x<n;x++) {
				int t = file.nextInt();
				if(a.get(t)==null) {
					a.put(t, 0);
				}
				a.put(t, a.get(t)+1);
			}
			for(int i : a.keySet()) {
				if(a.get(i)==1) {
					System.out.println("Case #"+asdf+": " + i);
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new oddmanout().run();
	}

}