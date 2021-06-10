import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class beaverknaw {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNextLine()) {
			String[] c = file.nextLine().split(" ");
			int a= Integer.parseInt(c[0]);
			int b = Integer.parseInt(c[1]);
			if(a==0 && b==0) {
				break;
			}
			System.out.println(Math.cbrt( (((-6) * b) / Math.PI) + (a*a*a)));
		}
	}

	public static void main(String[] args) throws Exception {
		new beaverknaw().run();
	}

}