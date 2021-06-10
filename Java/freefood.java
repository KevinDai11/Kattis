import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class freefood {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		HashSet<Integer> a = new HashSet<>();
		for (int asdf = 0; asdf < times; asdf++) {
			int b = file.nextInt();
			int c = file.nextInt();
			for(int x=b;x<=c;x++) {
				a.add(x);
			}
		}
		System.out.println(a.size());
	}

	public static void main(String[] args) throws Exception {
		new freefood().run();
	}

}