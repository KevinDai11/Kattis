import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class heliocentric {
	public void run() throws Exception {
		//Scanner file = new Scanner(new File("heliocentric.dat"));	
		Scanner file = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int c=1;
		while(file.hasNextInt()) {
			out.print("Case "+c+++": ");
			int e = file.nextInt();
			int m = file.nextInt();
			int d=0;
			while(e!=0 || m!=0) {
				e= (e+1)%365;
				m=(m+1)%687;
				d++;
			}
			out.println(d);
			
		}
		out.flush();
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new heliocentric().run();
	}

}