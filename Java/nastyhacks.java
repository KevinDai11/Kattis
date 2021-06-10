import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class nastyhacks {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int r = file.nextInt();
			int e = file.nextInt();
			int c = file.nextInt();
			
			System.out.println(r==(e-c) ? "does not matter" : r>(e-c) ? "do not advertise" : "advertise");
		}
	}

	public static void main(String[] args) throws Exception {
		new nastyhacks().run();
	}

}