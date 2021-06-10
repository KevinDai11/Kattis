import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class chanukah {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int k=file.nextInt();
			int d=file.nextInt();
			int t=d;
			for(int x=1;x<=d;x++) {
				t+=x;
			}
			System.out.println(k+" " + t);
			
		}
	}

	public static void main(String[] args) throws Exception {
		new chanukah().run();
	}

}