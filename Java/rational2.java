import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class rational2 {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int times = f.nextInt();
		for(int x=0;x<times;x++) {
			String[] s = f.nextLine().split("[ /]");
			int k = Integer.parseInt(s[0]);
			int n = Integer.parseInt(s[1]);
			int d =Integer.parseInt(s[2]);
			
			P c= new P(n,d);
			LinkedList<P> a = new LinkedList<>();
			while(c.n!=1 || c.d!=1) {
				a.addFirst(new P(c.n,c.d));
				if(c.n>c.d) {
					c.n-=c.d;
				}else {
					c.d-=c.n;
				}
			}
			int count =1;
			while(!a.isEmpty()) {
				count*=2;
				P t = a.poll();
				if(t.n>t.d) {
					count++;
				}
			}
			out.println(k+" "+count);
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new rational2().run();
	}
	static class P{
		int n;
		int d;
		public P(int a, int b) {
			n=a;
			d=b;
		}
	}
	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("rationalsequence2.dat")));
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