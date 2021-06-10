import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class spam {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String s = file.nextLine().trim();
		double ws = 0;
		double l =0;
		double u = 0;
		double o =0;
		for(int x=0;x<s.length();x++) {
			if(s.charAt(x)=='_') {
				ws++;
			}
			else if(Character.isAlphabetic(s.charAt(x))){
				if(Character.isLowerCase(s.charAt(x))){
				l++;
				}else {
					u++;
				}
			}
			else{
				o++;
			}
		}
		System.out.printf("%.16f%n",ws/s.length());
		System.out.printf("%.15f%n",l/s.length());
		System.out.printf("%.15f%n",u/s.length());
		System.out.printf("%.16f%n",o/s.length());
	}

	public static void main(String[] args) throws Exception {
		new spam().run();
	}

}