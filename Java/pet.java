import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pet {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int max=0;
		int m=0;
		for(int x=1;x<=5;x++) {
			String[] a= file.nextLine().split(" ");
			int sum=0;
			for(String s : a) {
				sum+=Integer.parseInt(s);
			}
			if(sum>max) {
				m=x;
				max=sum;
			}
			
		}
		System.out.println(m+ " " +max);
	}

	public static void main(String[] args) throws Exception {
		new pet().run();
	}

}