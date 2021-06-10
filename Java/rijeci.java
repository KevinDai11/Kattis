import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class rijeci {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("rijeci.dat"));
		int times = file.nextInt();
		int a =1;
		int b =0;
		for(int x=0;x<times;x++) {
			int t = b;
			b=a;
			a=t+b;
		}
		System.out.println(a-b+" " +b);
	}

	public static void main(String[] args) throws Exception {
		new rijeci().run();
	}

}