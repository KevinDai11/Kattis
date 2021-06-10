import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class apaxia {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String s = file.nextLine();
		String t = "";
		for(int x=0;x<s.length()-1;x++) {
			if(s.charAt(x)!=s.charAt(x+1)) {
				t+=s.charAt(x);
			}
		}
		t+=s.charAt(s.length()-1);
		System.out.println(t);
	}

	public static void main(String[] args) throws Exception {
		new apaxia().run();
	}

}