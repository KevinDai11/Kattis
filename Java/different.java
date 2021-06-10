import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class different {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNextLine()) {
			String[] a = file.nextLine().split(" ");
			long b = Long.parseLong(a[0]);
			long c = Long.parseLong(a[1]);
			System.out.println(Math.abs(b-c));
		}
	}

	public static void main(String[] args) throws Exception {
		new different().run();
	}

}