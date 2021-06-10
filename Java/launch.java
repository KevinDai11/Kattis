import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class launch {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		int min=Integer.MAX_VALUE;
		int[] a = new int[times];
		for (int asdf = 0; asdf < times; asdf++) {
			a[asdf]=file.nextInt();
			min=Math.min(min, a[asdf]);
		}
		for(int x=0;x<a.length;x++) {
			if(min==a[x]) {
				System.out.println(x);
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new launch().run();
	}

}