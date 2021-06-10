import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class drunkv {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String k = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String c = file.nextLine();
		String m = file.nextLine();
		String n = "";
		for(int x=0;x<c.length();x++) {
			if(x%2==0) {
			int a = k.indexOf(c.charAt(x))-k.indexOf(m.charAt(x));
			if(a<0) {
				a+=26;
			}
			n+=k.charAt(a);}
			else {
				int a = k.indexOf(c.charAt(x))+k.indexOf(m.charAt(x));
				if(a>25) {
					a-=26;
				}
				n+=k.charAt(a);
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) throws Exception {
		new drunkv().run();
	}

}