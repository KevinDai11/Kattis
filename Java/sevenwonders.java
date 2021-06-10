import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sevenwonders {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String[] a = file.nextLine().split("");
		int t=0;
		int c=0;
		int g=0;
		for(int x=0;x<a.length;x++) {
			switch(a[x]) {
			case "T":{
				t++;break;
			}
			case "C": {c++; break;}
			case "G": g++; break;
			}
			
		}
		
		int sum = t*t + c*c+g*g ;
	
		sum += 7*Math.min(Math.min(t,g), c);
		
		System.out.println(sum);
	}

	public static void main(String[] args) throws Exception {
		new sevenwonders().run();
	}

}