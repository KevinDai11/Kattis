import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ICPC {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		ArrayList<String> a = new ArrayList<>();
		int c = 12;
		for (int asdf = 0; asdf < times; asdf++) {
			String[] s = file.nextLine().trim().split(" ");
			if(c==0) {
				break;
			}
			if(!a.contains(s[0])) {
				System.out.println(s[0]+" " +s[1]);
				a.add(s[0]);
				c--;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new ICPC().run();
	}

}