import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class vauvau {
	static int a;
	static int b;
	static int c;
	static int d;
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		 a = f.nextInt();
		 b = f.nextInt();
		 c= f.nextInt();
		 d = f.nextInt();
		
		int p=f.nextInt();
		int m=f.nextInt();
		int g=f.nextInt();
		out.println(dog(p)==0 ? "none" : dog(p)==1 ? "one" :"both");
		out.println(dog(m)==0 ? "none" : dog(m)==1 ? "one" :"both");
		out.println(dog(g)==0 ? "none" : dog(g)==1 ? "one" :"both");
		
		out.flush();
	}
	public static int dog(int n) {
		int s =0;
		if(n%(a+b)!=0 && n%(a+b)<=a) {
			s++;
		}
		if(n%(c+d)!=0 && n%(c+d)<=c) {
			s++;
		}
		return s;
	}
	public static void main(String[] args) throws Exception {
		new vauvau().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("vauvau.dat")));
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