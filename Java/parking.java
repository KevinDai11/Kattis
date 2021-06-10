import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class parking {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int n=file.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			int sum=0;
			int max =Integer.MIN_VALUE;
			int min =Integer.MAX_VALUE;
			for(int x=0;x<n;x++) {
				a.add(file.nextInt());
				sum+=a.get(x);
				max=Math.max(max, a.get(x));
				min=Math.min(min, a.get(x));
			}
			int p = Math.round(sum/n);
			System.out.println((max-min)+(max-p)+(p-min));
		}
	}

	public static void main(String[] args) throws Exception {
		new parking().run();
	}

}