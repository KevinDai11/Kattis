import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class simon {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String s = file.nextLine();
			if(s.contains("Simon says")) {
				System.out.println(s.substring(10));
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new simon().run();
	}

}