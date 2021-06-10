import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tarifa {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int x = file.nextInt();
		file.nextLine();
		int times = file.nextInt();
		file.nextLine();
		int xs=x*times;
		int c = 0;
		for (int asdf = 0; asdf < times; asdf++) {
			c+=file.nextInt();
			
		}
		System.out.println(xs-c+x);
	}

	public static void main(String[] args) throws Exception {
		new tarifa().run();
	}

}