import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class lastfactorialdigit {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
				int a = file.nextInt();
			
				int sum =1;
				for(int x=1;x<=a;x++) {
					sum*=x;
				}
				while(sum>=10) {	
						sum%=10;
				}
				System.out.println(sum);
		}
	}

	public static void main(String[] args) throws Exception {
		new lastfactorialdigit().run();
	}

}