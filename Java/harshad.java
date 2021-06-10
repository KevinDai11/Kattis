import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class harshad {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		boolean a = true;
		while(a) {
			ArrayList<Integer> l = new ArrayList<>();
			int t = n;
			while(t>0) {
				l.add(t%10);
				t/=10;
			}
			
			for(int s : l) {
				t+=s;
			}
			if(n%t==0) {
				System.out.println(n);
				a=false;
			}
			else {
				n++;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new harshad().run();
	}

}