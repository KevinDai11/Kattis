import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class greedpolygons {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int n = file.nextInt();
			int l = file.nextInt();
			int d = file.nextInt();
			int e = file.nextInt();
			
			double a = .25 * n * Math.pow(l, 2) * (1/Math.tan(Math.PI/n));
			System.out.println(a+n*l*d*e + (e*d)*(e*d)*Math.PI);

			
		}
	}
	


	public static void main(String[] args) throws Exception {
		new greedpolygons().run();
	}

}