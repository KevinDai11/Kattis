import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cannonball {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			double vi=file.nextDouble();
			double angle = file.nextDouble()*Math.PI/180;
			double x=file.nextDouble();
			double h1=file.nextDouble();
			double h2=file.nextDouble();
			double time = x/(vi*Math.cos(angle));
			double h3=vi*Math.sin(angle)*time - .5*9.81*time*time;
			System.out.println(h3-h1>=1 && h2-h3>=1 ? "Safe" : "Not Safe");
		}
	}

	public static void main(String[] args) throws Exception {
		new cannonball().run();
	}

}