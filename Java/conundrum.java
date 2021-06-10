import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class conundrum {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String s = file.nextLine();
		int t =0;
		
		for(int x=0;x<s.length();x+=3) {
			if(s.charAt(x)!='P') {
				t++;
			}
			if(s.charAt(x+1)!='E') {
				t++;
			}
			if(s.charAt(x+2)!='R') {
				t++;
			}
		}
		System.out.println(t);
	}

	public static void main(String[] args) throws Exception {
		new conundrum().run();
	}

}