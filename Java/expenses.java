import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class expenses {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		int sum =0;
		for (int asdf = 0; asdf < times; asdf++) {
			int b = file.nextInt();
			if(b<0) {
				sum-=b;
			}
		}
		System.out.println(Math.abs(sum));
	}

	public static void main(String[] args) throws Exception {
		new expenses().run();
	}

}