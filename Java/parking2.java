import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class parking2 {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int a = f.nextInt();
		int b = f.nextInt();
		int c= f.nextInt();

		ArrayList<Integer> one = new ArrayList<>();
		ArrayList<Integer> two = new ArrayList<>();
		ArrayList<Integer> three = new ArrayList<>();
		int low =Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int arr = f.nextInt();
		int dep = f.nextInt();
		low=Math.min(low, arr);
		max = Math.max(max,dep);
		for(int x=arr;x<dep;x++) {
			one.add(x);
		}
		arr = f.nextInt();
		dep = f.nextInt();
		low=Math.min(low, arr);
		max = Math.max(max,dep);
		for(int x=arr;x<dep;x++) {
			two.add(x);
		}
		arr = f.nextInt();
		dep = f.nextInt();
		low=Math.min(low, arr);
		max = Math.max(max,dep);
		for(int x=arr;x<dep;x++) {
			three.add(x);
		}

		int sum =0;
		for(int x = low;x<max;x++) {
			int g= 0;
			if(one.contains(x)) {
				g++;
			}
			if(two.contains(x)) {
				g++;
			}
			if(three.contains(x)) {
				g++;
			}
			if(g==1) {
				sum+=a;
			}
			else if(g==2) {
				sum+=b*2;
			}else if(g==3){
				sum+=c*3;
			}
		
		}
		out.print(sum);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new parking2().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("parking2.dat")));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}