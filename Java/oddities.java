import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class oddities {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int a = file.nextInt();
			System.out.println(a%2==0 ? a+" is even" : a+" is odd");
		}
	}

	public static void main(String[] args) throws Exception {
		new oddities().run();
	}

}