import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class dicecup {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int one = file.nextInt();
		int two = file.nextInt();
		
		
		
		if(one<two)
		{
		for (int asdf = one+1; asdf <= (two+1); asdf++) {
			System.out.println(asdf);

		}
		}
		
		if(one>=two)
		{
		for (int asdf = two+1; asdf <= (one+1); asdf++) {
			System.out.println(asdf);

		}
		}
		
	}

	public static void main(String[] args) throws Exception {
		new dicecup().run();
	}

}