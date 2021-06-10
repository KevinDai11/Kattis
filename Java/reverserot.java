import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class reverserot {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String stuff = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		while(file.hasNextLine()) {
			int a = file.nextInt();
			
			if(a==0) {
				break;
			}
			String s = file.next();
			file.nextLine();
			
			String n="";
			for(int x=0;x<s.length();x++) {
				if(stuff.indexOf(s.substring(x,x+1))+a>=stuff.length()) {
					n+=stuff.charAt((stuff.indexOf(s.substring(x,x+1))+a)-stuff.length());
					
				}else {
					n+=stuff.charAt(stuff.indexOf(s.substring(x,x+1))+a);
				}
				
			}
			StringBuilder asd= new StringBuilder();
			asd.append(n);
			asd.reverse();
			System.out.println(asd);
			
		}
	}

	public static void main(String[] args) throws Exception {
		new reverserot().run();
	}

}