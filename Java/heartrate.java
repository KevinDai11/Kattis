import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class heartrate {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			double b= file.nextInt();
			double p = file.nextDouble();
			double a = 60/p;
			double bpm = a*b;
			System.out.printf("%.4f %.4f %.4f %n",bpm-a,bpm,bpm+a);
			
		}
	}

	public static void main(String[] args) throws Exception {
		new heartrate().run();
	}

}