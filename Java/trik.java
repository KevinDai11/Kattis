import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class trik {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
	
		int[] a = new int[3];
		a[0]=1;
		String[] s = file.nextLine().split("");
		for(int x=0;x<s.length;x++) {
			switch(s[x]) {
			case "A":{
				int t=a[0];
				a[0]=a[1];
				a[1]=t;
				break;}
			case "B": {
				int t=a[2];
				a[2]=a[1];
				a[1]=t;
				break;}
			case "C":{
				int t=a[0];
				a[0]=a[2];
				a[2]=t;
				break;
				}
			}
		}
		for(int x=0;x<3;x++) {
			if(a[x]==1) {
				System.out.println(x+1);
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new trik().run();
	}

}