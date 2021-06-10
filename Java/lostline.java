import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class lostline {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		System.out.print(1+" ");
		int[] a = new int[n-1];
		for(int x=1;x<=n-1;x++) {
			a[file.nextInt()] = x+1;
		}
		for(int s : a) {
			System.out.print(s+" ");
		}
		
	}

	public static void main(String[] args) throws Exception {
		new lostline().run();
	}

}