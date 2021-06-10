import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class school {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		ArrayList<Double> a = new ArrayList<>();

		for (int asdf = 0; asdf < times; asdf++) {
			a.add(file.nextDouble());
		}
		
		System.out.println(calc(a));
		double avg =0;
		for(int x=0;x<a.size();x++) {
			ArrayList<Double> t = (ArrayList<Double>) a.clone();
			t.remove(x);
			avg+=calc(t);
		}
		System.out.println(avg/a.size());
		
	}
	public static double calc(ArrayList<Double> a ) {
		double sum=0;
		for(int x=0;x<a.size();x++) {
			sum+=a.get(x)*Math.pow(.8, x);
		}
		sum/=5;
		return sum;
	}

	public static void main(String[] args) throws Exception {
		new school().run();
	}

}