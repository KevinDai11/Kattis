import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sibice {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		int w = file.nextInt();
		int h = file.nextInt();
		int x = (int) Math.sqrt(w*w + h*h);
		file.nextLine();
		
		for (int asdf = 0; asdf < times; asdf++) {
			int a = file.nextInt();
			if(a<=x) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new sibice().run();
	}

}