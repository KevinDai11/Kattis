import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class qaly {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		double sum = 0;
		for (int asdf = 0; asdf < times; asdf++) {
			double a = file.nextDouble();
			double b = file.nextDouble();
			sum+=a*b;
		}
		System.out.printf("%.3f",sum);
	}

	public static void main(String[] args) throws Exception {
		new qaly().run();
	}

}