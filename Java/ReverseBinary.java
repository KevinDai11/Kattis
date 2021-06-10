import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ReverseBinary {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int s = file.nextInt();
		
		StringBuffer a = new StringBuffer(Integer.toBinaryString(s));
		a.reverse();
		s = Integer.parseInt(a.toString(),2);
		
		System.out.println(s);
		
	}

	public static void main(String[] args) throws Exception {
		new ReverseBinary().run();
	}

}