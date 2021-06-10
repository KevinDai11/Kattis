import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tripletexting {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String s = file.nextLine();
		int c= s.length()/3;
		String one = s.substring(0,c);
		String two=s.substring(c,c*2);
		String three =s.substring(c*2);
		System.out.println(one.equals(two)?one:one.equals(three)?one :two);
	}

	public static void main(String[] args) throws Exception {
		new tripletexting().run();
	}

}