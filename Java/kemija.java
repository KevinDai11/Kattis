import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kemija {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String s = file.nextLine();
		String ret = "";
		for(int x=0;x<s.length();x++) {
			if(s.charAt(x)=='a' ||s.charAt(x)=='e'|| s.charAt(x)=='i' || s.charAt(x)=='o' || s.charAt(x)=='u') {
				x+=2;
			
				
			}
			ret+=s.charAt(x);
		}
		System.out.println(ret.trim());
	}

	public static void main(String[] args) throws Exception {
		new kemija().run();
	}

}