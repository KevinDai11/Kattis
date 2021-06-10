import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class janitor {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int s1= file.nextInt();
		int s2=file.nextInt();
		int s3 = file.nextInt();
		int s4=file.nextInt();
		
		double s = (s1+s2+s3+s4)/2.0;
		
		double a = Math.sqrt(((s-s1)*(s-s2)*(s-s3)*(s-s4))-(s1*s2*s3*s4)*(Math.pow(Math.cos(Math.toRadians(180)/2), 2)));
		System.out.println(a);
	}

	public static void main(String[] args) throws Exception {
		new janitor().run();
	}

}