import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class timeloop {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		
		for (int asdf = 1; asdf <= times; asdf++) {
			System.out.println(asdf + " Abracadabra");
		}	
	}

	public static void main(String[] args) throws Exception {
		new timeloop().run();
	}

}