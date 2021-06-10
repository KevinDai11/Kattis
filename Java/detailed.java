import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class detailed {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String[] a = file.nextLine().split("");
			String[] b = file.nextLine().split("");
			String s="";
			for(int x=0;x<a.length;x++) {
				if(a[x].equals(b[x])) {
					s+=".";
				}else {
					s+="*";
				}
			}
			System.out.println(Arrays.toString(a).replaceAll("[\\[,\\] ]", ""));
			System.out.println(Arrays.toString(b).replaceAll("[\\[,\\] ]", ""));
			System.out.println(s);
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		new detailed().run();
	}

}