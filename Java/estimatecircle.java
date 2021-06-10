import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class estimatecircle {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(true) {
			double r = file.nextDouble();
			int m = file.nextInt();
			int c = file.nextInt();
			
			if(r==0 && c==0 &&m==0) {
				break;
			}
			System.out.println(Math.PI *Math.pow(r, 2) + " " + Math.pow(r*2, 2)*c/m);
		}
	}

	public static void main(String[] args) throws Exception {
		new estimatecircle().run();
	}

}