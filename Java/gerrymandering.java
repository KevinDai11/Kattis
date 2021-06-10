import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class gerrymandering {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		int nums = file.nextInt();
		TreeMap<Integer, int[]> m = new TreeMap<>();
		file.nextLine();
		double v=0;
		for (int asdf = 0; asdf < times; asdf++) {
			int c = file.nextInt();
			int a = file.nextInt();
			int b = file.nextInt();
			v+=a+b;
			if(m.get(c)==null) {
				m.put(c, new int[2]);
			}
			m.get(c)[0]+= a;
			m.get(c)[1]+=b;
		}
		int wa=0;
		int wb=0;
		for(int c: m.keySet()) {
			int a = m.get(c)[0];
			int b = m.get(c)[1];
			if(a>b) {
				System.out.print("A "+ (a-((a+b)/2+1))+" " + b);
				wa+=a-((a+b)/2+1);
				wb+=b;
				
			}else {
				System.out.print("B "+ a+" " +(b-((a+b)/2+1)));
				wa+=a;
				wb+=b-((a+b)/2+1);
			}
			System.out.println();
		}
		
		System.out.printf("%.10f",Math.abs(wa-wb)/v);
	}

	public static void main(String[] args) throws Exception {
		new gerrymandering().run();
	}

}