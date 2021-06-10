import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class StackingCups {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		TreeMap<Integer, String> m=new TreeMap<>();
		for (int asdf = 0; asdf < times; asdf++) {
			String[] s = file.nextLine().split(" ");
			int r = 0;
			String c="";
			if(Character.isDigit(s[0].charAt(0))) {
				r=Integer.parseInt(s[0])/2;
				c=s[1];
			}
			else {
				r=Integer.parseInt(s[1]);
				c=s[0];
			}
			
			m.put(r, c);
		}
		for(int a : m.keySet()) {
			System.out.println(m.get(a));
		}
	}

	public static void main(String[] args) throws Exception {
		new StackingCups().run();
	}

}