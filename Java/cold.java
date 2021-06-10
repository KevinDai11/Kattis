import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cold {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		int count =0;
		for (int asdf = 0; asdf < times; asdf++) {
			int a = file.nextInt();
			if(a<0)
				count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		new cold().run();
	}

}