import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class isithalloween {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		String s = file.next();
		int a = file.nextInt();
		System.out.println(s.equals("DEC") ? a==25 ? "yup" : "nope" : s.equals("OCT") ? a==31 ? "yup" : "nope" : "nope");
	}

	public static void main(String[] args) throws Exception {
		new isithalloween().run();
	}

}