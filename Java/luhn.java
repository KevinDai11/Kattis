import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class luhn {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String[] a = file.nextLine().split("");
			int[] b = new int[a.length];
			for(int x=0;x<a.length;x++) {
				b[x]=Integer.parseInt(a[x]);
			}
			int sum=0;
			for(int x=b.length-2;x>=0;x-=2) {
				b[x]*=2;
				if(b[x]>9) {
					int t = 0;
					int n = b[x];
					while(n>0) {
						t+=n%10;
						n/=10;
					}
					b[x]=t;
				}
				
			}
			for(int x=0;x<b.length;x++) {
				sum+=b[x];
			}
		
			
			
			System.out.println(sum%10==0 ? "PASS" : "FAIL");
		}
	}

	public static void main(String[] args) throws Exception {
		new luhn().run();
	}

}