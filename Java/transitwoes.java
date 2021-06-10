import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class transitwoes {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int start = file.nextInt();
		int end = file.nextInt();
		int n = file.nextInt();
		
		file.nextLine();
		String[] i = file.nextLine().split(" ");
		String[] b = file.nextLine().split(" ");
		String[] come = file.nextLine().split(" ");
		for(int x=0;x<n;x++) {
			
			start+=Integer.parseInt(i[x]);
			while(start%Integer.parseInt(come[x])!=0) {
				start++;
			}
			start+=Integer.parseInt(b[x]);
		}
		start+=Integer.parseInt(i[n]);
		System.out.println(start<=end ? "yes" : "no");
	}

	public static void main(String[] args) throws Exception {
		new transitwoes().run();
	}

}