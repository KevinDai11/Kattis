import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class daringdoubt {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int d = f.nextInt();
		int c = f.nextInt();
		int m =f.nextInt();
		int t=0;
		ArrayList<Integer> dl = new ArrayList<>();
		ArrayList<Integer> cl = new ArrayList<>();
		for(int x=1;x<=d;x++) {
			dl.add(f.nextInt());
		}
		for(int x=1;x<=c;x++) {
			cl.add(f.nextInt());
		}
		if(c<d) {
			for(int x=0;x<c;x++) {
				if(dl.contains(cl.get(x))) {
					t++;
				}
			}
		}
		else {
			for(int x=0;x<d;x++) {
				if(cl.contains(dl.get(x))) {
					t++;
				}
			}
		}
		out.print(t);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new daringdoubt().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("daringdoubt.dat")));
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