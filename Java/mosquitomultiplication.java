import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class mosquitomultiplication {
	public void run() throws Exception {
		//Scanner file = new Scanner(new File("mosquitomultiplication.dat"));	
		Scanner file = new Scanner(System.in);
		while(file.hasNextInt()) {
			int m = file.nextInt();
			int p = file.nextInt();
			int l = file.nextInt();
			int e = file.nextInt();
			int r =file.nextInt();
			int s = file.nextInt();
			int n = file.nextInt();
			
			while(n-->0) {
				int t = p;
				p=l/r;
				l=e*m;
				m=t/s;
			}
			System.out.println(m);
		}
	}

	public static void main(String[] args) throws Exception {
		new mosquitomultiplication().run();
	}

}