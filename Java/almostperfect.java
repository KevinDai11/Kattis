import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class almostperfect {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNext()) {
			int n = file.nextInt();
	
			int a =0;
			for(int x=1;x<n;x++) {
				if(n%x==0) {
					a+=x;
				}
			}
			System.out.println(a==n ? n+" perfect" : Math.abs(a-n)<=2 ? n+" almost perfect" : n+" not perfect");
			
		}
	}

	public static void main(String[] args) throws Exception {
		new almostperfect().run();
	}

}