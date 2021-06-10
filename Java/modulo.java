import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class modulo {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = 10;
		HashSet<Integer> a = new HashSet<Integer>();

		for (int asdf = 0; asdf < times; asdf++) {
			a.add(file.nextInt()%42);
		}
		System.out.println(a.size());
	}

	public static void main(String[] args) throws Exception {
		new modulo().run();
	}

}