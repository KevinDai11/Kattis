import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pervasiveheartmonitor {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNextLine()) {
			String[] s = file.nextLine().split(" ");
			double sum=0;
			int c=0;
			String n = "";
			for(int x=0;x<s.length;x++) {
				if(Character.isAlphabetic(s[x].charAt(0))){
					n+=s[x]+" ";
				}
				else {
					c++;
					sum+=Double.parseDouble(s[x]);
				}
			}
			out.printf("%.6f %s",sum/c,n);
		}
	}

	public static void main(String[] args) throws Exception {
		new pervasiveheartmonitor().run();
	}

}