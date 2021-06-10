import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class permutedasequence {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		while(n-->0) {
			int s = f.nextInt();
			ArrayList<Integer> al = new ArrayList<>();
			for(int x=0;x<s;x++) {
				al.add(f.nextInt());
			}
			boolean b = true;
			int d = al.get(1)-al.get(0);
			for(int x=1;x<s;x+=1) {
				if(al.get(x)-al.get(x-1)!=d) {
					b=false;
					break;
				}
			}
			if(!b) {
				b=true;
				Collections.sort(al);
				d=al.get(1)-al.get(0);
				for(int x=1;x<s;x+=1) {
					if(Math.abs(al.get(x)-al.get(x-1))!=d) {
						b=false;
						break;
					}
				}
				out.println(b?"permuted arithmetic":"non-arithmetic");
			}
			else {
				out.println("arithmetic");
			}
			}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new permutedasequence().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("permutedasequence.dat")));
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