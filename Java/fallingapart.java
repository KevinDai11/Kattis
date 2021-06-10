import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class fallingapart {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Integer> a = new ArrayList<>();
		int n = f.nextInt();
		while(n-->0) {
			a.add(f.nextInt());
		}
		Collections.sort(a);
		Collections.reverse(a);
		int c =0;
		int b =0;
		for(int x=0;x<a.size();x+=2) {
			c+=a.get(x);
			if(x<a.size()-1)
			b+=a.get(x+1);
		}
		out.print(c+" " + b);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new fallingapart().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("fallingapart.dat")));
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