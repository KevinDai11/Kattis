import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class halfacooki {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);	
		//Scanner file = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(file.hasNextDouble()) {
			double r = file.nextDouble();
			double x = file.nextDouble();
			double y = file.nextDouble();
			if((x*x+y*y)>=r*r) {
				out.println("miss");
			}
			else{
				double d = Math.sqrt(x*x+y*y);
				double h = r-d;
				double s = r*r*Math.acos((r-h)/r)-(r-h)*Math.sqrt(2*r*h-h*h);
				double c = Math.PI*r*r;
				double a = c-s;
				out.println(a<s ? s+" "+a:a+" "+s);
			}
		}
		out.flush();
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new halfacooki().run();
	}

}