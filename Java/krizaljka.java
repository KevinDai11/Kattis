import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class krizaljka {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String a = f.next();
		String b = f.next();
		int r =-1;
		int c =-1;
		for(int x=0;x<a.length();x++) {
			for(int y= 0;y<b.length();y++) {
				if(b.charAt(y)==a.charAt(x)) {
					r=y;
					c=x;
					break;
				}
			}
			if(r!=-1 && c!=-1) {
				break;
			}
			
		}
		for(int x=0;x<b.length();x++) {
			for(int y=0;y<a.length();y++) {
				if(y==c) {
					out.print(b.charAt(x));
				}
				else if(x==r) {
					out.print(a.charAt(y));
				}else {
					out.print(".");
				}
			}
			out.println();
		}
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new krizaljka().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("krizaljka.dat")));
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