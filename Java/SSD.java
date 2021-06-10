import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class SSD {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("SSD.dat"));
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 1; asdf <= times; asdf++) {
			int k =file.nextInt();
			int b=  file.nextInt();
			int n = file.nextInt();
			int sum=0;
		      while (n > 0) {
	                int dig = (int) n % b;
	                sum += dig * dig;
	                n = (n - dig) / b;
	            }System.out.println(k+" "+sum);
					}
				
			
			
		}
	

	public static void main(String[] args) throws Exception {
		new SSD().run();
	}

}