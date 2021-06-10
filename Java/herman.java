import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class herman {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		double r = file.nextInt();
		System.out.printf("%.6f%n",Math.PI*r*r);
		System.out.printf("%.6f",r*r*2);
	}

	public static void main(String[] args) throws Exception {
		new herman().run();
	}

}