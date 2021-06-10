import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class grassseed {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		double cost = file.nextDouble();
		int times = file.nextInt();
		double c=0;
		file.nextLine();
		for(int x=0;x<times;x++) {
			c+=file.nextDouble()*file.nextDouble()*cost;
			
		}
		System.out.printf("%.8f",c);
		
	}

	public static void main(String[] args) throws Exception {
		new grassseed().run();
	}

}