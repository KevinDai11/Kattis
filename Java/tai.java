import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tai {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Double> b = new ArrayList<>();
		for (int asdf = 0; asdf < times; asdf++) {
			a.add(file.nextInt());
			b.add(file.nextDouble());
		}
		double sum=0;
		for(int x=1;x<times;x++) {
			sum+=((b.get(x)+b.get(x-1))/2)*(a.get(x)-a.get(x-1))/1000;
		}
		System.out.printf("%.6f",sum);
	}

	public static void main(String[] args) throws Exception {
		new tai().run();
	}

}