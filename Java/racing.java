import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class racing {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		String t = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
		for (int asdf = 0; asdf < times; asdf++) {
			String s = file.nextLine();
			double seconds = 1;
			for(int x=1;x<s.length();x++) {
			
				int o = Math.abs(t.indexOf(s.substring(x,x+1))-t.indexOf(s.substring(x-1,x)));
				int j=0;
				if(t.indexOf(s.substring(x,x+1))>t.indexOf(s.substring(x-1,x))) {
						j = t.indexOf(s.substring(x-1,x))+(t.length()-t.indexOf(s.substring(x,x+1)));
				}else {
					j=t.indexOf(s.substring(x,x+1))+(t.length()-t.indexOf(s.substring(x-1,x)));
				}
				double a=Math.min(o,j);

				a*=60.0*Math.PI/28.0/15.0;
				
				seconds+=a+1;
				
		}
			System.out.printf("%.10f%n",seconds);
	}
}

	public static void main(String[] args) throws Exception {
		new racing().run();
	}

}