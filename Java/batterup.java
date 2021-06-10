import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class batterup {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		double sum =0;
		int count=0;
		for (int asdf = 0; asdf < times; asdf++) {
			int c= file.nextInt();
			if(c>=0) {
				sum+=c;
				count++;
			}
		}
		
		System.out.println(sum/count);
	}

	public static void main(String[] args) throws Exception {
		new batterup().run();
	}

}