import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class star {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int s = file.nextInt();
		System.out.println(s+":");
		for(int x=2;x<s;x++) {
			int y= x-1;
			int t = 0;
			while(t<s) {
				t+=x;
				if(t==s) {
					System.out.println(x+","+y);break;
				}
				t+=y;
				if(t==s) {
					System.out.println(x+","+y);break;
				}
			}
			y++;
			t=0;
			while(t<s) {
				t+=x;
				if(t==s) {
					System.out.println(x+","+y);break;
				}
				t+=y;
				if(t==s) {
					System.out.println(x+","+y);break;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new star().run();
	}

}