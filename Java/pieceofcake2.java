import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pieceofcake2 {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		int h = file.nextInt();
		int v = file.nextInt();
		int one = h*v*4;
		int two = (n-h)*v*4;
		int three = (n-h)*(n-v)*4;
		int four = h*(n-v)*4;
		int ret = Integer.max(one, two);
		ret = Integer.max(ret, three);
		ret = Integer.max(ret, four);
		System.out.println(ret);
	}

	public static void main(String[] args) throws Exception {
		new pieceofcake2().run();
	}

}