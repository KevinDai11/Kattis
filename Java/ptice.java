import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ptice {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		String s = file.nextLine();
		String[] seq= {"ABC", "BABC","CCAABB"};
		int[] a = new int[3];
		for(int x=0;x<times;x++) {
			char c = s.charAt(x);
			for(int y=0;y<3;y++) {
				if(c==seq[y].charAt(x%seq[y].length())) {
					a[y]++;
				}
			}
		}
		int max=0;
		for(int x=0;x<3;x++) {
			max=Math.max(max, a[x]);
		}
		System.out.println(max);
		for(int x=0;x<3;x++) {
			if(max==a[x]) {{
				if(x==0) {
					System.out.println("Adrian");
				}
				else if(x==1) {
					System.out.println("Bruno");
				}
				else {
					System.out.println("Goran");
				}
				}
			}
		}
		
	}

	public static void main(String[] args) throws Exception {
		new ptice().run();
	}

}