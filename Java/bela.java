import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class bela {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		String d= file.next();
		file.nextLine();
		int c=0;
		for (int asdf = 0; asdf < times*4; asdf++) {
			String[] a = file.nextLine().split("");
			if(a[1].equals(d)) {
				if(a[0].equals("A")) {
					c+=11;
				}
				else 	if(a[0].equals("K")) {
					c+=4;
				}
				else if(a[0].equals("Q")) {
					c+=3;
				}
				else if(a[0].equals("J")) {
					c+=20;
				}
				else	if(a[0].equals("T")) {
					c+=10;
				}
				else if(a[0].equals("9")) {
					c+=14;
				}else {
					continue;
				}
			}else {
				if(a[0].equals("A")) {
					c+=11;
				}
				else 	if(a[0].equals("K")) {
					c+=4;
				}
				else if(a[0].equals("Q")) {
					c+=3;
				}
				else if(a[0].equals("J")) {
					c+=2;
				}
				else	if(a[0].equals("T")) {
					c+=10;
				}
				else {
					continue;
				}
			}
		}System.out.println(c);
	}

	public static void main(String[] args) throws Exception {
		new bela().run();
	}

}